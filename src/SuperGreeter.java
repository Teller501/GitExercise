import java.util.Scanner;

public class SuperGreeter {

    Scanner scanner = new Scanner(System.in);
    private int age;

    public static void main(String[] args) {
        SuperGreeter superGreeter = new SuperGreeter();

        superGreeter.Greet();
        superGreeter.start();

    }

    public void start(){
        System.out.print("Hvor gammel er du? ");
        age = scanner.nextInt();
        System.out.println("Du er " + age + " år gammel");
        System.out.println("Du er født i " + calculateYear() + " eller i " + (calculateYear() - 1));
    }

    public void Greet(){
        System.out.print("Indtast dit navn: ");
        String navn = scanner.next();

        System.out.println("Hej " + navn);
    }


    public int calculateYear(){
        int year = 2022 - age;
        return year;
    }
}
