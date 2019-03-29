package Level_Desine.Model.Sprites;


import Level_Desine.Model.Block;
import Level_Desine.Model.RotatableBlock;

import java.util.ArrayList;

public class Sprites {

    public static RotatableBlock getBrickWalls(){
        ArrayList<Sprite> sprites = new ArrayList<>();
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 4; row++) {
                Brick brick = new Brick(row, col);
                sprites.add(brick);
            }
        }
        RotatableBlock b = new RotatableBlock(sprites);
        return b;
    }

    public static Block getBrick(){
        None n = new None();
        Block b = new Block(n);
        return b;
    }

    public static Block getNone(){
        ERR e = new ERR();
        Block b = new Block(e);
        return b;
    }

    public static Block getERR(){
        Brick brick = new Brick(0,2);
        Block b = new Block(brick);
        return b;
    }


    public static ArrayList<RotatableBlock> getPickable(){
        ArrayList arr = new ArrayList();
        arr.add(getBrickWalls());

        return arr;
    }



}
