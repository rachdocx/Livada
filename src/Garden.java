import java.util.Arrays;

public class Garden {
    private Plant [][] garden;
    private int width;
    private int height;

    public Garden(int width, int height){
        this.width = width;
        this.height = height;

        garden = new Plant[height][width];
    }


    public void setGarden(Plant[][] garden) {
        this.garden = garden;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
