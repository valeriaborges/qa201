import javax.swing.*;

public class Exercise06_easy {// class start 6- Faça um algoritmo para ler duas notas, calcular a media. E se - a media >5 exibir aprovado; se a media < que 5 exibir reprovado; se media = 5 exibir exame

    public static void main(String[] args) {// main start
     double primeiraNota= Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double segundaNota= Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));

        double media = (primeiraNota * segundaNota)/2;

        if (media >5 )
            System.out.println("Você está aprovado!");

        else if (media == 5)
            System.out.println("Você está aprovado!");

        else {
            System.out.println("Você está reprovado!");
        }
    }// main end
}// class end
