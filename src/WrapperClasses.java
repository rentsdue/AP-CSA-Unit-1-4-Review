import java.util.ArrayList;

public class WrapperClasses {

    //Integer objects
    Integer newInteger=5;
    Integer newInteger1=6;

    //Double objects
    Double newDouble=22.0;
    Double newDouble1=23.44;

    //Other objects
    Float newFloat=0.55f;
    Character newChar='E';
    Boolean newBool=false;

    ArrayList<Integer> intList= new ArrayList<>();
    ArrayList<Double> doubleList= new ArrayList<>();

    //Adding objects into arraylists
    public void addObjects() {
        intList.add(newInteger);
    }
}
