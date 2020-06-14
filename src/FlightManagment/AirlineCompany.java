package FlightManagment;

public class AirlineCompany {
    private int aeroplaneId = 0;
    private int flightInstanceId = 0;
    private int airportId = 0;
    private String name = "Indigo";
    Aeroplane aeroplane1 = new Aeroplane(++aeroplaneId,30,6,this.name);
    Aeroplane aeroplane2 = new Aeroplane(++aeroplaneId,30,6,this.name);
    Aeroplane aeroplane3 = new Aeroplane(++aeroplaneId,20,4,this.name);

    Address address1 = new Address.Builder().AddressLine("Hyderabad airport Address line")
            .City("Hyderabad").State("Telangana").Zip("500032").Country("India").Build();
    Address address2 = new Address.Builder().AddressLine("Bangalore Airport address line")
            .City("Bangalore").Zip("847211").State("Karnataka").Country("India").Build();
    Address address3 = new Address.Builder().AddressLine("Chennai Airport Address line")
            .City("Chennai").State("Tamilnadu").Zip("600032").Country("India").Build();
    Address address4 = new Address.Builder().AddressLine("Kolkata ariport Address line")
            .City("Kolkata").State("West Bengal").Zip("721657").Country("India").Build();

    Airport hyderabadAirport = new Airport("Hyderabad Airport",address1,"HYD");
    Airport kolkataAirport = new Airport("Kolkata Airport",address4,"CCU");
    Airport bangaloreAirport = new Airport("Bangalore International Airport",address2,"BLR");
    Airport chennaiAirport = new Airport("Chennai Airport",address3,"MMU");


}
