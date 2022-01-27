package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2)
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0))
        calculadora.imprimeDivisao(50/2)
    }
}