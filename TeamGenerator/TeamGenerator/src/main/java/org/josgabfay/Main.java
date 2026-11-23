package org.josgabfay;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Miembro> miembros = new ArrayList<>();

    public static void main(String[] args) {

        // Miembros de ejemplo (cámbialos por los reales)
        miembros.add(new Miembro("Miembro 1", "Scrum Master"));
        miembros.add(new Miembro("Miembro 2", "Product Owner"));
        miembros.add(new Miembro("Miembro 3", "Developer"));
        miembros.add(new Miembro("Miembro 4", "Developer"));

        Menu.mostrarMenu();

    }

    public static void verMiembros() {
        System.out.println("--- Miembros ---");
        if (miembros.isEmpty()) {
            System.out.println("No hay miembros todavía.");
            return;
        }
        for (int i = 0; i < miembros.size(); i++) {
            System.out.println((i + 1) + ". " + miembros.get(i));
        }
    }
}