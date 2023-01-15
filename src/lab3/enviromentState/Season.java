package lab3.enviromentState;

import classes.StateOfNature;

public class Season extends StateOfNature {
    public void comeBack() {
        System.out.println(getName() + " возвращалась");
        setIsOccured(true);
    }

    public void notPresage(Easter easter) {
        System.out.println(getName() + " не предвещала " + easter);
        setIsOccured(true);
        System.out.println();
    }
    public Season(String name, boolean isOccurred) {
        super(name, isOccurred);
    }

}
