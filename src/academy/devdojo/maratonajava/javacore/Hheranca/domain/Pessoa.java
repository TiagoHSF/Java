package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public void imprime() {
        System.out.println(this.nome + " " + this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}