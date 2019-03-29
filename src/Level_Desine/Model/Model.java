package Level_Desine.Model;

import Level_Desine.Model.Sprites.Blocks;

public class Model {

    private Canvas c;
    private Pallet p;

    public Model(int size) {
        c = new Canvas(size);
        p = new Pallet();


        p.add(Blocks.brickWall());

    }

    public Pallet getPallet() {
        return p;
    }

    public Canvas getCanvas() {
        return c;
    }
}
