public class Tree extends Plant{
    private String fruitName;
    private String type;
    int noOfFruitsPerCycle;

    public Tree(String name, int minutesToGrow, String fruitName, String type, int noOfFruitsPerCycle){
        super(name, minutesToGrow);
        this.fruitName = fruitName;
        this.type = type;
        this.noOfFruitsPerCycle = noOfFruitsPerCycle;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoOfFruitsPerCycle() {
        return noOfFruitsPerCycle;
    }

    public void setNoOfFruitsPerCycle(int noOfFruitsPerCycle) {
        this.noOfFruitsPerCycle = noOfFruitsPerCycle;
    }
}
