package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana2.Patrones.Ejericicio3;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Hola");
        history.push(editor.save());

        editor.setText("Hola mundo");
        history.push(editor.save());

        editor.setText("Hola mundo cruel");
        System.out.println("Texto actual: " + editor.getText());

        editor.restore(history.pop());
        System.out.println("Después de deshacer: " + editor.getText());

        editor.restore(history.pop());
        System.out.println("Después de deshacer: " + editor.getText());
    }
}