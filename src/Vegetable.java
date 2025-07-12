public class Vegetable extends Plant{
    private boolean needsSupport;
    public Vegetable(String name, int minutesToGrow, boolean needsSupport){
        super(name, minutesToGrow);
        this.needsSupport = needsSupport;
    }

    public boolean isNeedsSupport() {
        return needsSupport;
    }

    public void setNeedsSupport(boolean needsSupport) {
        this.needsSupport = needsSupport;
    }
}
