import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
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


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("Kyle", 2);
        passenger2 = new Passenger("Kyle", 2);
        passenger3 = new Passenger("Kyle", 2);
        passenger4 = new Passenger("Kyle", 2);
        passenger5 = new Passenger("Kyle", 2);
        passenger6 = new Passenger("Kyle", 2);
        passenger7 = new Passenger("Kyle", 2);
        passenger8 = new Passenger("Kyle", 2);
        passenger9 = new Passenger("Kyle", 2);
        passenger10 = new Passenger("Kyle", 2);

        flight = new Flight(plane, "FR4767", "AMS", "GLA", 21/02/2019, 06, 27);
    }

    @Test
    public void getNumberOfSeats(){
        assertEquals(10, flight.noOfAvailableSeats(plane));
    }

    @Test
    public void canBookAPassenger(){
        flight.randomNumberArray();
        flight.bookPassenger(passenger);
        assertEquals(9, flight.remainingSeats());
        assertEquals("FR4767", passenger.getFlightNo());
    }

    @Test
    public void noSeatNumberTheSame(){
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
        assertEquals(55, flight.noNumberTheSame());
    }

//    @Test
//    public void bubbleArrayWorks(){
//        flight.randomNumberArray();
//        flight.bookPassenger(passenger);
//        flight.bookPassenger(passenger2);
//        flight.bookPassenger(passenger3);
//        flight.bookPassenger(passenger4);
//        flight.bookPassenger(passenger5);
//        flight.bookPassenger(passenger6);
//        flight.bookPassenger(passenger7);
//        flight.bookPassenger(passenger8);
//        flight.bookPassenger(passenger9);
//        flight.bookPassenger(passenger10);
//        flight.bubbleSort(flight.getNumber());
//        assertEquals(10, flight.lastNumber());
//    }

}
