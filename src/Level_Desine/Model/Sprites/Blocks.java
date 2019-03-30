package Level_Desine.Model.Sprites;

import Level_Desine.Model.Block;
import Level_Desine.Model.RotatableBlock;

import java.util.ArrayList;

public class Blocks {

    public static Block None() {
        return new Block(Sprites.None());
    }

    public static Block ERR() {
        return new Block(Sprites.ERR());
    }

    public static Block Brick_Floor() {
        return new Block(Sprites.Brick_Floor());
    }


    /*public static RotatableBlock brickWall() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                Sprite s = new Sprite(pathBrickWall, 128, row, col);
                sprites.add(s);
            }
        }
        RotatableBlock b = new RotatableBlock(sprites);

        return b;
    }*/





}
