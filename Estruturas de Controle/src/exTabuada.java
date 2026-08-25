import java.util.Scanner;

public class exTabuada {public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Informe um número para eu gerar a tabuada:");
    var number = scanner.nextInt();
    for (int i = 0; i < 11; i++) {
        System.out.printf("%s X %s = %s\n", number, i, (number*i));

    }

}
}

