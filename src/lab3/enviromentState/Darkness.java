package lab3.enviromentState;

import classes.StateOfNature;

public class Darkness extends StateOfNature {

    public Darkness(String name, boolean isOccured) {
        super(name, isOccured);
    }

    public void hadCome() {
        System.out.println(getName() + " наступили");
        setIsOccured(true);
    }



}
