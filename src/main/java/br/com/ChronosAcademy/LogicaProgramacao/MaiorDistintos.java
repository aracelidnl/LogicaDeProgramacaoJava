package br.com.ChronosAcademy.LogicaProgramacao;

public class MaiorDistintos {

    /*
            Com três valores distintos.
            Exibir o maior deles.
             */
    public static void main(String[] args) {
        int valorA = 4;
        int valorB = 4;
        int valorC = 4;

        if (valorA > valorB && valorA > valorC) {
            System.out.println("Meu maior valor é: " + valorA);
        }else if (valorB > valorA && valorB > valorC) {
            System.out.println("Meu maior valor é: " + valorB);
        }else if (valorA == valorA && valorA == valorC) {
            System.out.println("Os valores são iguais!");
        }else {
            System.out.println("Meu maior valor é: " + valorC);
        }
    }
}