package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua 1");
        Aluno aluno = new Aluno(" Marcos ", 17);
        Professor professor = new Professor(" Silas", "Filosofia");
        Aluno[] alunosParaSeminario = { aluno };

        Seminario seminario = new Seminario("Filósofos gregos", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = { seminario };

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}