package classes;

public abstract class Character {
    private String name;
    private Place place;
    public void setPlace(Place place) {
        this.place = place;
    }
    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }

    public Character(String name, Place place) {
        this.name = name;
        this.place = place;
    }
    public Character(String name) {
        this.name = name;
    }
}
