package Level_Desine.Model.Sprites;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Sprite extends ImageView{
    private final int width;
    private final int height;

    public Sprite(String path, int size, int row, int col) {
        Image img = new Image(path);
        this.setImage(img);
        this.setViewport(new Rectangle2D(row*size, col*size, size, size));

        this.width = (int) this.getBoundsInParent().getWidth();
        this.height = (int) this.getBoundsInParent().getHeight();
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
