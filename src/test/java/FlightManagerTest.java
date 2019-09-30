import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightManagerTest {

    FlightManager flightManager;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;
    Passenger passenger10;
    Flight flight;
    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR4767", "AMS", "GLA", 1/04/2019, 07, 03 );
        flightManager = new FlightManager(flight);
        passenger = new Passenger("Kyle", 2);
        passenger2 = new Passenger("Kyle2", 2);
        passenger3 = new Passenger("Kyle", 2);
        passenger4 = new Passenger("Kyle", 2);
        passenger5 = new Passenger("Kyle", 2);
        passenger6 = new Passenger("Kyle", 2);
        passenger7 = new Passenger("Kyle", 2);
        passenger8 = new Passenger("Kyle", 2);
        passenger9 = new Passenger("Kyle", 2);
        passenger10 = new Passenger("Kyle", 2);
        flight.randomNumberArray();
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        flight.bookPassenger(passenger6);
        flight.bookPassenger(passenger7);
        flight.bookPassenger(passenger8);
        flight.bookPassenger(passenger9);
        flight.bookPassenger(passenger10);
    }

    @Test
    public void canGetReservedBaggageAmount(){
        assertEquals(45, flightManager.reservedBaggageWeight(PlaneType.BOEING747), 0.01);
    }

    @Test
    public void canGetReservedBaggageAmountConcord(){
        assertEquals(45, flightManager.reservedBaggageWeight(PlaneType.CONCORD), 0.01);
    }

    @Test
    public void howMuchBaggageWeightIsBooked(){
        assertEquals(40, flightManager.weightOfBagsBooked(passenger));
    }

    @Test
    public void howMuchBaggageWeightRemains(){
        assertEquals(1600, flightManager.howMuchWeightRemainsForFlight(PlaneType.BOEING747, flight));
    }

    @Test
    public void bubbleArrayWorks(){
        flightManager.bubbleSort();
        assertTrue(this.flight.getPassengers().get(0).getSeatNumber() < this.flight.getPassengers().get(1).getSeatNumber());
        assertTrue(this.flight.getPassengers().get(1).getSeatNumber() < this.flight.getPassengers().get(2).getSeatNumber());
        assertTrue(this.flight.getPassengers().get(2).getSeatNumber() < this.flight.getPassengers().get(3).getSeatNumber());
        assertTrue(this.flight.getPassengers().get(3).getSeatNumber() < this.flight.getPassengers().get(4).getSeatNumber());
    }
}
