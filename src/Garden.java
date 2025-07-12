public class Garden {
    private Plant [][] garden;
    private int width;
    private int height;

    public Garden(int width, int height){
        this.width = width;
        this.height = height;

        garden = new Plant[height][width];
    }


}
