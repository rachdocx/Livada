public class Plant {
    private String name;
    private int minutesToGrow;

    public Plant(String name, int minutesToGrow){
        this.minutesToGrow = minutesToGrow;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutesToGrow() {
        return minutesToGrow;
    }

    public void setMinutesToGrow(int minutesToGrow) {
        this.minutesToGrow = minutesToGrow;
    }
}
