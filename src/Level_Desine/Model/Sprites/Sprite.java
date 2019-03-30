package Level_Desine.Model.Sprites;

import Level_Desine.Type;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sprite extends ImageView{

    private String path;
    private int size;
    private int row;
    private int col;
    private final int width;
    private final int height;
    private Type type;

    //Should hava a type and a image(view)

    public Sprite(String path, int size, int row, int col, Type type) {
        this.type = type;
        this.path = path;
        this.size = size;
        this.row = row;
        this.col = col;
        Image img = new Image(path);
        this.setImage(img);
        this.setViewport(new Rectangle2D(row*size, col*size, size, size));

        this.width = (int) this.getBoundsInParent().getWidth();
        this.height = (int) this.getBoundsInParent().getHeight();
    }

    public Sprite(Sprite s) {
        this(s.getPath(), s.getSize(), s.getRow(), s.getRow(), s.getType());
    }

    public Type getType() {
        return type;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getPath() {
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
