import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Diga um número entre 1 e 7!");
        var option = scanner.nextInt();
        var message  = switch (option){  //Dessa maneira, você atribui valor a uma variável pelo o que for selecionado.
            case 1 -> "Segunda";
            case 2 -> "Terça";
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Não há essa opção.";
        };
        System.out.printf("%s", message); //Aqui você dá o print no terminal com a sua variável editada pelo Switch



    /*
    Dá para fazer desta maneira.
    ===========================================================================================================
    switch (option) {      //switch + variável nos parenteses
        case 1:
            System.out.println("Segunda");  //Caso escolha um, isso deve ser feito e assim por diante
            break;
        case 2:
            System.out.println("Terça");
            break;
        case 3:
            System.out.println("Quarta");
            break;
        case 4:
            System.out.println("Quinta");
            break;
        case 5:
            System.out.println("Sexta");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default: //Caso não seja selecionado nenhuma das opções anteriores.
            System.out.println("Opção inválida");

    }

     */



    }
}
