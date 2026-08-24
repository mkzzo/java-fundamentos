import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    System.out.println("Qual seu nome colega?");
    var name = scanner.next();
    System.out.println("Quantos anos você tem?");
    var age = scanner.nextInt();
    System.out.printf("Seu nome é %s e você tem %s anos!\n", name , age);
}