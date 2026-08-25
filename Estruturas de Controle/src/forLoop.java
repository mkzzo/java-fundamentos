import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Diga um número");
    var number = scanner.next();
    for (var i = 0; i < 10; i++){    //PRIMEIRO DECLARA A VARIÁVEL NECESSÁRIA PARA O LOOP, DIGA A LIMITAÇÃO DO LOOP E O PORQUÊ DELE NÃO SER INFINITO;
        System.out.printf("Seu número é mesmo %s?\n", number);
        if (i == 10) break;
    }
}
}
