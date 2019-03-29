package Level_Desine;
import Level_Desine.Model.Block;
import Level_Desine.Model.Model;
import Level_Desine.Model.RotatableBlock;
import Level_Desine.Model.Sprites.Brick;
import Level_Desine.Model.Sprites.None;
import Level_Desine.View.View;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
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


        /*RotatableBlock b = new RotatableBlock();
        Brick brick = new Brick(0,0);
        b.add(brick);
        b.translateX(200);
        b.translateY(200);

        Block block = new Block(new Brick(1,1));
        block.translateX(100);
        block.translateY(100);

        root.getChildren().addAll(b);*/

        root.getChildren().add(m.getPick());
        root.getChildren().add(m.getCanvas());

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
