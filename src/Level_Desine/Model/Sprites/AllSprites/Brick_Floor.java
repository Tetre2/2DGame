package Level_Desine.Model.Sprites.AllSprites;

import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.Type;

public class Brick_Floor extends Sprite {

    private static String path = "file:Resources/Brick128Wall.png";
    public Brick_Floor(){
        super(path, 16, 3, 3, Type.Brick_Floor);
    }

}
