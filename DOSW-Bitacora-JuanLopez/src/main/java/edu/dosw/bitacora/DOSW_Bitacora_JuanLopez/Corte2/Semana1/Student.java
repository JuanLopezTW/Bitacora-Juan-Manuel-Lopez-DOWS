package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.Semana1;

import java.util.*;

class Student {
    String id;
    String name;
    String team; // "NARANJA", "AZUL", "VERDE"
    List<Grade> grades;

    Student(String id, String name, String team, List<Grade> grades) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.grades = grades;
    }
}

