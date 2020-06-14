package FlightManagment.Util;

import FlightManagment.Airport;

import java.util.ArrayList;
import java.util.List;

public class AirportList {
    private List<Airport> airportList = new ArrayList<>();
    private AddressList addressList = AddressList.getInstance();
    private static AirportList Instance = null;

    private AirportList() {
        this.airportList.add(new Airport("Hyderabad Airport",addressList.getAddressList().get(0),"HYD"));
        this.airportList.add(new Airport("Bangalore Airport",addressList.getAddressList().get(1),"BLR"));
        this.airportList.add(new Airport("Chennai Airport",addressList.getAddressList().get(1),"MMU"));
        this.airportList.add(new Airport("Kolkata Airport",addressList.getAddressList().get(1),"CCU"));
    }

    public static AirportList getInstance(){
        if(Instance==null){
            Instance = new AirportList();
        }
        return Instance;
    }

    public Airport getAirportByCode(String code){
        for(Airport airport:airportList){
            if(airport.getCode().equals(code)){
                return airport;
            }
        }
        return null;
    }

    public List<Airport> getAirportList() {
        return airportList;
    }

    public boolean addAirport(Airport airport){
        return this.airportList.add(airport);
    }

    public boolean removeAirport(Airport airport){
        return this.airportList.remove(airport);
    }
}
