/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica2_Atividade11 - Estrutura de Decisão, Repetição e Operadores Lógicos
* Descrição: Faça um programa que imprima todos os números pares de 1 a 100 na ordem inversa
* Data: 15/05/2023
*/

public class Atividade11Pratica02 {

  public static void main(String[] args) {

    for (int index = 100; index >= 1; index--) {
      if (index % 2 == 0) {
        System.out.printf("O número %d é par. \n", index);
      }
    }
    
  }
}
