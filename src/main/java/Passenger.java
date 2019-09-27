public class Passenger {

    private String name;
    private int noOfBags;
    private String flightNo;
    private int seatNumber;

    public Passenger(String name, int noOfBags){
        this.name = name;
        this.noOfBags = noOfBags;
        this.flightNo = new String();
        this.seatNumber = 0;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
