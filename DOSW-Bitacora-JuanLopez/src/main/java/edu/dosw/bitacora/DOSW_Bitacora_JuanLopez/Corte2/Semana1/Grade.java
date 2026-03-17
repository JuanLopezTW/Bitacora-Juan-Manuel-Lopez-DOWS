package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.Semana1;

import java.time.LocalDate;

class Grade {
    String subject; // "DOSW", "BD", "REDES"
    double score;
    LocalDate date;
    boolean passed;

    Grade(String subject, double score, LocalDate date, boolean passed) {
        this.subject = subject;
        this.score = score;
        this.date = date;
        this.passed = passed;
    }
}

