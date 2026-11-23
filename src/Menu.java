import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("========================");
            System.out.println("    TEAM GENERATOR     ");
            System.out.println("========================");
            System.out.println("Equipo: Mariscos Recio");
            System.out.println("------------------------");
            System.out.println();
            System.out.println("1. Ver miembros");
            System.out.println("2. Ver tecnologías");
            System.out.println("3. Ver información del proyecto");
            System.out.println("0. Salir");
            System.out.println();

            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ver miembros");
                    break;

                case 2:
                    System.out.println("Ver tecnologías");
                    break;

                case 3:
                    System.out.println("Información del proyecto");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

            System.out.println();

        } while (opcion != 0);
    }
}
