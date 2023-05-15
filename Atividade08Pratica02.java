
/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade08 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Crie um programa que lê um número entre 1 e 12, correspondendo a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
 * Ao final, o programa deve imprimir uma mensagem identificando, com base no número digitado, o nome do mês e a estação. 
 * Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
 * 
 * Data: 15/05/2023
 */
import java.util.Scanner;

public class Atividade08Pratica02 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Favor informe o mês: (exemplo: 1 = Janeiro, 12 = Dezembro)");
    int numeroMes = entrada.nextInt();
    entrada.close();

    String mes;
    String estacao;

    switch (numeroMes) {

      case 1:
        mes = "Janeiro";
        estacao = "Verão";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 2:
        mes = "Fevereiro";
        estacao = "Verão";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 3:
        mes = "Março";
        estacao = "Outono";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 4:
        mes = "Abril";
        estacao = "Outuno";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 5:
        mes = "Maio";
        estacao = "Outuno";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 6:
        mes = "Junho";
        estacao = "Inverno";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 7:
        mes = "Julho";
        estacao = "Inverno";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 8:
        mes = "Agosto";
        estacao = "Inverno";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 9:
        mes = "Setembro";
        estacao = "Primavera";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 10:
        mes = "Outubro";
        estacao = "Primavera";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 11:
        mes = "Novembro";
        estacao = "Primavera";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      case 12:
        mes = "Dezembro";
        estacao = "Verão";
        System.out.printf("Mês: %s, Estação: %s. \n", mes, estacao);
        break;

      default:
        System.out.println("Número inválido, tente novamente.");
    }

  }
}
