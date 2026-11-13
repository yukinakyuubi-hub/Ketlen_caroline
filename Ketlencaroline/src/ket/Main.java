package ket;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, resultado;
        int opcao;

        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        numero2 = entrada.nextDouble();

        System.out.println("\nEscolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        System.out.print("Opcao: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Nao existe divisao por zero!");
                }
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        entrada.close();
    }
}

