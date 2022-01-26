package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carros;

public class CarrosTeste01{
    public static void main(String[] args) {
        Carros carro1 = new Carros();
        carro1.nome = "Civic"
        carro1.modelo = 1.19
        carro1.ano = 2018

        Carros carro2 = new Carros();
        carro1.nome = "Uno"
        carro1.modelo = 2.0
        carro1.ano = 2015

        System.out.println("Nome " + carro1.nome + ", Modelo " + carro1.modelo + ", Ano" + carro1.ano);
        System.out.println("Nome " + carro2.nome + ", Modelo " + carro2.modelo + ", Ano" + carro2.ano);    }
}