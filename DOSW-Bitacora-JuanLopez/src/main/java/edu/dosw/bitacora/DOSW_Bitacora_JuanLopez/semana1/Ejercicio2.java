package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana1;

import java.util.List;
import java.util.stream.Collectors;
//Dada una lista de palabras, se requiere: Filtrar las palabras que tengan mas de 4 caracteres,
// convertirlas en Mayusculas, ordenarlas alfabeticamente y obtener la cantidad total de palabras resultantes
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> palabras = List.of("sol", "computadora", "mar", "elefante", "casa", "programacion", "rio");

        long cantidad = palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .peek(p -> System.out.println(p))
                .count();

        System.out.println("Total de palabras resultantes: " + cantidad);
    }
}