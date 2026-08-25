import java.util.Scanner;

public class exDivisor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o número inicial (divisor base): ");
        var numeroInicial = scanner.nextInt();
        if (numeroInicial == 0) {
            System.out.println("O número inicial não pode ser 0.");
            return;
        }

        System.out.printf("Digite números inteiros (múltiplos de %d para continuar):%n", numeroInicial);

        while (true) {
            System.out.print("Informe um número: ");
            var numero = scanner.nextInt();
            if (numero < numeroInicial) {
                System.out.printf("-> Número %d ignorado (é menor que %d).%n", numero, numeroInicial);
                continue;
            }
            if (numero % numeroInicial != 0) {
                System.out.printf("%nEncerrando: %d %% %d = %d (resto diferente de 0).%n",
                        numero, numeroInicial, numero % numeroInicial);
                break;
            }
            System.out.printf("-> %d é múltiplo de %d (resto 0). Continuando...%n", numero, numeroInicial);
        }
    }

    }
