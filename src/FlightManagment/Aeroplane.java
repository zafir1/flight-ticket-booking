package FlightManagment;

import java.util.ArrayList;
import java.util.List;

public class Aeroplane {
    private int uniqueID;
    private int seatRow;
    private int seatColumn;
    private String company;
    private Airport currentLocation;
    private List<FlightInstance>flightInstances = new ArrayList<>();

    public Aeroplane(int uniqueID,int seatRow, int seatColumn, String company) {
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        this.uniqueID = uniqueID;
        this.company = company;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public int getSeatColumn() {
        return seatColumn;
    }

    public String getCompany() {
        return company;
    }

    public List<FlightInstance> getFlightInstances() {
        return flightInstances;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public int getTotalSeats(){
        return (this.seatRow * this.seatColumn);
    }

    public boolean addFlightInstance(FlightInstance flightInstance){
        if(this.flightInstances.contains(flightInstance)){
            return false;
        }
        this.flightInstances.add(flightInstance);
        return true;
    }

    public Airport getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Airport currentLocation) {
        this.currentLocation = currentLocation;
    }
}
