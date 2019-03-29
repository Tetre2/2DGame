package Level_Desine.Model;

import Level_Desine.Model.Sprites.Sprite;
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

    public Block(Block b){
        this(b.getSprite(), b.getSize(), b.getPosX(), b.getPosY());
    }

    public Block(Sprite sprite) {
        this(sprite, 0, 0, 0);
    }

    //--------------------------------

    public void renderBlock(){
        this.getChildren().clear();
        this.getChildren().add(sprite);
    }


    public Block changeBlock(Block b){
        /*this.type = type;
        imageView = Sprites.getImage(type);
        reSizeBlock(size);*/
        return new Block(b.getSprite(), size, posX, posY);
    }


    public void reSizeBlock(int size){
        this.size = size;
        if(size != 0){
            sprite.reSizeX(size);
            sprite.reSizeY(size);
        }
        renderBlock();
    }

    public void setIcon(){
        reSizeBlock(100);
        renderBlock();
    }

    //--------------------------------


    public Sprite getSprite() {
        return sprite;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth(){
        return sprite.getWidth();
    }

    public int getHeight(){
        return sprite.getHeight();
    }

    public int getSize() {
        return size;
    }

    public void translateX(int x) {
        this.setTranslateX(x);
        renderBlock();//TODO behövs kanske ej
    }

    public void translateY(int y) {
        this.setTranslateY(y);
        renderBlock();//TODO behövs kanske ej
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

}
