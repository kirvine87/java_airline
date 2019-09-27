import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("Kyle", 2);
        flight = new Flight(plane, "FR4767", "AMS", "GLA", "15:00");
    }

    @Test
    public void getNumberOfSeats(){
        assertEquals(10, flight.noOfAvailableSeats(plane));
    }

    @Test
    public void canBookAPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(9, flight.remainingSeats());
    }

}
