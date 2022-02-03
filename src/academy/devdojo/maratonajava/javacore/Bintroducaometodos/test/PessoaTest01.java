package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
      //  pessoa.nome("Tiago")
        pessoa.setNome("Tiago")
        pessoa.setIdade(19)
     //   pessoa.imprime()
     System.out.println(pessoa.getNome());
     System.out.println(pessoa.getIdade());
    }
}