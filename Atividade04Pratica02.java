/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade4 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é
 * positivo ou negativo.
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade04Pratica02 {

  public static void main(String[] args) {

    Scanner numberInput = new Scanner(System.in);

    System.out.println("Favor informe um número inteiro: ");
    int userNumber = numberInput.nextInt();
    numberInput.close();

    if (userNumber > 0) {
      System.out.printf("O número %d é positivo. \n", userNumber);
    } else if (userNumber < 0) {
      System.out.printf("O número %d é negativo. \n", userNumber);
    } else {
      System.out.printf("O número 0 não é válido. \n");
    }

    if (userNumber % 2 != 0) {
      System.out.println("É um número ímpar.");
    } else if (userNumber == 0) {
      System.out.println("");
    } else {
      System.out.println("É um número par.");
    }

  }

}
