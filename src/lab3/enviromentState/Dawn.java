package lab3.enviromentState;

import classes.StateOfNature;

public class Dawn extends StateOfNature {


    private String status;

    public void shineLikeStripOnWest() {
        System.out.println(status + getName() + " светилась узкой полосой на западе");
        setIsOccured(true);
        System.out.println();
    }
    @Override
    public String toString() {
        return status;
    }
    public Dawn(String name, boolean isOccured, String status) {
        super(name, isOccured);
        this.status = status;
    }
}
