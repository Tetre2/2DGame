package Level_Desine;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;


public class Main extends Application{




    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));

        Scene scene = new Scene(root, 800, 500);

        stage.setTitle("HEJ");
        stage.setScene(scene);
        stage.show();



    /*
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

        *//*Block b = new Block(Blocks.None().getSprite());
        root.getChildren().add(b);
        b.changeBlock(Blocks.ERR().getSprite());
        root.getChildren().clear();
        root.getChildren().add(b);*//*

        //root.getChildren().add(Blocks.brickWall());

        primaryStage.setScene(scene);
        primaryStage.show();
*/

    }

    public static void main(String[] args) {
        launch(args);
    }

   /* public static Stage getPrimaryStage() {
        return pStage;
    }

    private void setPrimaryStage(Stage pStage) {
        Main.pStage = pStage;
    }
*/
}
