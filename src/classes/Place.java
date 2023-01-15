package classes;

public enum Place {
    
    FERRY("паром"),
    VILLAGE("родная деревня"),
    MOUNTAIN("гора"),
    WIDOWS("вдовы"),
    RIVER("река"),
    GARDEN("сад"),
    COURTOFTHEHIGHPRIEST("двор первосвященника");

    private final String describe;

    Place(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return describe;
    }
}
