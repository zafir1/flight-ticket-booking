package FlightManagment;

import java.util.List;

public class PNR {
    private Long id;
    private int totalFare;
    private List<Person>people;
    private FlightInstance flightInstance;

    public PNR(Long id, int totalFare, List<Person> people, FlightInstance flightInstance) {
        this.id = id;
        this.totalFare = totalFare;
        this.people = people;
        this.flightInstance = flightInstance;
    }

    public int cancelTicket(int members){
        if(members <= people.size()){
            return (this.flightInstance.getBaseFare()*members);
        }
        return 0;
    }
}
