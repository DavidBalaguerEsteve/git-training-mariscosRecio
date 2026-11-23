import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Miembro> miembros = new ArrayList<>();

    public static void main(String[] args) {

        // Miembros del equipo
        miembros.add(new Miembro("David Balaguer Esteve", "Desarrollador"));
        miembros.add(new Miembro("Josep Antoni", "Desarrollador"));
        miembros.add(new Miembro("Mateo Domenech", "Desarrollador"));
        miembros.add(new Miembro("Xavi", "Desarrollador"));

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
