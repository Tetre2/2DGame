package Level_Desine.Model;

import Level_Desine.Model.Sprites.Blocks;
import javafx.scene.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains X * X Blocks
 */
public class Canvas extends Group {

    private List<Block> blocks;
    private int size;

    /**
     * @param size Setts the amount of blocks per row
     */
    public Canvas(int size) {
        blocks = new ArrayList<>();
        this.size = size;
        createCanvas();
    }

    /**
     * Places None Blocks in the canvas
     * @return
     */
    private void createCanvas() {
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                Block b = Blocks.None();
                b.translateX(row * b.getWidth());
                b.translateY(col * b.getHeight());
                blocks.add(b);
            }
        }
        renderCanvas();
    }
    
    public void renderCanvas(){
        this.getChildren().clear();
        for (Block b : blocks) {
            this.getChildren().add(b);
        }
    }


    public List<Block> getCanvas() {
        return blocks;
    }
}
