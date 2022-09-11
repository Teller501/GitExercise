import java.util.Scanner;

public class SuperGreeter {

    Scanner scanner = new Scanner(System.in);
    private int age;
    private String navn;

    public static void main(String[] args) {
        SuperGreeter superGreeter = new SuperGreeter();

        superGreeter.Greet();
        superGreeter.start();

    }

    public void start(){

        // Får alder som input fra bruger
        System.out.print("Hvor gammel er du? ");
        age = scanner.nextInt();
        System.out.println("Du er " + age + " år gammel"); // Printer brugers alder
        System.out.println("Du er født i " + calculateYear() + " eller i " + (calculateYear() - 1)); // Printer årstal bruger er født i

        askAboutMood();
    }

    private void askAboutMood() {
        char answer;
        do {
            System.out.print("Har du det godt, " + navn + "? (j/n) ");
            answer = scanner.next().charAt(0);

            if (answer == 'j') {
                System.out.println("Det er godt at høre!");
            } else if (answer == 'n') {
                System.out.println("Det var knap så godt, drik en bajer!");
            } else {
                System.out.println("Ugyldigt input");
            }

        }while (answer != 'j' && answer != 'n') ;
    }

    public void Greet(){
        System.out.print("Indtast dit navn: ");
        navn = scanner.next();

        System.out.println("Hej " + navn);
    }



    public int calculateYear(){
        int year = 2022 - age;
        return year;
    }

    public int askAboutPets(){
        System.out.print("Hvor mange dyr har du? ");
        int petAmount = scanner.nextInt();
        return petAmount;
    }

    public Pet createPet(){
        System.out.print("Hvilket kæledyr har du? ");
        String type = scanner.next();
        System.out.print("Hvad hedder dit kæledyr? ");
        String name = scanner.next();

        return new Pet(type, name);
    }
}
