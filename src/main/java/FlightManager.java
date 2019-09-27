public class FlightManager {

    public FlightManager(){

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

}
