package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 100000000000L;
        long NumeroGrande = 100000;
        double salarioDouble = 2000.0;
        float SalarioFloat = 2500.0F;
        byte idadeByte = 19;
        short idadeShort = 19;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; /* ASCII || UNICODE */
        String nome = "Tiago Henrique da Silva Ferreira";
        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("Oi meu nome é " + nome);
    }
}
