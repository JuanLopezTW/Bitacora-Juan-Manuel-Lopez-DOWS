package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana1;

import java.util.List;
//clase estatica anidada para no hacer archivos de mas
// ejercicio 5
//Dada una lista de transacciones bancarias
//Se requiere procesar la lista usando Streams para:
//Usar peek para ver cada transacción procesada (Utilizar System.out.println para ver la transaccion)
//Verificar si existe al menos una transacción no aprobada
//Retornar true o false indicando si el lote de transacciones es válido.
public class Transacciones {
    static class Transaction {
        String id;
        double amount;
        boolean approved;

        Transaction(String id, double amount, boolean approved) {
            this.id = id;
            this.amount = amount;
            this.approved = approved;
        }

        @Override
        public String toString() {
            return "Transaction{id='" + id + "', amount=" + amount + ", approved=" + approved + "}";
        }
    }

    public static boolean validarLote(List<Transaction> transactions) {
        return transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .noneMatch(t -> !t.approved);
    }

    public static void main(String[] args) {
        List<Transaction> transacciones = List.of(
                new Transaction("T001", 150.0, true),
                new Transaction("T002", 200.0, false),
                new Transaction("T003", 75.0, true)
        );

        boolean loteValido = validarLote(transacciones);
        System.out.println("¿Lote válido? " + loteValido);
    }
}