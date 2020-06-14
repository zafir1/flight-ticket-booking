package FlightManagment;

public class Address {
    private String addressLine = null;
    private String city = null;
    private String state = null;
    private String zip = null;
    private String country = null;

    private Address(Builder builder) {
        this.addressLine = builder.addressLine;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
        this.country = builder.country;
    }

    public static class Builder{
        private String addressLine;
        private String city;
        private String state;
        private String zip;
        private String country;

        public Builder AddressLine(String addressLine){
            this.addressLine = addressLine;
            return this;
        }

        public Builder City(String city){
            this.city = city;
            return this;
        }

        public Builder State(String state){
            this.state = state;
            return this;
        }

        public Builder Zip(String zip){
            this.zip = zip;
            return this;
        }

        public Builder Country(String country){
            this.country = country;
            return this;
        }

        public Address Build(){
            Address address = new Address(this);
            return address;
        }
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
