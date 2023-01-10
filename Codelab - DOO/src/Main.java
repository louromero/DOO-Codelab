import module.Reserva;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CODELAB - Diseño Orientado a Objetos");
        mostrarMenu();

    }

    static void mostrarMenu(){
        System.out.println();
        System.out.println("-------MENU: -------");
        System.out.println("1. Ver reservas");
        System.out.println("2. Realizar reserva");
        System.out.println("--------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
        System.out.println();

        switch (opcion){
            case 1 -> verReservas();
            case 2 -> agregarReserva();
            default -> {
                System.out.println("Opción no valida");
                mostrarMenu();
            }
        }
        mostrarMenu();
    }

    static void verReservas(){
        System.out.println("RESERVAS REALIZADAS: ");
        try {
            File file = new File("resources/reservas.csv");
            Scanner fileScanner = new Scanner(file);
            //Saltar el encabezado del CSV
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                //String[] reservaInfo = line.split(",");
                //System.out.println(reservaInfo[0]);
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void agregarReserva(){
        System.out.println("REALIZAR RESERVA: ");
        //crear nueva reserva
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese DNI: ");
        int dni = sc.nextInt();
        sc.nextLine(); //Para que no se realice el salto

        System.out.println("Ingrese contacto: ");
        String contacto = sc.nextLine();

        System.out.println("Ingrese fecha: ");
        String fecha = sc.nextLine();

        System.out.println("Ingrese hora: ");
        String hora = sc.nextLine();

        System.out.println("Ingrese tipo: ");
        String tipo = sc.nextLine();

        Reserva reserva = new Reserva(nombre, dni, contacto, fecha, hora, tipo);

        try {
            FileWriter fileWriter = new FileWriter("resources/reservas.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println("\r" + nombre + "," + dni + "," + contacto + "," + fecha + "," + hora + "," + tipo);
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


