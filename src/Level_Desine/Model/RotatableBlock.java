package Level_Desine.Model;

import Level_Desine.Model.Sprites.Brick;
import Level_Desine.Model.Sprites.Sprite;
import javafx.scene.Group;

import java.util.ArrayList;

public class RotatableBlock extends Group implements Rotatable {

    private ArrayList<Block> blocks;
    private Block currentBlock;
    private int size;
    private int posX;
    private int posY;

    public RotatableBlock() {
        blocks = new ArrayList<>();
        add((new Brick(0,0)));
        posX = 0;
        posY = 0;
        renderBlock();
    }

    public void add(Sprite b){
        Block block = new Block(b);
        blocks.add(block);

        currentBlock = block;//TODO Ändra sedan
    }


    public void rotateBolck() {
        int i = (blocks.indexOf(currentBlock) + 1) % blocks.size();
        currentBlock = blocks.get(i);
        renderBlock();
    }

    public void renderBlock() {
        this.getChildren().clear();
        this.getChildren().add(this);
    }

    public void reSizeBlock(int size) {
        this.size = size;
        for (Block b : blocks) {
            b.reSizeBlock(size);
        }
    }

    public void translateX(int x) {
        for (Block b : blocks) {
            b.translateX(x);
        }
        renderBlock();//TODO behövs kanske ej
    }

    public void translateY(int y) {
        for (Block b : blocks) {
            b.translateY(y);
        }
        renderBlock();//TODO behövs kanske ej
    }

    public Block getCurrentBlock() {
        return currentBlock;
    }

    public int getWidth(){
        return currentBlock.getWidth();
    }

    public int getHeight(){
        return currentBlock.getHeight();
    }

    public int getSize() {
        return size;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
