/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica02_Atividade13 - Estrutura de Decisão, Repetição e Operadores Lógicos
* Descrição: Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma. (utilize while)
* Data: 15/05/2023
*/

public class Atividade13Pratica02 {

  public static void main(String[] args) {

    int soma = 0;
    int index = 1;

    while (index <= 100) {
      soma += index;
      index++;
    }    

    System.out.println("Soma = " + soma);
  }
}

