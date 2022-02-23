package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

public class CarrosTest01 {
    public static void main(String[] args){
        Carros.setVelocidadeLimite(180); 
        
        Carros c1 = new Carros("BMW", 280);
        Carros c2 = new Carros("Mercedes", 275);
        Carros c3 = new Carros("Audi", 290);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}