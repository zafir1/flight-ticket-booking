package FlightManagment;

public class FlightInstance {
    private int id;
    private Airport departure;
    private Airport arrival;
    private Aeroplane aeroplane;
    private int baseFare;
    private int gateNumber;
    private int bookedSeats;
    private SeatMapping seatMapping;
    private String departureTime;
    private String arrivalTime;

    public FlightInstance(Builder builder){
        this.id = builder.id;
        this.departure = builder.departure;
        this.arrival = builder.arrival;
        this.aeroplane = builder.aeroplane;
        this.baseFare = builder.baseFare;
        this.gateNumber = builder.gateNumber;
        this.bookedSeats = builder.bookedSeats;
        this.seatMapping = builder.seatMapping;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
    }

    public static class Builder{
        private int id;
        private Airport departure;
        private Airport arrival;
        private Aeroplane aeroplane;
        private int baseFare;
        private int gateNumber;
        private int bookedSeats = 0;
        private SeatMapping seatMapping;
        private String departureTime;
        private String arrivalTime;

        public Builder Id(int id){
            this.id = id;
            return this;
        }

        public Builder DepartureAirport(Airport departure){
            this.departure = departure;
            return this;
        }

        public Builder ArrivalAirport(Airport arrival){
            this.arrival = arrival;
            return this;
        }

        public Builder Aeroplane(Aeroplane aeroplane){
            this.aeroplane = aeroplane;
            return this;
        }

        public Builder BaseFare(int baseFare){
            this.baseFare = baseFare;
            return this;
        }

        public Builder GateNumber(int gateNumber){
            this.gateNumber = gateNumber;
            return this;
        }

        public Builder SeatMapping(SeatMapping seatMapping){
            this.seatMapping = seatMapping;
            return this;
        }

        public Builder DepartureTime(String departureTime){
            this.departureTime = departureTime;
            return this;
        }

        public Builder ArrivalTime(String arrivalTime){
            this.arrivalTime = arrivalTime;
            return this;
        }

        public FlightInstance Build(){
            FlightInstance flightInstance = new FlightInstance(this);
            return flightInstance;
        }
    }

    public int getId() {
        return id;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public Aeroplane getAeroplane() {
        return aeroplane;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public SeatMapping getSeatMapping() {
        return seatMapping;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setAeroplane(Aeroplane aeroplane) {
        this.aeroplane = aeroplane;
    }

    public void setBaseFare(int baseFare) {
        this.baseFare = baseFare;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void setSeatMapping(SeatMapping seatMapping) {
        this.seatMapping = seatMapping;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
