package downloadrouter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DownloadRouterApplication extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(
                new Label("Download Router is running.")
        );

        stage.setTitle("Download Router");
        stage.setScene(new Scene(root, 640, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
