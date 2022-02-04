package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado Espaço em memória
    // 2 - Cada atributo é criado e inicializado com valores default ou valores passados
    // 3 - Bloco de inicialização
    // 4 - Construtor
    {
        System.out.println("Dentro do bloco de inicialização")
        episodios = new int[100];
        for(int i=0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for(int episodios: this.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println()
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

}