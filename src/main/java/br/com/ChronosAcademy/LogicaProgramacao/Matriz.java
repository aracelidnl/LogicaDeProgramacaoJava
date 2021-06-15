package br.com.ChronosAcademy.LogicaProgramacao;
/*
Criar um programa, que tenha três nomes e três sexo correspondente.
Exibir o nome e sexo de cada item da matriz.
 */

public class Matriz {
    public static void main(String[] args) {
        String[][] matriz = {{"João", "José", "Ana"},
                {"masculino", "masculino", "feminino"}};

        System.out.println(matriz.length);
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.println("Nome: "+matriz[0][i]);
            System.out.println("Sexo: "+matriz[1][i]);
        }
    }

}
