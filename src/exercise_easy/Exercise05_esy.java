import javax.swing.*;

public class Exercise05_esy { // class start 5- Faça um algoritmo para ler tres numeros inteiros, armazenar em variaveis, e exibir a soma, a subtração, multiplicação e a média dos três numeros digitados
    public static void main(String[] args) {
        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro")); // leitura do primeiro numero
        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro")); // leitura do segundo numero
        int terceiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero inteiro")); // leitura do terceiro numero

        int soma = primeiroValor + segundoValor + terceiroValor; // calculo da soma
        int subtracao = segundoValor - primeiroValor; // calculo da subtracao
        int multiplicacao = primeiroValor * segundoValor * terceiroValor; // calculo da multiplicacao
        int media = (primeiroValor * segundoValor * terceiroValor)/3; // calculo da media


        System.out.println("A soma dos numeros digitados é:"+ soma); // exibicao da soma
        System.out.println("A subtração dos numeros digitados é:"+ subtracao); // exibicao da subtracao
        System.out.println("A mutiplicação dos numeros digitados é:"+ multiplicacao); // exibicao da multiplicacao
        System.out.println("A media dos numeros digitados é:"+ media);// exibicao da media

    } // main end
} // class end
