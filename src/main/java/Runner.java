import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Airline flight1 = new Airline();

        System.out.println(flight1.start());

        while(flight1.isRunning()) {

            System.out.println(flight1.promptForDestination());

            String destination = scanner.nextLine();

        }
    }
}
