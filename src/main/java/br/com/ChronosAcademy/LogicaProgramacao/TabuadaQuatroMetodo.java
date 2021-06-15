package br.com.ChronosAcademy.LogicaProgramacao;
//Exibir a tabuada do número 4 no intervalo de dez a um (com método).

public class TabuadaQuatroMetodo {
        public static void main(String[] args) {
            int valor = 4;

            exibetabuada(valor);
        }

        public static void exibetabuada(int valor){
            for (int i = 10; i > 0 ; i--) {
                System.out.println(valor+" x "+i+" = "+valor*i);
            }
        }
}


