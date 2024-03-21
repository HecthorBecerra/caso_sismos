import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    List<List<LecturaSismica>> lecturasSemanal = new ArrayList<>();

    public Menu() {
        for (int l = 0; l < 7; l++) {
            lecturasSemanal.add(new ArrayList<>());
        }
    }

    public void start() {
        char opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar sismo de mayor magnitud");
            System.out.println("3. Contar sismos mayores o iguales a 5.0");
            System.out.println("4. Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("5. Salir (S/N)");

            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '1':
                    ingresarDatos();
                    break;
                case '2':
                    mostrarMayorMagnitud();
                    break;
                case '3':
                    contarSismos();
                    break;
                case '4':
                    enviarSMS();
                    break;
                case '5':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != '5');
    }

    public void ingresarDatos() {
        Random random = new Random();
        for (List<LecturaSismica> semana : lecturasSemanal) {
            semana.clear();
            for (int i = 0; i < 7; i++) {
                double magnitud = random.nextDouble() * 9.9;
                semana.add(new LecturaSismica(magnitud));
            }
        }
        System.out.println("Datos ingresados exitosamente.");
    }

    public void mostrarMayorMagnitud() {

    }

    public void contarSismos() {

    }

    public void enviarSMS() {

    }

    public void mostrarSMS() {
        System.out.println("Se detectó un sismo mayor a 7.0. Arranca.");
    }

    static class LecturaSismica {
        private double magnitud;

        public LecturaSismica(double magnitud) {
            this.magnitud = magnitud;
        }

    }
}


