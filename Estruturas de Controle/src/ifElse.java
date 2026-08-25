import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe sua idade:");
        var age= scanner.nextInt();
        System.out.println("Tu é Emancipado?(s/n)");
        var isEmancipated= scanner.next().equalsIgnoreCase("s");

        if (age >= 18 || age >= 16 && isEmancipated ) {
            System.out.printf("%s Como você já tem %s, Você já pode dirigir! IHUUUUU", name ,age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, mesmo sendo de menor, você é emancipado, então vai lá.", name);

        } else
        {
            System.out.printf("%s, você nem tem idade pra nada paizão", name);
        }

    }
}
