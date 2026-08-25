import java.util.Scanner;

public class exImparPar {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número (menor): ");
    var inicio = scanner.nextInt();

    System.out.print("Digite o segundo número (maior que o primeiro): ");
    var fim = scanner.nextInt();

    if (fim <= inicio) {
        System.out.println("Erro: O segundo número deve ser obrigatoriamente maior que o primeiro.");
        return;
    }
    System.out.print("Deseja ver os números Pares ou Impares? Digite P ou I: ");
    var opcao = scanner.next().toUpperCase();

    System.out.printf("%nNúmeros selecionados no intervalo de %d até %d (ordem decrescente):%n", inicio, fim);

    for (int i = fim; i >= inicio; i--) {
        if (opcao.equals("P") && i % 2 == 0) {
            System.out.println(i);
        } else if (opcao.equals("I") && i % 2 != 0) {
            System.out.println(i);
        }
    }

}
}
