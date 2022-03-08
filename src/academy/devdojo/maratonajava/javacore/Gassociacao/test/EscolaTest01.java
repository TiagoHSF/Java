package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Silas");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Fundação Bradesco", professores);

        escola.imprime();
    }
}