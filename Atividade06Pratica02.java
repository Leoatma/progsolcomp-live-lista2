/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade06 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno que varia de 0 a 100. 
 * As faixas da correlação são mostradas abaixo:
 *    Nota   -  Conceito
 *   0 a 49  -  Insuficiente
 *  50 a 64  -  Regular
 *  65 a 84  -  Bom
 *  85 a 100 -  Ótimo
 * 
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade06Pratica02 {

  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);

    System.out.println("Favor informar a nota do aluno: (entre 0 a 100)");
    int notaAluno = keyInput.nextInt();
    keyInput.close();
    
    if ((notaAluno >= 85) && (notaAluno <= 100)) {
      System.out.printf("A nota %d tem conceito: Ótimo. \n", notaAluno);
    } else if ((notaAluno < 85) && (notaAluno >= 65)) {
      System.out.printf("A nota %d tem conceito: Bom. \n", notaAluno);
    } else if ((notaAluno < 65) && (notaAluno >= 50)) {
      System.out.printf("A nota %d tem conceito: Regular. \n", notaAluno);
    } else if ((notaAluno < 50) && (notaAluno >= 0)) {
      System.out.printf("A nota %d tem conceito: Insuficiente. \n", notaAluno);
    } else {
      System.out.println("Erro encontrado. Favor checar a nota informada.");
    }

  }
}