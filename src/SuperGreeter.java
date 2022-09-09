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
        System.out.print("Indtast dit navn: ");
        String navn = scanner.next();

        System.out.println("Hej " + navn);
        System.out.println("Du er " + askAboutAge() + " år gammel");
    }

    public int askAboutAge(){
        System.out.print("Hvor gammel er du? ");
        int alder = scanner.nextInt();

        return alder;
    }
}
