package br.com.ChronosAcademy.LogicaProgramacao;
/* Através de um valor sobre tempo, onde os valores podem ser:
Ensolarado, Chovendo, Nevando, Tempestade.

Exibir as seguintes dependendo do valor.
Ensolarado: ir para praia,
Chovendo: levar guarda chuva,
Nevando: fica em casa,
Tempestade: boa sorte.

 */
public class Tempo {
    public static void main(String[] args) {
        String tempo = "ensolarado";

        //if(tempo.equals("ensolarado")) para string não usar ==,usar equals

        switch (tempo){
            case "ensolarado":
                System.out.println("ir pra praia");
                break;
            case "chovendo":
                System.out.println("levar guarda chuva");
                break;
            case "nevando":
                System.out.println("fica em casa");
                break;
            case "tempestade":
                System.out.println("boa sorte");
                break;
        }
    }
}
