package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado ao JVM
    // carregar
    // 1 - Bloco de inicialização estático da sub classe é executado ao JVM carregar
    // 2 - Alocado espaço em memória pra objeto da classe pai
    // 3 - Cada atributo de classe é criado e inicializado com valores padrÕEs ou
    // passados
    // 4 - Bloco de inicialização da superclasse é executado na ordem que aparece
    // 5 - Construtor é executado da superclasse

    // 6 - Alocado espaço em memória pra objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores padrÕEs ou
    // passados
    // 8 - Bloco de inicialização da subclasse é executado na ordem que aparece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("José");
    }
}