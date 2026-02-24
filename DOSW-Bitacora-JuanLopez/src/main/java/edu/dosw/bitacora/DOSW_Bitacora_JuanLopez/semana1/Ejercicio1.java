package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana1;

import java.util.List;
import java.util.stream.Collectors;
//Dada una lista de numeros enteros, necesitamos obtener una nueva lista solo con los numeros pares mayores a diez
public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 12, 7, 20, 5, 14, 8, 11, 2, 18);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0 && n > 10)
                .collect(Collectors.toList());

        System.out.println("Números pares mayores a 10: " + resultado);
    }
}
