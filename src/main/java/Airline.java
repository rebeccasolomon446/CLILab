import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airline {

    private ArrayList<String> destination;
//    private Integer id;
    private ArrayList<Passenger> passenger;
    private boolean running;
    private ArrayList<String> availableFlights;


    public Airline() {
        this.destination = new ArrayList<>();
//        this.id = id;
        this.running = false;
        this.passenger = new ArrayList<>();
        this.availableFlights = new ArrayList<>();


    }

    public boolean isRunning() {
        return this.running;
    }

    public String start() {
        this.running = running;
        return "Welcome to BNTA Airlines";
    }

    public String promptForDestination() {
        ArrayList<String> destination = new ArrayList<>();
        destination.add("France");
        destination.add("Spain");
        destination.add("Germany");
        destination.add("Belgium");
        destination.add("Italy");
        System.out.println(destination);
        return "Please choose from the following destinations";
    }

    public String showAvailableFlights(){
        ArrayList<String> availableFlights = new ArrayList<>();
        availableFlights.add("France - 18:00");
        availableFlights.add("Spain - 14:00");
        availableFlights.add("Germany - 11:00");
        availableFlights.add("Belgium - 09:00");
        availableFlights.add("Italy - 19:00");
        System.out.println(availableFlights);
        return "Please choose the flights available";

    }

    public String addPassenger(){
        ArrayList<String> passengers = new ArrayList<>();
        passengers.add("Lucy");
        return "You've been added";

    }


}
