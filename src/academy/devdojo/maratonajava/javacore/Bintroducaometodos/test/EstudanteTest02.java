package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        
        estudante01.nome = "Tiago";
        estudante01.idade = 19;
        estudante01.sexo = "M";

        estudante01.nome = "Aline";
        estudante01.idade = 17;
        estudante01.sexo = "F";

        estudante01.imprime();
        estudante02.imprime();
    }
}