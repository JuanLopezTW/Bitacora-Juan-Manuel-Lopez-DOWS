package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana2.Patrones.Ejericicio3;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getState();
    }
}
