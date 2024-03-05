package vetor;

public class Exercise06_medium { // class start - Make an algorithm to read an integer, calculate and display the
    // Factorial of the number entered. Ex.: Typed 10. 10*(10-1)*(10-2)*(10-3)..
    // *(10-1) = 3,628,800
    public static void main(String[] args) {
        int numeroFatorialDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro, para calcular o fatorial"));

        for (int i = numeroFatorialDigitado; i > 1; i--) {
            numeroFatorialDigitado = numeroFatorialDigitado * (i - 1);
        }
        if (numeroFatorialDigitado == 0) {
            System.out.println("O Fatorial do numero digitado é: 1");
        }else {
            System.out.println("O Fatorial do numero digitado é: " + numeroFatorialDigitado);
        }
    }
}
