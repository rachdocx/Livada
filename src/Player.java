public class Player {
    public String name;
    public String gender;
    public int luck;
    public String special;

    public Player(String name, String gender, int luck, String special){
        this.name = name;
        this.gender = gender;
        this.luck = luck;
        this.special = special;
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
