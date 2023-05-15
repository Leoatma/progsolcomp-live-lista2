/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade05 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de uma pessoa.
 * Depois, o programa deve dar a seguinte opção “Deseja visualizar dados completos?”. Se o caractere digitado pelousuário for ‘S’ o programa deve imprimir 
 * na tela Nome, Sobrenome, idade e naturalidade. Se o caractere digitado pelousuário for ‘N’ o programa deve imprimir o Nome e a idade. 
 * Se o caractere não for nenhuma das outras opções acima o programa deve imprimir “Digitação errada. Tente Novamente”.
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade05Pratica02 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Qual o seu nome? ");
    String userName = input.nextLine();

    System.out.println("Qual o seu sobrenome? ");
    String userLastName = input.nextLine();

    System.out.println("Qual a sua naturalidade? ");
    String placeOfBirth = input.nextLine();

    System.out.println("Qual a sua idade? ");
    int userAge = input.nextInt();

    System.out.println("Deseja visualizar os dados completos? S ou N");
    String userChoice = input.next().toUpperCase();
    input.close();

    if (userChoice.equals("S")) {
      System.out.printf("%s %s, %d anos, natural de %s. \n", userName, userLastName, userAge, placeOfBirth);
    } else if (userChoice.equals("N")) {
      System.out.printf("%s, %d anos. \n", userName, userAge);
    } else {
      System.out.println("Digitação errada. Tente Novamente.");
    }

  }
}
