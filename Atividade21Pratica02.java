/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica02_Atividade21 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os números de 1 até o
 * número digitado. (utilize for)
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade21Pratica02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número positivo:");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero > 0) {
            for (int idx = 1; idx <= numero; idx++) {
                int resultado = numero * idx;
                System.out.printf("%d * %d = %d \n", numero, idx, resultado);
            }
        } else {
            System.out.println("Número incorreto, tente novamente");
        }
    }
}
