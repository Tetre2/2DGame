package Level_Desine.Model.Sprites;

import Level_Desine.Model.Block;
import Level_Desine.Model.RotatableBlock;

import java.util.ArrayList;

public class Blocks {

    private static String pathRand = "file:Resources/RAND16.png";
    private static String pathBrickWall = "file:Resources/Brick128Wall.png";


    public static Block None() {
        return new Block(new Sprite(pathRand, 16, 0, 0));
    }

    public static Block ERR() {
        return new Block(new Sprite(pathRand, 16, 3, 3));
    }

    public static RotatableBlock brickWall() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                Sprite s = new Sprite(pathBrickWall, 128, row, col);
                sprites.add(s);
            }
        }
        RotatableBlock b = new RotatableBlock(sprites);

        return b;
    }





}
