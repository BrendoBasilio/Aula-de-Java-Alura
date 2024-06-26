 import java.util.Scanner;

    public class PositivoOuNegativo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número positivo ou negativo: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Número positivo");
            } else {
                System.out.println("Número negativo");
            }
        }
    }

