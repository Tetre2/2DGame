package Level_Desine.Model;

import Level_Desine.Model.Sprites.Brick;
import Level_Desine.Model.Sprites.Sprite;
import javafx.scene.Group;

import java.util.ArrayList;

public class RotatableBlock extends Block implements Rotatable {

    private ArrayList<Block> blocks;
    private Block currentBlock;

    public RotatableBlock(ArrayList<Sprite> sprites) {
        super(sprites.get(0));
        blocks = new ArrayList<>();
        for (Sprite s: sprites) {
            Block b = new Block(s);
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
