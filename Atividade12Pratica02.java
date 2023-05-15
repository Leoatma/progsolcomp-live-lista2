/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica2_Atividade12 - Estrutura de Decisão, Repetição e Operadores Lógicos
* Descrição: Faça um programa que exiba todos os números pares a partir de 0 até que encontre um múltiplo de 7 (utilize do/while)
* Data: 15/05/2023
*/

public class Atividade12Pratica02 {
    
    public static void main(String[] args) {
        
        int idxNumber = 1;

        do {

            if (idxNumber % 2 == 0) {
            System.out.println(idxNumber);
            }

            idxNumber++;
            
        } while (idxNumber % 7 != 0);
    }
}
