package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    private BalanceValidator balanceValidator;
    private FraudValidator fraudValidator;
    private LimitTransactionValidator limitValidator;
    private PaymentService service;

    @BeforeEach
    void setUp() {
        balanceValidator = new BalanceValidator();
        fraudValidator = new FraudValidator();
        limitValidator = new LimitTransactionValidator();

        balanceValidator.setNext(fraudValidator);
        fraudValidator.setNext(limitValidator);

        PaypalAdaptor paypalAdaptor = new PaypalAdaptor(new PaypalApi("clientId123"));
        service = new PaymentService(paypalAdaptor, balanceValidator);
    }


    @Test
    void testPagoExitosoTodasLasValidacionesPasan() {
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertTrue(balanceValidator.handle(request));
    }

    @Test
    void testSaldoInsuficienteRechazaPago() {
        PaymentRequest request = new PaymentRequest(1000.0, 500.0, 3);
        assertFalse(balanceValidator.handle(request));
    }

    @Test
    void testFraudeDetectadoRechazaPago() {
        PaymentRequest request = new PaymentRequest(15000.0, 20000.0, 3);
        assertFalse(balanceValidator.handle(request));
    }

    @Test
    void testLimiteTransaccionesExcedidoRechazaPago() {
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 6);
        assertFalse(balanceValidator.handle(request));
    }

    @Test
    void testFraudValidatorSolo() {
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertTrue(fraudValidator.handle(request));
    }

    @Test
    void testLimitValidatorSolo() {
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertTrue(limitValidator.handle(request));
    }


    @Test
    void testPaypalAdaptor() {
        PaypalAdaptor adaptor = new PaypalAdaptor(new PaypalApi("clientId123"));
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertDoesNotThrow(() -> adaptor.processPayment(request));
    }

    @Test
    void testStripeAdaptor() {
        StripeAdaptor adaptor = new StripeAdaptor(new StripeApi("keyApi123"));
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertDoesNotThrow(() -> adaptor.processPayment(request));
    }

    @Test
    void testCreditCardAdaptor() {
        CreditCardAdaptor adaptor = new CreditCardAdaptor(new CreditCardApi("4532015112830366", "12/26"));
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertDoesNotThrow(() -> adaptor.processPayment(request));
    }

    @Test
    void testBankTransactionAdaptor() {
        BankTransactionAdaptor adaptor = new BankTransactionAdaptor(new BankTransactionApi("007123456", "BANCOLOMBIA"));
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertDoesNotThrow(() -> adaptor.processPayment(request));
    }


    @Test
    void testPaymentServicePagoAprobado() {
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertDoesNotThrow(() -> service.processPayment(request));
    }

    @Test
    void testPaymentServicePagoRechazadoPorSaldo() {
        PaymentRequest request = new PaymentRequest(1000.0, 500.0, 3);
        assertDoesNotThrow(() -> service.processPayment(request));
    }

    @Test
    void testPaymentServicePagoRechazadoPorFraude() {
        PaymentRequest request = new PaymentRequest(15000.0, 20000.0, 3);
        assertDoesNotThrow(() -> service.processPayment(request));
    }

    @Test
    void testPaymentServicePagoRechazadoPorLimite() {
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 6);
        assertDoesNotThrow(() -> service.processPayment(request));
    }

    @Test
    void testPaymentRequestGetters() {
        PaymentRequest request = new PaymentRequest(500.0, 1000.0, 3);
        assertEquals(500.0, request.getAmount());
        assertEquals(1000.0, request.getBalance());
        assertEquals(3, request.getTransactionCount());
    }
}
