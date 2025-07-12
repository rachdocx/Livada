public class Vegetable extends Plant{
    private boolean needsSupport;
    public Vegetable(String name, int minutesToGrow, boolean needsSupport){
        super(name, minutesToGrow);
        this.needsSupport = needsSupport;
    }

}
