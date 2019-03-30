package Level_Desine.Model;

import Level_Desine.Model.Sprites.RotatableSprite;

public class RotatableBlock extends Block implements Rotatable {

    private RotatableSprite rotatableSprite;

    public RotatableBlock(RotatableSprite rSprite) {
        super(rSprite.getCurrentSprite());
        rotatableSprite = rSprite;
        renderBlock();
    }


    public void rotateBolck() {
        rotatableSprite.rotateNextSprite();
        this.changeBlock(rotatableSprite.getCurrentSprite());
    }

}
