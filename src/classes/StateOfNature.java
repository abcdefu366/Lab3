package classes;

public abstract class StateOfNature {
    private String name;
    private boolean isOccured;

    public StateOfNature(String name, boolean isOccured) {
        this.isOccured = isOccured;
        this.name = name;
    }
    public boolean getIsOccured() {
        return isOccured;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsOccured(boolean isOccured) {
        this.isOccured = isOccured;
    }
}
