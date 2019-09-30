import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int reservedBaggageWeight(PlaneType model){
        return (model.getTotalWeight() / model.getCapacity() - 155);
    }

    public int weightOfBagsBooked(Passenger passenger){
        return passenger.getNoOfBags() * 20;
    }

    public int weightOfBagsBookedForFlight(Flight flight){
        int total = 0;
        for (Passenger passenger : flight.getPassengers()){
            int weight = weightOfBagsBooked(passenger);
            total += weight;
        }
        return total;
    }

    public int howMuchWeightRemainsForFlight(PlaneType model, Flight flight){
        return model.getTotalWeight() - weightOfBagsBookedForFlight(flight);
    }

    public void bubbleSort() {
        ArrayList<Passenger> passengers = this.flight.getPassengers();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for(int i=0; i<passengers.size() - 1; i++) {
                if(passengers.get(i).getSeatNumber() > (passengers.get(i+1).getSeatNumber())) {
                    Passenger temp = passengers.get(i);
                    passengers.set(i, passengers.get(i+1));
                    passengers.set(i+1, temp);
                    swapped = true;
                }
            }
        }
    }

}
