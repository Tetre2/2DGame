package Level_Desine.Model.Sprites.AllSprites;

import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.Type;

public class ERR extends Sprite {

    private static String pathRand = "file:Resources/RAND16.png";
    public ERR(){
        super(pathRand, 16, 3, 3, Type.ERR);
    }
}
