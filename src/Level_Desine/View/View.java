package Level_Desine.View;

import Level_Desine.Main;
import Level_Desine.Model.Model;

public class View {

    private Model model;

    public View(Model model) {
        this.model = model;


        model.getPallet().setTranslateX(Main.WORLD_WIDTH-Main.WORLD_WIDTH/3);

    }
}
