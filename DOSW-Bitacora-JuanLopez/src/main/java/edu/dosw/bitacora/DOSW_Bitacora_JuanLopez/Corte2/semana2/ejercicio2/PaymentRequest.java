package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

import lombok.Data;

@Data
public class PaymentRequest {
    private double amount;
    private double balance;
    private int transactionCount;

    public PaymentRequest(double amount, double balance, int transactionCount) {
        this.amount = amount;
        this.balance = balance;
        this.transactionCount = transactionCount;
    }
}
