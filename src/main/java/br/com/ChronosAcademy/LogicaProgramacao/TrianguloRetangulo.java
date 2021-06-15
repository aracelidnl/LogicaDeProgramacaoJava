package br.com.ChronosAcademy.LogicaProgramacao;

//Verificar se três valores quaisquer (A,B, C) que serão digitados formam ou não um triângulo retângulo.
// Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos.

public class TrianguloRetangulo {

        public static void main(String[] args){

            float catetoA = 3f;
            float catetoB = 4f;
            float hipotenusaC = 5f;

            if ((hipotenusaC * hipotenusaC) == ((catetoA * catetoA) + (catetoB * catetoB))){
                System.out.println("Triangulo retangulo");
            }
        }
}
