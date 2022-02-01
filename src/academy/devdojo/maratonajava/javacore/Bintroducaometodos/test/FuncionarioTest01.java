package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Carlos";
        funcionario.idade = 53;
        funcionario.salarios = new double[] {1200, 987.32, 2100};

        funcionario.imprime()
    }
}