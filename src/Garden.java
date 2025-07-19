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

    public Plant getGarden(int i, int j) {
        return garden[i][j];
    }

    public void setGarden(Plant obj, int i, int j) {
        try{
            if(i>this.height)
                throw new IllegalArgumentException("Doesn't fit garden's height.");
            if(j>this.width)
                throw new IllegalArgumentException("Doesn't fit garden's width");
            this.garden[i][j] = obj;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
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
