package FlightManagment.Util;

import FlightManagment.Aeroplane;
import FlightManagment.Airport;
import FlightManagment.FlightInstance;
import FlightManagment.Person;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Aeroplane>aeroplanes = new ArrayList<>();
    private List<Airport>airports = new ArrayList<>();
    private List<FlightInstance>flightInstances = new ArrayList<>();
    private List<Person>people = new ArrayList<>();

    public List<Aeroplane> getAeroplanes() {
        return aeroplanes;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public List<FlightInstance> getFlightInstances() {
        return flightInstances;
    }

    public List<Person> getPeople() {
        return people;
    }

    public boolean addAeroplane(Aeroplane aeroplane){
        return this.aeroplanes.add(aeroplane);
    }

    public boolean addAirport(Airport airport){
        return this.airports.add(airport);
    }

    public boolean addFlightInstance(FlightInstance flightInstance){
        return this.flightInstances.add(flightInstance);
    }

    public boolean addPeople(Person person){
        return this.people.add(person);
    }

    public boolean removeAeroplane(Aeroplane aeroplane){
        return this.aeroplanes.remove(aeroplane);
    }

    public boolean removeAirport(Airport airport){
        return this.airports.remove(airport);
    }

    public boolean removeFlightInstance(FlightInstance flightInstance){
        return this.flightInstances.remove(flightInstance);
    }

    public boolean removePerson(Person person){
        return this.people.remove(person);
    }
}
