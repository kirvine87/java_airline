import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;
    ArrayList<Integer> number = new ArrayList();


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, int date, int hours, int min){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = new Date(date, hours, min);
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
            String flightNo = getFlightNumber();
            passenger.setFlightNo(flightNo);
            passenger.setSeatNumber(getRandomNumber());
            this.passengers.add(passenger);
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void randomNumberArray(){
        for (int i = 1; i < noOfAvailableSeats(plane) + 1 ; i++) {
            number.add(i);
        }
    }

    public int getRandomNumber(){
        Collections.shuffle(number);
        return number.remove(0);
    }

    public int noNumberTheSame(){
        int total = 0;
        for (Passenger passenger : passengers){
            int value = passenger.getSeatNumber();
            total += value;
        }
        return total;
    }

//
//    public void bubbleSort(ArrayList<Integer> x) {
//        boolean swapped = true;
//        while (swapped) {
//            swapped = false;
//            for(int i=1; i<x.size(); i++) {
//                if(x.get(i) > x.get(i+1)) {
//                    int temp = x.get(i+1);
//                    number.set(i+1, x.get(i));
//                    number.set(i, temp);
//                    swapped = true;
//                }
//            }
//        }
//    }


    public ArrayList<Integer> getNumber() {
        return number;
    }

    public int lastNumber(){
        return number.get(0);
    }

}
