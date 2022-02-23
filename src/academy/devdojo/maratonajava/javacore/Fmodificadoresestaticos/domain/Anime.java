package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado Espaço em memória
    // 2 - Cada atributo é criado e inicializado com valores default ou valores passados
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização estático 1")
        episodios = new int[100];
        for(int i=0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2")
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3")
    } {
        System.out.println("Dentro do bloco de inicialização não estático")
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for(int episodios: Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println()
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}