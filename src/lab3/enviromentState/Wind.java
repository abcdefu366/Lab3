package lab3.enviromentState;

import classes.StateOfNature;

public class Wind extends StateOfNature {

    public void blow() {
        System.out.println(getName() + " дул");
        setIsOccured(true);
    }
    public Wind(String name, boolean isOccured) {
        super(name, isOccured);
    }

}
