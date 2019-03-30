package Level_Desine.Model.Sprites;

import Level_Desine.Model.Sprites.AllSprites.Brick_Floor;
import Level_Desine.Model.Sprites.AllSprites.ERR;
import Level_Desine.Model.Sprites.AllSprites.None;
import Level_Desine.Type;

import java.util.ArrayList;
import java.util.List;

public class Sprites {

    private static String pathBrickWall = "file:Resources/Brick128Wall.png";
    private static List<Sprite> sprites;


    public static Sprite None(){
        return new None();
    }

    public static Sprite ERR(){
        return new ERR();
    }

    public static Sprite Brick_Floor(){
        return new Brick_Floor();
    }

    private static void init(){
        if(sprites == null){
            sprites = new ArrayList<>();
            sprites.add(None());
            sprites.add(ERR());
            sprites.add(Brick_Floor());
            //TODO lägga till alla här

        }
    }

    public static Sprite createNewSprite(Type type){
        //System.out.println("Create new sprite: " + type);
        init();
        for (Sprite s: sprites) {
            //System.out.println(" row, Col: " + s.getRow() + " | " + s.getCol());//JAG HAR DET SNART
            if(s.getType() == type){
                return copy(s);
            }
        }
        return ERR();
    }

    public static Sprite copy(Sprite s){

        //System.out.println("Copy:       " + s.getPath() + " | " + s.getSize() + " | " + s.getRow() + " | " + s.getCol() + " | " + s.getType());
        return new Sprite(s.getPath(), s.getSize(), s.getRow(), s.getCol(), s.getType());

    }


}
