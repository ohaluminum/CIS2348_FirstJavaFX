import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label message = new Label("Hello, JavaFX!");
        //message.setFont(new Font(100));
        primaryStage.setScene(new Scene(message));
        primaryStage.setTitle("My first GUI");

        primaryStage.show();
    }
}
