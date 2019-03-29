package Level_Desine.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains X * X Blocks
 */
public class Canvas {

    private List<Block> blocks;

    /**
     *
     * @param size Setts the amount of blocks per row
     */
    public Canvas(int size) {
        blocks = new ArrayList<>();

    }




    public List<Block> getBlocks() {
        return blocks;
    }
}
