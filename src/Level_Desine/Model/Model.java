package Level_Desine.Model;


import Level_Desine.Main;
import Level_Desine.Model.Sprites.None;
import Level_Desine.Model.Sprites.Sprite;
import Level_Desine.Model.Sprites.Sprites;
import javafx.scene.Group;

import java.util.ArrayList;

public class Model {

    private Group canvas;
    private Group pick;

    public Model(int size) {
        createNewCanvas(size);
        createNewPick();
    }

    public Group createNewCanvas(int size){
        canvas = new Group();
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                Block b = new Block(new None());
                b.translateX(row*b.getWidth());
                b.translateY(col*b.getHeight());
                canvas.getChildren().add(b);
            }
        }
        return canvas;
    }

    public Group createNewPick(){
        pick = new Group();
        ArrayList<RotatableBlock> arr = Sprites.getPickable();
        for (int i = 0; i < arr.size(); i++) {
            RotatableBlock b = arr.get(i);
            b.reSizeBlock(128);
            b.translateX((i%2)*b.getWidth());
            b.translateY((i/2)*b.getHeight());
            pick.getChildren().add(b);
        }

        pick.setTranslateX(Main.WORLD_WIDTH-Main.WORLD_WIDTH/3);
        return pick;
    }

    public Group getCanvas() {
        return canvas;
    }

    public Group getPick() {
        return pick;
    }

    public void paintBlock(Block changeThis, Block changeTo){//currblock, pressed
        changeThis.changeBlock(changeTo);
        System.out.println(changeThis + " | " + changeTo);
    }


}
