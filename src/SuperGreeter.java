import java.util.Scanner;

public class SuperGreeter {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SuperGreeter superGreeter = new SuperGreeter();

        superGreeter.start();
        superGreeter.Greet();
    }

    public void start(){
        System.out.println("Det virker!");
    }

    public void Greet(){
        System.out.println("Indtast dit navn");
        String navn = scanner.next();

        System.out.println("Hej " + navn);
    }
}
