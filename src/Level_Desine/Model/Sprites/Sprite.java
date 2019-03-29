package Level_Desine.Model.Sprites;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sprite extends ImageView{
    private static String path;
    private int size;
    private int row;
    private int col;
    private final int width;
    private final int height;

    public Sprite(String path, int size, int row, int col) {
        this.path = path;
        this.size = size;
        Image img = new Image(path);
        this.setImage(img);
        this.setViewport(new Rectangle2D(row*size, col*size, size, size));

        this.width = (int) this.getBoundsInParent().getWidth();
        this.height = (int) this.getBoundsInParent().getHeight();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public static String getPath() {
        return path;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void reSizeX(int i){
        this.setFitWidth(i);
    }

    public void reSizeY(int i){
        this.setFitHeight(i);
    }


}
