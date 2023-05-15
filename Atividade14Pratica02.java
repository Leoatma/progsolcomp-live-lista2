/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica02_Atividade14 - Estrutura de Decisão, Repetição e Operadores Lógicos
* Descrição: Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50.
* Data: 15/05/2023
*/

public class Atividade14Pratica02 {

  public static void main(String[] args) {

    int[] vetor = new int[50]; // criando array com 50 elementos.

    for (int pos : vetor) { // iterando a cada elemento do vetor, e atribuindo seu valor igual a 0.
      pos = 0;
      System.out.print(pos + " "); // imprimindo com o loop
    }

    System.out.printf("\n\nvetor 23 = %d,\nvetor 42 = %d.\n", vetor[22], vetor[41]); // imprimindo os valores fora do loop

  }
}
