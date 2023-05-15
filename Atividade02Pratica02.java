
/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade2 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade02Pratica02 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Valor A: ");
    float valorA = input.nextFloat();

    System.out.println("Valor B: ");
    float valorB = input.nextFloat();

    System.out.println("Valor C: ");
    float valorC = input.nextFloat();
    input.close();

    if ((valorA > valorB) && (valorA > valorC)) {
      if (valorB > valorC) {
        System.out.println(valorC + " < " + valorB + " < " + valorA);
      } else if (valorC > valorB) {
        System.out.println(valorB + " < " + valorC + " < " + valorA);
      }

    } else if ((valorB > valorA) && (valorB > valorC)) {
      if (valorA > valorC) {
        System.out.println(valorC + " < " + valorA + " < " + valorB);
      } else if (valorC > valorA) {
        System.out.printf("%.1f < %.1f < %.1f %n", valorA, valorC, valorB);
      }

    } else if ((valorC > valorA) && (valorC > valorB)) {
      if (valorB > valorA) {
        System.out.printf("%.1f < %.1f < %.1f %n", valorA, valorB, valorC);
      } else if (valorA > valorB) {
        System.out.printf("%.1f < %.1f < %.1f %n", valorB, valorA, valorC);
      }

    } else {
      System.out.println("Há numero iguais");
    }

  }
}
