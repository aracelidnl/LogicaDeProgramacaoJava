package br.com.ChronosAcademy.LogicaProgramacao;

//Desafio 2:
//Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados.
// Se a área for maior que 100, exibir a mensagem “Terreno grande”.

public class AreaRetangulo {

        public static void main(String[] args){

            float base = 100f;
            float altura = 5f;
            float arearetangulo = base*altura;


            if (arearetangulo > 100){
                System.out.println("Terreno grande");
            }
        }
}
