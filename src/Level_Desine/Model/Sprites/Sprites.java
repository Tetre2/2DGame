package Level_Desine.Model.Sprites;

import Level_Desine.Model.Sprites.AllSprites.ERR;
import Level_Desine.Model.Sprites.AllSprites.None;
import Level_Desine.Type;

public class Sprites {

    private static String pathBrickWall = "file:Resources/Brick128Wall.png";

    public static Sprite None(){
        return new None();
    }

    public static Sprite ERR(){
        return new ERR();
    }

    public static Sprite Brick_Floor(){
        return new Sprite(pathBrickWall, 16, 3, 3, Type.Brick_Floor);//TODO ändra s att det är floor inte wall
    }

    public static Sprite createNewSprite(Type type){
        Sprite s;
        switch (type){
            case None: s = Sprites.None();

            case Brick_Floor: s = Sprites.Brick_Floor();

            default: s = Sprites.ERR();
        }
        return s;
    }

    public static Sprite copy(Sprite s){
        return new Sprite(s.getPath(), s.getSize(), s.getRow(), s.getCol(), s.getType());
    }


}
