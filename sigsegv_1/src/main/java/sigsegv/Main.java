package sigsegv;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.stage.Stage;

class MainDialog extends Dialog {
    public MainDialog() {
        var button = new Button("Close me!");
        button.setOnAction(_ -> System.exit(0));
        getDialogPane().setContent(button);
    }
}

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        var scene = new Scene(new Label("Dummy"));
        stage.setScene(scene);
        stage.show();
        new MainDialog().showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
