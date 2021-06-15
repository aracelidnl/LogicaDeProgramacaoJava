package br.com.ChronosAcademy.LogicaProgramacao;
/* A partir de três valores, verificar se formam ou não um triângulo.
Em caso positivo, exibir sua classificação: "Isósceles, Escaleno ou Equilátero".
Um Triângulo escaleno possui todos os lados diferentes,
o isósceles, dois lados iguais e
o equilátero, todos os lados iguais.
Para existir triângulo é necessário que a soma de dois lados quiasquer seja maior que o outro,
isto, para os três lados.
 */
public class Triangulo {
    public static void main(String[] args) {
        int ladoA = 5;
        int ladoB = 7;
        int ladoC = 8;

        if (ladoA+ladoB > ladoC && ladoA+ladoC > ladoB && ladoB+ladoC > ladoA){
            if(ladoA == ladoB && ladoA == ladoC){
                System.out.println("Triangulo Equilátero");
            }else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("Triangulo Escaleno");
            }else{
                System.out.println("Triângulo Isósceles");
            }
        }else{
            System.out.println("Os valores não correspondem a um triangulo");
        }
    }
}
