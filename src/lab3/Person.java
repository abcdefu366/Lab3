package lab3;

import classes.Character;
import classes.Place;



public class Person extends Character {

    public Person(String name, Place place) {
        super(name, place);
    }
    public Person(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return getName();
    }
}
