public class Player {
    private String name;
    private String gender;
    private int luck;
    private int storage;
    private String special;

    public Player(String name, String gender, int luck, int storage, String special){
        this.name = name;
        this.gender = gender;
        this.luck = luck;
        this.special = special;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", luck=" + luck +
                ", special='" + special + '\'' +
                '}';
    }
}
