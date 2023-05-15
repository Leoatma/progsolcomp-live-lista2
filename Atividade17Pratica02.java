/* 
* Nome do Aluno: Leandro S. de Aguiar
* RA: 1272319129
* Nome do Programa: Pratica02_Atividade17 - Estrutura de Decisão, Repetição e Operadores Lógicos
* Descrição: Faça um programa que imprima os múltiplos negativos de 7, superiores a -1000. (utilize do / while)
* Data: 15/05/2023
*/

public class Atividade17Pratica02 {
    
    public static void main(String[] args) {
        
        for (int idx = -1000; idx < 0; idx ++) {
            if (idx % 7 == 0) {
                System.out.println(idx);
            }
        }
    }
}
