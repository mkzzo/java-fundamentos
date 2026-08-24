import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    System.out.println("Vamos descobrir a área do quadrado, diga o tamanho de um lado dele");
    var size1 = scanner.nextFloat();
    var area = size1 * size1;
    System.out.printf("A Área do quadrado é %s \n", area);
}