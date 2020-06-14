package FlightManagment.Util;

import FlightManagment.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressList {
    private List<Address>addressList = new ArrayList<>();
    private static AddressList Instance = null;

    private AddressList() {
        this.addressList.add(new Address.Builder().AddressLine("Hyderabad airport Address line")
                .City("Hyderabad").State("Telangana").Zip("500032").Country("India").Build());
        this.addressList.add(new Address.Builder().AddressLine("Bangalore Airport address line")
                .City("Bangalore").Zip("847211").State("Karnataka").Country("India").Build());
        this.addressList.add(new Address.Builder().AddressLine("Chennai Airport Address line")
                .City("Chennai").State("Tamilnadu").Zip("600032").Country("India").Build());
        this.addressList.add(new Address.Builder().AddressLine("Kolkata ariport Address line")
                .City("Kolkata").State("West Bengal").Zip("721657").Country("India").Build());
    }

    public static AddressList getInstance(){
        if(Instance==null){
            Instance = new AddressList();
        }
        return Instance;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public boolean addAddress(Address address){
        return this.addressList.add(address);
    }

    public boolean removeAddress(Address address){
        return this.addressList.remove(address);
    }
}
