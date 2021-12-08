package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        float comprarCasa = 600F;
        float salarioPorMes = 200F;
        float mesadaDoPai = 700F;
        boolean isConsigoComprarCasa = salarioPorMes + mesadaDoPai >= comprarCasa;
        if (isConsigoComprarCasa) {
            System.out.println("Consigo comprar a casa!");
        } else {
            System.out.println("Não tenho dinheiro! :(");
        }

        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcólica");
        }
        System.out.println("Fora do IF");
    }
}
