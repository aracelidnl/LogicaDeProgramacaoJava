package br.com.ChronosAcademy.LogicaProgramacao;
// Exibir a tabuada do número cinco do intervalo de um a dez.

public class TabuadaCincoDoWhile {
    public static void main(String[] args) {
        int tabuada = 5;
        int cont = 1;

        do{
            System.out.println(tabuada+" x "+cont+" = "+tabuada * cont);
            cont++;
        }while (cont < 11);

    }
}