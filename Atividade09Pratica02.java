
/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade09 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final conforme condições a seguir:
 *    Venda a Vista - desconto de 10%
 *    Venda a Prazo 30 dias - desconto de 5%
 *    Venda a Prazo 60 dias - mesmo preço
 *    Venda a Prazo 90 dias - acréscimo de 5%
 *    Venda com cartão de débito - desconto de 8%
 *    Venda com cartão de crédito - desconto de 7%
 * 
 * Data: 15/05/2023
 */

import java.util.Scanner;

public class Atividade09Pratica02 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Favor informe o valor da venda: ");
    double valorVenda = input.nextDouble();

    System.out.println("Informe agora a opção de pagamento: ");
    System.out.println("1 - Venda a Vista - desconto de 10%");
    System.out.println("2 - Venda a Prazo 30 dias - desconto de 5%");
    System.out.println("3 - Venda a Prazo 60 dias - mesmo preço");
    System.out.println("4 - Venda a Prazo 90 dias - acréscimo de 5%");
    System.out.println("5 - Venda com cartão de débito - desconto de 8%");
    System.out.println("6 - Venda com cartão de crédito - desconto de 7%");
    int opcaoPgto = input.nextInt();
    input.close();
    
    double taxa, valorTotal;
    
    switch (opcaoPgto) {

      case 1:
        taxa = 0.1;
        valorTotal = valorVenda - (valorVenda * taxa);
        System.out.printf("Para venda a Vista, o valor total = %.2f reais. \n", valorTotal);
        break;

      case 2:
        taxa = 0.05;
        valorTotal = valorVenda - (valorVenda * taxa);
        System.out.printf("Para venda a Prazo de 30 dias, o valor total = %.2f reais. \n", valorTotal);
        break;

      case 3:
        valorTotal = valorVenda;
        System.out.printf("Para venda a Prazo de 60 dias, o valor total = %.2f reais. \n", valorTotal);
        break;

      case 4:
        taxa = 0.05;
        valorTotal = valorVenda + (valorVenda * taxa);
        System.out.printf("Para venda a Prazo de 90 dias, o valor total = %.2f reais. \n", valorTotal);
        break;

      case 5:
        taxa = 0.08;
        valorTotal = valorVenda - (valorVenda * taxa);
        System.out.printf("Para venda a débito no cartão, o valor total = %.2f reais. \n", valorTotal);
        break;

      case 6:
        taxa = 0.07;
        valorTotal = valorVenda - (valorVenda * taxa);
        System.out.printf("Para venda a crédito no cartão, o valor total = %.2f reais. \n", valorTotal);
        break;

      default:
        System.out.println("Opção Inválida.");
    }

  }
}
