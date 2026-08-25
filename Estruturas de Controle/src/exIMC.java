import java.util.Scanner;

public class exIMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu peso:");
        var peso = scanner.nextFloat();
        System.out.println("Informe sua altura:");
        var altura = scanner.nextFloat();
        var imc = (peso / (altura * altura));

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II.");
        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III (Mórbida).");
        }
    }
}
