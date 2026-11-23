package org.josgabfay;

public class Main {
    public static void main(String[] args) {

    }

    static void verMiembros() {
        System.out.println("--- Miembros de " + nombreEquipo + " ---");
        if (miembros.isEmpty()) {
            System.out.println("No hay miembros todavía.");
            return;
        }
        for (int i = 0; i < miembros.size(); i++) {
            System.out.println((i + 1) + ". " + miembros.get(i));
        }
    }
}
