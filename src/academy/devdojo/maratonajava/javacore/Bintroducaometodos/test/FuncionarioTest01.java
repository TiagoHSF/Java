package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome = "Carlos";
        funcionario.setIdade = 53;
        funcionario.setSalarios = new double[] {1200, 987.32, 2100};
        funcionario.imprime()
        System.out.println("Média "+ funcionario.getMedia())
    }
}