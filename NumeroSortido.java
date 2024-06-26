import java.util.Random;
import java.util.Scanner;

public class NumeroSortido {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 10) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o escolhido");
            } else {
                System.out.println("O número digitado é maior que o escolhido.");
            }
        }

        if (tentativas == 10 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 10 tentativas. O número era: " + numeroGerado);
        }
    }
}