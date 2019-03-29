package Level_Desine;
import Level_Desine.Model.Block;
import Level_Desine.Model.Model;
import Level_Desine.Model.Sprites.Blocks;
import Level_Desine.View.View;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
    public static int WORLD_WIDTH = 1200;
    public static int WORLD_HEIGHT = 800;

    private static Stage pStage;

    private Group root = new Group();
    private Scene scene = new Scene(root, WORLD_WIDTH, WORLD_HEIGHT);

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("2D_GAME");
        setPrimaryStage(primaryStage);



        Model m = new Model(32);
        View view = new View(m);
        Controller controller = new Controller(view, m, scene);
        root.getChildren().add(m.getCanvas());
        root.getChildren().add(m.getPallet());

        /*Block b = new Block(Blocks.None().getSprite());
        root.getChildren().add(b);
        b.changeBlock(Blocks.ERR().getSprite());
        root.getChildren().clear();
        root.getChildren().add(b);*/

        //root.getChildren().add(Blocks.brickWall());

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return pStage;
    }

    private void setPrimaryStage(Stage pStage) {
        Main.pStage = pStage;
    }

}
