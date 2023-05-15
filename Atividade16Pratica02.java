/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica02_Atividade16 - Estrutura de Decisão, Repetição e Operadores Lógicos
* Descrição: Faça um programa que solicite ao usuário que digite um número até que ele digite um número menor que 0 (utilize while)
* Data: 15/05/2023
*/

import java.util.Scanner;

public class Atividade16Pratica02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        
        while (numero >= 0) {
            System.out.println("Favor, digite um número maior que zero: ");
            numero = entrada.nextInt();

            if (numero < 0){
                System.out.printf("Número %d menor que zero. Programa Encerrado. \n", numero);            
            } else {
                System.out.println("Número = " + numero);
            }

        }
        
        entrada.close();

    }
}
