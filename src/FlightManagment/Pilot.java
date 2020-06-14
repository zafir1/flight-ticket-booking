package FlightManagment;

public class Pilot extends Person {
    private boolean aeroplaneFlyingSkill = false;
    public Pilot(String name, int age, String email, String contact) {
        super(name, age, email, contact);
    }

    public boolean developAeroplaneFlyingSkill(){
        System.out.println("Developing Aeroplane flying skill...");
        this.aeroplaneFlyingSkill = true;
        return true;
    }

    public void FlyAeroplane(){
        if(this.aeroplaneFlyingSkill){
            System.out.println("YaY... | Flying Aeroplane");
        }else{
            System.out.println("Opps... | I need to skill myself");
        }
    }
}
