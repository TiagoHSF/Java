package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 e idade <18 juvenil
        // idade >= 18 categoria adulto
        // INPUT    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));
        int idade = 17;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil! " + idade;
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil! " + idade;
        } else {
            categoria = "Categoria Adulta! " + idade;
        }
        System.out.println(categoria);
    }
}
