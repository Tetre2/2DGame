package Level_Desine.Model;

import javafx.scene.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the pallet of pickable blocks
 */
public class Pallet extends Group {

    private List<RotatableBlock> pickableBlocks;

    /**
     *
     */
    public Pallet() {
        pickableBlocks = new ArrayList<>();
    }

    /**
     * Adds a new block to the palet
     */
    public void add(RotatableBlock b){
        pickableBlocks.add(b);
        this.getChildren().add(b);
    }


    /**
     *
     * @return All pickable Blocks
     */
    public List<RotatableBlock> getPickableBlocks() {
        return pickableBlocks;
    }
}
