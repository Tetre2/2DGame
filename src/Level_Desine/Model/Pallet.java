package Level_Desine.Model;

import java.util.List;

public class Pallet {

    private List<Block> pickableBlocks;

    public Pallet(List<Block> pickableBlocks) {
        this.pickableBlocks = pickableBlocks;
    }


    public List<Block> getPickableBlocks() {
        return pickableBlocks;
    }
}
