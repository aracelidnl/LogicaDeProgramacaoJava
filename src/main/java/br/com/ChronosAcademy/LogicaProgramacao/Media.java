package br.com.ChronosAcademy.LogicaProgramacao;

/* Uma escola
NEDIA = (P1 + P2)

Fazer um programa com os valores das nota (P1 e P2) e calcular a média.
Exubir a situação final do aluno ("Aprovado ou Reprovado"),
sabendo que a média de aprovação é igual a cinco.

 */
public class Media {
    public static void main(String[] args) {
        float p1 = 5;
        float p2 = 5;
        float media = (p1 + 2 * p2)/3;

        if(media >=5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
