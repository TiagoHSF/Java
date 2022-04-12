package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco estático");
    }
    {
        System.out.println("Inicialiação1");
    }
    {
        System.out.println("Inicialiação2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println(this.nome + "recebi salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}