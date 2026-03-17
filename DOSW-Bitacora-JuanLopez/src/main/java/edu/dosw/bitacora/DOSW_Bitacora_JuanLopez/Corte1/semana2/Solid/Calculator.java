package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana2.Solid;

public class Calculator {
    public double calculate(Operation operation, double a, double b){
        return operation.execute(a,b);
    }
}
