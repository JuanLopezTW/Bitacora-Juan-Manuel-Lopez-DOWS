package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana2.Patrones.Ejericio2;

public class PrinterAdapter implements Printer{
    private DetailedPrinter detailedPrinter;
    private String author;
    private String date;

    public PrinterAdapter(DetailedPrinter detailedPrinter, String author, String date) {
        this.detailedPrinter = detailedPrinter;
        this.author = author;
        this.date = date;
    }

    public void print(String message) {
        detailedPrinter.printDetailed(message, author, date);
    }
}
