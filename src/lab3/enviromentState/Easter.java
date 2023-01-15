package lab3.enviromentState;

import classes.StateOfNature;

public class Easter extends StateOfNature {
    public Easter(String name, boolean isOccured) {
        super(name, isOccured);
    }

    @Override
    public String toString() {
        return getName();
    }
}
