/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica2_Atividade10 - Estrutura de Decisão, Repetição e Operadores Lógicos
* Descrição: Faça um programa que imprima todos os números pares de 1 a 100
* Data: 15/05/2023
*/

public class Atividade10Pratica02 {
  public static void main(String[] args) {

    for (int index = 1; index <= 100; index++) {
      if (index % 2 == 0) {
        System.out.printf("O número %d é par. \n", index);
      }
    }

  }
}
