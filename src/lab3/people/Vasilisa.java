package lab3.people;

import classes.Character;

public class Vasilisa extends Character {
    private String status;

    public static class DaughterOfVasilisa {
        private static String name = "Дочь Василисы";
        public static String getName() {
            return name;
        }
        public static void getEmbarrassed() {
            String s = " смутилась и ";
            System.out.print(getName() + s);
        }
    }
    public void setStatus(String status) {
        this.status = status;
    }
    Student student = new Student("Студент");
    public void readyToBeRemembered() {
        double a = Math.random();
        double b = Math.random();
        int delay = 1000;
        while (a > b) {
            System.out.println(getName() + " не готова быть вспоминаемой " + student.getName());
            a = Math.random();
            b = Math.random();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            delay += 1000;
        }
        status = getName() + " готова быть вспоминаемой " + student.getName();
        System.out.println(status);
        setStatus("ready");
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vasilisa)) return false;
        Vasilisa other = (Vasilisa) obj;
        return other.status == status;
    }
    public void cryForTheReason(String s) {
        System.out.println(getName() + " плакала из-за того, что: " + s);
    }
    public Vasilisa(String name, String status) {
        super(name);
        this.status = status;
    }
}
