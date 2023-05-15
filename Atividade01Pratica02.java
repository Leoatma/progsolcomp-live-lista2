/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade1 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Faça um programa que leia dois números A e B e imprima o maior deles.
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade01Pratica02 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Qual o primeiro número?");
    int numeroA = input.nextInt();

    System.out.println("Informe agora o segundo numero: ");
    int numeroB = input.nextInt();
    input.close();

    if (numeroA > numeroB) {
      System.out.println(numeroA);
    } else if (numeroB > numeroA) {
      System.out.println(numeroB);
    } else {
      System.out.println("os numeros sao iguais");
    }
  }
}
