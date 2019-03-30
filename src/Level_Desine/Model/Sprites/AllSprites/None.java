package Level_Desine.Model.Sprites.AllSprites;

import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.Type;

public class None extends Sprite{

    private static String pathRand = "file:Resources/RAND16.png";
    public None(){
        super(pathRand, 16, 0, 0, Type.None);
    }

}
