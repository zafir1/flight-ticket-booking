package FlightManagment;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private Address address;
    private String code;
    List<FlightInstance>flightInstances = new ArrayList<>();

    public Airport(String name, Address address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public List<FlightInstance> getFlightInstances() {
        return flightInstances;
    }

    public boolean addFlightInstance(FlightInstance flightInstance){
        return this.flightInstances.add(flightInstance);
    }

    public boolean removeFlightInstance(FlightInstance flightInstance){
        return this.flightInstances.remove(flightInstance);
    }
}
