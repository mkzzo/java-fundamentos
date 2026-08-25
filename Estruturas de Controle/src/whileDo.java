import java.util.Scanner;

public class whileDo {public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var name = "";
    while (true){  //While == Enquanto | Vai rolar até algo interromper.
        System.out.println("Qual seu nome?");
        name = scanner.next();
        System.out.println(name);

        if (name.equalsIgnoreCase("Exit")) break; // Situação para travar, se o nome for igual a Exit, ele para
    }


}

}
