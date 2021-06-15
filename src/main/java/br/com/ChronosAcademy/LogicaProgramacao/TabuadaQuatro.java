package br.com.ChronosAcademy.LogicaProgramacao;
//Exibir a tabuada do número 4 no intervalo de dez a um.

public class TabuadaQuatro {
    public static void main(String[] args) {
        int tabuada = 4;

        for (int i = 10; i > 0; i--) {
            System.out.println(tabuada+" x "+i+" = "+tabuada*i);
        }
    }

}
