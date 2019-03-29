package Level_Desine;

import Level_Desine.Model.Block;
import Level_Desine.Model.Model;
import Level_Desine.Model.RotatableBlock;
import Level_Desine.Model.Sprites.Blocks;
import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.View.View;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

public class Controller {

    private View view;
    private Model model;
    private RotatableBlock selectedBlcok;
    private Sprite current = Blocks.ERR().getSprite();
    private Scene scene;

    public Controller(View view, Model model, Scene scene) {
        this.view = view;
        this.model = model;
        this.scene = scene;
        initLisner();
    }


    private void initLisner(){
        model.getCanvas().addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {
            Block b = ((Block) ((Sprite) e.getTarget() ).getParent());
            b.changeBlock(current);
        });

    }
    /*Block b = Blocks.ERR();
        root.getChildren().add(b);
        b.changeBlock();
*/


}
