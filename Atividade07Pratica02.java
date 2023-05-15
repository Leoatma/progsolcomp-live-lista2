
/*
 * Nome do Aluno: Leandro Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2Atividade07 - Estrutura de Decisão, Repetição e Operadores Lógicos
 * Descrição: Faça um programa que calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
 *    R$ 5.50 por diária, se o número de diárias for maior que 15;
 *    R$ 6.00 por diária, se o número de diárias for igual a 15;
 *    R$ 8.00 por diária, se o número de diárias for menor que 15.
 * 
 * Data: 15/05/2023
 */
import java.util.Locale;
import java.util.Scanner;

public class Atividade07Pratica02 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner inputDiaria = new Scanner(System.in);

    System.out.println("Informe quantas diárias você utilizou?");
    int diarias = inputDiaria.nextInt();
    inputDiaria.close();

    double precoDiaria = 60.0;
    double taxaServiço;

    if (diarias < 15 && diarias > 0) {
      taxaServiço = 8.0;
    } else if (diarias == 15) {
      taxaServiço = 6.0;
    } else {
      taxaServiço = 5.5;
    }

    double valorTotalDiarias = (precoDiaria * diarias) + taxaServiço;

    System.out.printf("O valor das diarias + taxa de serviço = %.2f reais. \n", valorTotalDiarias);
  }
}
