package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("37505-405");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Tiago");
        pessoa.setCpf("134.87432");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Félix");
        funcionario.setCpf("23132131");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2033);

        funcionario.imprime();
    }
}