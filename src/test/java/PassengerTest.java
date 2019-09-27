import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Kyle", 2);
    }

    @Test
    public void canGetNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }

}
