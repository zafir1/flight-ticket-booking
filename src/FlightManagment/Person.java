package FlightManagment;

public class Person {
    private String name;
    private int age;
    private String email;
    private String contact;

    public Person(String name, int age, String email, String contact) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    //    private Person(Builder builder){
//        this.name = builder.name;
//        this.age = builder.age;
//        this.email = builder.email;
//        this.contact = builder.contact;
//    }
//
//    public static class Builder{
//        private String name;
//        private int age;
//        private String email;
//        private String contact;
//
//        public Builder(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public Builder Email(String email){
//            this.email = email;
//            return this;
//        }
//
//        public Builder Contact(String contact){
//            this.contact = contact;
//            return this;
//        }
//
//        public Person Build(){
//            Person person = new Person(this);
//            return person;
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
