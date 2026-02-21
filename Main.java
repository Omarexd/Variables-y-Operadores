package variables;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        // 1️ VARIABLES
       
        System.out.println("=== INGRESO DE VARIABLES ===");

        System.out.print("Ingrese un numero entero: ");
        int numeroEntero = sc.nextInt();

        System.out.print("Ingrese un numero decimal: ");
        double numeroDecimal = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese true o false: ");
        boolean valorLogico = sc.nextBoolean();

        System.out.println("\nValores ingresados:");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Texto: " + texto);
        System.out.println("Booleano: " + valorLogico);

        
        // 2️ OPERACIONES MATEMÁTICAS
       
        System.out.println("\n=== OPERACIONES CON INT ===");
        System.out.print("Ingrese numero 1: ");
        int a = sc.nextInt();
        System.out.print("Ingrese numero 2: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division entera: " + (a / b));

        System.out.println("\n=== OPERACIONES CON DOUBLE ===");
        double x = a;
        double y = b;
        System.out.println("Division decimal: " + (x / y));

        
        // 3️ OPERACIONES LÓGICAS
        
        System.out.println("\n=== COMPARACIONES ===");
        System.out.print("Ingrese valor 1: ");
        int c = sc.nextInt();
        System.out.print("Ingrese valor 2: ");
        int d = sc.nextInt();

        System.out.println("Mayor que: " + (c > d));
        System.out.println("Menor que: " + (c < d));
        System.out.println("Igual: " + (c == d));

        System.out.println("AND: " + (c > 0 && d > 0));
        System.out.println("OR: " + (c > 0 || d > 0));

        
        // 4️ CLASIFICACIÓN DE EDAD
        
        System.out.println("\n=== CLASIFICACIÓN DE EDAD ===");
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

        
        // 5️ DÍA DE LA SEMANA
       
        System.out.println("\n=== DÍA DE LA SEMANA ===");
        System.out.print("Ingrese numero del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Numero invalido");
        }

        
        // 6️ VERIFICACIÓN DE ACCESO
        
        System.out.println("\n=== LOGIN ===");
        sc.nextLine();
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String pass = sc.nextLine();

        String usuarioCorrecto = "admin";
        String passCorrecta = "1234";

        if (!usuario.equals(usuarioCorrecto)) {
            System.out.println("Usuario no registrado");
        } else if (!pass.equals(passCorrecta)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Acceso concedido");
        }

        sc.close();
    }
}