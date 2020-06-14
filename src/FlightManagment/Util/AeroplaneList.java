package FlightManagment.Util;

import FlightManagment.Aeroplane;

import java.util.ArrayList;
import java.util.List;

public class AeroplaneList {
    private List<Aeroplane> aeroplaneList = new ArrayList<>();
    private int aeroplaneId = 0;
    private static AeroplaneList Instance = null;

    private AeroplaneList() {
        this.aeroplaneList.add(new Aeroplane(this.aeroplaneId++,30,6,"Indigo"));
        this.aeroplaneList.add(new Aeroplane(this.aeroplaneId++,20,4,"Indigo"));
        this.aeroplaneList.add(new Aeroplane(this.aeroplaneId++,30,6,"Indigo"));
        this.aeroplaneList.add(new Aeroplane(this.aeroplaneId++,30,6,"Indigo"));
    }

    public static AeroplaneList getInstance(){
        if(Instance==null){
            Instance = new AeroplaneList();
        }
        return Instance;
    }

    public List<Aeroplane> getAeroplaneList() {
        return aeroplaneList;
    }

    public void setAeroplaneList(List<Aeroplane> aeroplaneList) {
        this.aeroplaneList = aeroplaneList;
    }

    public boolean addAeroplane(Aeroplane aeroplane){
        return aeroplaneList.add(aeroplane);
    }

    public boolean removeAeroplane(Aeroplane aeroplane){
        return this.aeroplaneList.remove(aeroplane);
    }
}
