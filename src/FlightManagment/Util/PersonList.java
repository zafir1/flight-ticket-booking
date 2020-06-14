package FlightManagment.Util;

import FlightManagment.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person>people = new ArrayList<>();
    private static PersonList Instance = null;

    private PersonList() {
        this.people.add(new Person("Zafir",24,"ahmadzafir@gmail.com","9113375166"));
        this.people.add(new Person("Nasir",22,"ahmadnasir@gmail.com","9113375167"));
        this.people.add(new Person("Nazir",50,"ahmadnazir@gmail.com","9113375168"));
        this.people.add(new Person("faisal",24,"faisal@gmail.com","9113375169"));
    }

    public static PersonList getInstance(){
        if(Instance==null){
            Instance = new PersonList();
        }
        return Instance;
    }


    public List<Person> getPeople() {
        return people;
    }

    public boolean addPerson(Person person){
        return this.people.add(person);
    }

    public boolean removePerson(Person person){
        return this.people.remove(person);
    }
}
