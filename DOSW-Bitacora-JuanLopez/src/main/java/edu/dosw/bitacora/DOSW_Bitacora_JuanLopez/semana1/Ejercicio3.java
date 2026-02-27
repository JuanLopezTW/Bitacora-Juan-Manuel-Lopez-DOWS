package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana1;

import java.util.List;
import java.util.stream.Collectors;
//Dada una lista de usuarios, Filtra unicamente los usuarios activos, obten una lista con los nombres en mayuscula y ordena alfabeticamente el resultado
//clase estatica para mas comodidad
public class Ejercicio3 {
    static class Usuario {
        int id;
        String name;
        int age;
        boolean active;

        Usuario(int id, String name, int age, boolean active) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
        }
    }

    public static void main(String[] args) {
        List<Usuario> usuarios = List.of(
                new Usuario(1, "ana", 25, true),
                new Usuario(2, "carlos", 30, false),
                new Usuario(3, "maria", 22, true),
                new Usuario(4, "luis", 28, false),
                new Usuario(5, "sofia", 19, true)
        );

        List<String> resultado = usuarios.stream()
                .filter(u -> u.active)
                .map(u -> u.name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Usuarios activos: " + resultado);
    }
}