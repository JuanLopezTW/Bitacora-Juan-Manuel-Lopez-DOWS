package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana1;

import java.util.List;
import java.util.stream.Collectors;
//Dado un listado de Usuarios y utilizando los mismo atributos anteriores, filtrar las personas mayores de edad y obtener sus nombres.
public class Ejercicio4 {
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
                new Usuario(1, "Ana", 17, true),
                new Usuario(2, "Carlos", 22, true),
                new Usuario(3, "Luis", 15, false),
                new Usuario(4, "Maria", 30, true)
        );

        List<String> mayoresDeEdad = usuarios.stream()
                .filter(u -> u.age >= 18)
                .map(u -> u.name)
                .collect(Collectors.toList());

        System.out.println("Mayores de edad: " + mayoresDeEdad);
    }
}