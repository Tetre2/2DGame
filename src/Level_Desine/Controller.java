package Level_Desine;

import Level_Desine.Model.Block;
import Level_Desine.Model.Model;
import Level_Desine.Model.Rotatable;
import Level_Desine.Model.RotatableBlock;
import Level_Desine.Model.Sprites.Brick;
import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.View.View;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller {

    private View view;
    private Model model;
    private RotatableBlock selectedBlcok;
    private Block currentBlock;
    private Scene scene;

    public Controller(View view, Model model, Scene scene) {
        this.view = view;
        this.model = model;
        this.scene = scene;
        initLisner();
    }


    private void initLisner(){

        model.getCanvas().addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {
            Block pressedBlock = ((Block)((ImageView) e.getTarget()).getParent());
            model.paintBlock(currentBlock, pressedBlock);
        });

        model.getPick().addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {
            currentBlock = ((Block)((Sprite) e.getTarget()).getParent());

            if( e.getTarget() instanceof Rotatable ){
                System.out.println("kmlf");
                selectedBlcok = ((RotatableBlock)((Sprite) e.getTarget()).getParent());
            }

        });

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if(event.getCode() == KeyCode.R){
                selectedBlcok.rotateBolck();
                System.out.println("Pressed");
            }
        });

    }

}
