package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana2.Patrones.Ejericicio3;

import java.util.Stack;

public class History {
    private Stack<Memento> states = new Stack<>();

    public void push(Memento memento) {
        states.push(memento);
    }

    public Memento pop() {
        if (states.isEmpty()) {
            System.out.println("No hay estados guardados");
            return null;
        }
        return states.pop();
    }
}
