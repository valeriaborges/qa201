

import javax.swing.*;

public class Exercise04_easy {// class start
    // 4-Faça um algoritmo para ler um numero inteiro, armazenar em uma variavel, calcular o dobro e exibir

    public static void main(String[] args) {// start main
        int numeroDigitado= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        int dobro = numeroDigitado * 2;
        System.out.println("O dobro do numero que voce digitou é" + dobro);


    } // main end
}// class end
