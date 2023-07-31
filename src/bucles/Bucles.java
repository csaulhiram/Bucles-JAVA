package bucles;

import java.util.Scanner;

/**
 *
 * @author csaul
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int bandera = 1;
        int opcion = 0;
        do {
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Multiplica sumando\n2. Factorial");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: // multiplica sumando
                    System.out.println("=====================================");
                    System.out.println("===MULTIPLICA SUMANDO======");
                    System.out.println("=====================================");

                    int num = 0,multiplicador;
                    System.out.print("Intresa número de veces a multiplicar: ");
                    multiplicador = entrada.nextInt();

                    System.out.print("Intresa un número: ");
                    num = entrada.nextInt();

                    multiplicaSumando(num, multiplicador);
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("===FACTORIAL======");
                    System.out.println("=====================================");

                    System.out.print("Ingresa un número: ");
                    int factorial = entrada.nextInt();
                    factorial(factorial);
                    break;
                default:
                    System.out.println("Opción equivocada");
            }
            System.out.println("¿Quieres realizar otra operación? 1 = si 0 = no");
            bandera= entrada.nextInt();
            
        } while (bandera == 1);
    }

    public static void multiplicaSumando(int num, int multiplicador) {
        int result = 0;

        for (int i = 0; i < multiplicador; i++) {
            result = num + result;
        }
        System.out.println(result);
    }

    public static void factorial(int factorial) {
        // int auxiliar = factorial;
        int resultado = 1;

        for (int i = 0; factorial > 0; i++) {
            resultado = factorial * resultado;
            System.out.print(factorial + "! ");
            factorial--;
        }
        System.out.print("= ");
        System.out.println(resultado);
    }
}
