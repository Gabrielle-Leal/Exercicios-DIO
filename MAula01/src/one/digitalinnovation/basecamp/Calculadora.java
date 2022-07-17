package one.digitalinnovation.basecamp;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Informe o primeiro valor: ");
        valor1 = ler.nextInt();
        System.out.println("Informe o primeiro valor: ");
        valor2 = ler.nextInt();

        int somar = somar(valor1, valor2);
        int subtrair = subtrair(valor1, valor2);
        int multiplicar = multiplicar(valor1, valor2);
        double dividir = dividir(valor1, valor2);

        System.out.println("Somar: " + somar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);

    }

    public static int somar(int valor1, int valor2){
        return valor1 + valor2;
    }
    public static int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }
    public static int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }
    public static double dividir(double valor1, double valor2){
        return valor1 / valor2;
    }
}
