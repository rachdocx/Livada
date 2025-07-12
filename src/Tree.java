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


}
