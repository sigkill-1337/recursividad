import java.util.Scanner;


public class App {
    static int conteo = 0;

    static void contar(int numero) {


        if (numero == 0) {
            System.out.println("Fin");
            System.out.println("Intentos: " + conteo);
            return;
        }
    

        System.out.println(numero);
        conteo++;

        contar(numero - 1);
} 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        contar(numero);
        scanner.close();
    }
}