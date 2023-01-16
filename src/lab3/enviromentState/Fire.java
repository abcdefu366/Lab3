package lab3.enviromentState;

import classes.StateOfNature;
import lab3.people.Student;

public class Fire extends StateOfNature {

    private String status;

    public void quietlyBlinkedInTheDark() {
        System.out.println(getName() + " спокойно мигал в темноте");
    }
    public void becameUnsociable() {
        String people = "Люди";
        double a = 1;
        double b = Math.random();
        int delay = 1000;
        while (a > b) {
            System.out.println(people + " ещё виднеются");
            a = Math.random();
            b = Math.random();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            delay += 1000;
        }
        System.out.println(people + " покинули " + getName());
        status = "lonely";
        setName("Одинокий огонь");
        setIsOccured(true);
        System.out.println();
    }
    public Fire(String name, String status, boolean isOccured) {
        super(name, isOccured);
        this.status = status;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fire)) return false;
        Fire other = (Fire) obj;
        return other.status == status && other.getName() == getName();
    }
}
