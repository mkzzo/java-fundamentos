import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    System.out.println("Vamos descobrir a área do retângulo, diga a altura!");
    var size1 = scanner.nextFloat();
    System.out.println("Agora a base");
    var size2 = scanner.nextFloat();
    var area = size1 * size2;
    System.out.printf("A Área do retângulo é %s \n", area);
}