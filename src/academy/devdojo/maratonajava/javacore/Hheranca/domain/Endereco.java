package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Endereco {
    private String rua;
    private String cep;

    public void imprime() {
        Pessoa p = new Pessoa();
        p.nome = "asda";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
