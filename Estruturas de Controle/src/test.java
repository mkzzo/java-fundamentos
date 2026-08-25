import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if (idade <= 17) {
            System.out.println("Menor de idade.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Maior de idade");
        } else if (idade >= 65) {
            System.out.println("idoso");

        }
    }
}