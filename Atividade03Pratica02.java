/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade3 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Elabore um programa que lê dois valores A e B e os escreve com
 * a mensagem: “São múltiplos” ou “Não são múltiplos”.
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade03Pratica02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor de A? ");
        int valorA = entrada.nextInt();

        System.out.println("Agora, informe o valor B: ");
        int valorB = entrada.nextInt();
        entrada.close();

        if (valorA > valorB) {
            if(valorA % valorB == 0) {
                System.out.printf("Os valores %d e %d são múltiplos. \n", valorA, valorB);
            } else {
                System.out.printf("Os valores %d e %d não são múltiplos. \n", valorA, valorB);
            }
        } else if (valorB > valorA) {
            if(valorB % valorA == 0) {
                System.out.printf("Os valores %d e %d são múltiplos. \n", valorA, valorB);
            } else {
                System.out.printf("Os valores %d e %d não são múltiplos. \n", valorA, valorB);
            }
        } else {
            System.out.printf("Os valores %d e %d são iguais. \n", valorA, valorB);
        }
    }
}
