package Level_Desine.Model.Sprites;

import Level_Desine.Type;

import java.util.List;

public class RotatableSprite extends Sprite {

    private List<Sprite> sprites;
    private Sprite currentSprite;

    public RotatableSprite(List<Sprite> sprites) {
        super(sprites.get(0));
        this.sprites = sprites;
        this.currentSprite = sprites.get(0);

    }

    public void rotateNextSprite(){
        int i = (sprites.indexOf(currentSprite) + 1) % sprites.size();
        currentSprite = sprites.get(i);
    }

    public void rotatePrevSprite(){
        int i = (sprites.indexOf(currentSprite) + (sprites.size() - 1)) % sprites.size();
        currentSprite = sprites.get(i);
    }


    public Sprite getCurrentSprite(){
        return currentSprite;
    }





}
