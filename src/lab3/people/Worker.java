package lab3.people;

import classes.Place;
import lab3.Person;

public class Worker extends Person {

    public void returnFromRiver() {
        System.out.println(getName() + " возвращался с " + Place.RIVER);
    }

    public void rideOnHorse() {
        System.out.println(getName() + " ехал верхом на лошади");
    }

    public void lightTrembledOn() {
        double a = 1;
        double b = Math.random();
        int delay = 1000;
        while (a > b) {
            System.out.println(getName() + " был недостаточно близко к костру");
            a = Math.random();
            b = Math.random();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            delay += 1000;
        }
        System.out.println("Свет от костра дрожал на " + getName());
        System.out.println();
    }

    public Worker(String name, Place place) {
        super(name, place);
    }

}
