package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Usando switch e dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como Domingo
        byte dia = 5;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia inserido inválido");
        }
    }
}
