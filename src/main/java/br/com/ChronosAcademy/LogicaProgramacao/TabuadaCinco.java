package br.com.ChronosAcademy.LogicaProgramacao;
// Exibir a tabuada do número cinco do intervalo de um a dez.

public class TabuadaCinco {
    public static void main(String[] args) {
        int tabuada = 5;

        for (int i = 1; i < 11; i++){
            System.out.println(tabuada+" x "+i+" = "+tabuada * i);
        }

    }
}
