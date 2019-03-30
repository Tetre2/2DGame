package Level_Desine.Model;


public class Model {

    private Canvas c;
    private Pallet p;
    private Types types;

    public Model(int size) {
        c = new Canvas(size);
        p = new Pallet();
        types = new Types();


        p.add(new RotatableBlock(types.getBrickWallTypes()));

    }

    public Pallet getPallet() {
        return p;
    }

    public Canvas getCanvas() {
        return c;
    }
}
