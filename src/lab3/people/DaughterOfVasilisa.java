package lab3.people;

public class DaughterOfVasilisa extends Vasilisa{

    public void getEmbarrassed() {
        String s = " смутилась и ";
        System.out.print(getName() + s);
    }
    public DaughterOfVasilisa(String name, String status) {
        super(name, status);
    }
}
