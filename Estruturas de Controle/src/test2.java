import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int resto = a % b;
        System.out.println(soma);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(resto);


        //System.out.println(a + b);
        //System.out.println(a - b);
        //System.out.println(a * b);
        //System.out.println(a / b);
        //System.out.println(a % b);
        //Assim dá também

    }
}
