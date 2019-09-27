import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, int date, int hours, int min){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = new Date(date, hours, date);
        passengers = new ArrayList<Passenger>();
    }


    public int noOfAvailableSeats(Plane plane){
        return plane.getModel().getCapacity();
    }

    public int remainingSeats(){
        return noOfAvailableSeats(plane) - passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (remainingSeats() <= noOfAvailableSeats(plane)) {
            this.passengers.add(passenger);
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
