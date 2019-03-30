package Level_Desine.Model;

import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.Model.Sprites.Sprites;
import Level_Desine.Type;
import javafx.scene.Group;

import java.util.ArrayList;

public class RotatableBlock extends Group implements Rotatable {

    private ArrayList<Block> blocks;
    private Block currentBlock;

    public RotatableBlock(ArrayList<Type> types) {
        blocks = new ArrayList<>();
        for (Type t: types) {
            Block b = new Block(Sprites.createNewSprite(t));
            blocks.add(b);
        }
        currentBlock = blocks.get(0);
        renderBlock();
    }


    public void rotateBolck() {
        int i = (blocks.indexOf(currentBlock) + 1) % blocks.size();
        currentBlock = blocks.get(i);
        renderBlock();
    }

    public void renderBlock() {
        this.getChildren().clear();
        this.getChildren().add(currentBlock);
    }

    public void reSizeBlock(int size) {
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
        return currentBlock.getSize();
    }

    public int getPosX() {
        return currentBlock.getPosX();
    }

    public int getPosY() {
        return currentBlock.getPosY();
    }
}
