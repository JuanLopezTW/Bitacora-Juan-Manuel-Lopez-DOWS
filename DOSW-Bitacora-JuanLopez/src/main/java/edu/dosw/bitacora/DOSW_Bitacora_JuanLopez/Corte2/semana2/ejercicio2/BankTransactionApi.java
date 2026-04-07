package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class BankTransactionApi {
    private String accountNumber;
    private String bankCode;


    public BankTransactionApi(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    public void transferFounds(double amount){
        System.out.println("Transferencia bancaria de $" + amount + " desde cuenta: " + accountNumber);
    }
}
