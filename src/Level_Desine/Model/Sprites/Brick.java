package Level_Desine.Model.Sprites;

import Level_Desine.Model.Rotatable;

public class Brick extends Sprite implements Rotatable {

    private static String path = "file:Resources/BRICK16 Collection.png";
    public Brick(int row, int col) {
        super(path, 16, row, col);
    }

}
