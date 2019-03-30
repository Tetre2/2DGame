package Level_Desine.Model;

import Level_Desine.Model.Sprites.Blocks;
import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.Model.Sprites.Sprites;
import javafx.scene.Group;

public class Block extends Group {

    private Sprite sprite;
    private int size;
    private int posX;
    private int posY;

    //--------------------------------

    private Block(Sprite sprite, int size, int posX, int posY) {
        this.sprite = sprite;
        this.size = size;
        reSizeBlock(size);
        this.posX = posX;
        this.posY = posY;
        renderBlock();
    }

    public Block(Sprite sprite) {
        this(sprite, 0, 0, 0);
    }

    /*public Block(Block b) {
        this(b.sprite, b.size, b.getPosX(), b.getPosY());
    }*/

    //--------------------------------

    public void renderBlock() {
        this.getChildren().clear();
        this.getChildren().add(sprite);
    }


    public void changeBlock(Sprite sprite) {
        this.sprite = Sprites.createNewSprite(sprite.getType());
        renderBlock();
    }


    public void reSizeBlock(int size) {
        this.size = size;
        if (size != 0) {
            sprite.reSizeX(size);
            sprite.reSizeY(size);
        }
        renderBlock();
    }


    //--------------------------------

    public int getWidth() {
        return sprite.getWidth();
    }

    public int getHeight() {
        return sprite.getHeight();
    }

    public int getSize() {
        return size;
    }

    public void translateX(int x) {
        this.setTranslateX(x);
        renderBlock();
    }

    public void translateY(int y) {
        this.setTranslateY(y);
        renderBlock();
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

}
