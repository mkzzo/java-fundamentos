import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    System.out.println("Diga a idade da primeira pessoa!");
    var firstPerson  = scanner.nextInt();
    System.out.println("Diga a idade da segunda pessoa!");
    var secondPerson = scanner.nextInt();
    var difference = firstPerson - secondPerson;
    System.out.printf("A idade da primeira pessoa é %s, da segunda pessoa é %s. \n", firstPerson , secondPerson);
    System.out.printf("A Diferença entre as duas pessoas de idade é %s \n", difference);
}