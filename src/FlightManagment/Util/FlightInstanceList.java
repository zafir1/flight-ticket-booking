package FlightManagment.Util;

import FlightManagment.FlightInstance;

import java.util.ArrayList;
import java.util.List;

public class FlightInstanceList {
    private int id = 0;
    private List<FlightInstance> flightInstances = new ArrayList<>();
    private AirportList airportList = AirportList.getInstance();
    private static FlightInstanceList Instance = null;

    private FlightInstanceList() {
        this.addFlightInstance("CCU","MUM");
        this.addFlightInstance("CCU","HYD");
        this.addFlightInstance("MUM","BLR");
        this.addFlightInstance("HYD","BLR");

    }

    public static FlightInstanceList getInstance(){
        if(Instance==null){
            Instance = new FlightInstanceList();
        }
        return Instance;
    }

    public List<FlightInstance> getFlightInstances() {
        return flightInstances;
    }

    public FlightInstance getFlightInstanceById(int id){
        for(FlightInstance flightInstance:flightInstances){
            if (flightInstance.getId()==id){
                return flightInstance;
            }
        }
        return null;
    }

    public FlightInstance addFlightInstance(String from,String to){
        if(from.equals(to)) return null;
        FlightInstance flightInstance = new FlightInstance.Builder().Id(id++)
                .ArrivalAirport(airportList.getAirportByCode(from))
                .DepartureAirport(airportList.getAirportByCode(to))
                .Build();
        this.flightInstances.add(flightInstance);
        return flightInstance;
    }

    public boolean removeFlightInstance(FlightInstance flightInstance){
        return this.flightInstances.remove(flightInstance);
    }
}
