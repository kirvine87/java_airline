import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Passenger passenger;
    Passenger passenger2;
    Flight flight;
    Plane plane;

    @Before
    public void setUp(){
        flightManager = new FlightManager();
        passenger = new Passenger("Kyle", 2);
        passenger2 = new Passenger("Kyle2", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR4767", "AMS", "GLA", 1/04/2019, 07, 03 );
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger2);
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
        assertEquals(1920, flightManager.howMuchWeightRemainsForFlight(PlaneType.BOEING747, flight));
    }
}
