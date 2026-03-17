package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class PaymentService {
    private PaymentProssesor prossesor;
    private Paymentrr validationChain;

    public PaymentService(PaymentProssesor prossesor, Paymentrr validationChain) {
        this.prossesor = prossesor;
        this.validationChain = validationChain;
    }

    public void processPayment(PaymentRequest request){
            if(validationChain.handle(request)){
                System.out.println("Validaciones pasadas, procesando pago");
                prossesor.processPayment(request);
            }
            else{
                System.out.println("pago rechazado, validaciones fracasadas");
            }
    }
}
