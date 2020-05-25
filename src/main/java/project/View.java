package project;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class View extends Application {
    public static void main(String[] args) throws IOException {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        final Controller controller = new Controller();

        stage.setHeight(550);
        stage.setWidth(1000);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setTitle("Балда");

        controller.firstPlayerText.setFont(Font.font(null, 20));
        controller.secondPlayerText.setFont(Font.font(null, 20));

        controller.firstScoreText.setFont(Font.font(null, 20));
        controller.secondScoreText.setFont(Font.font(null, 20));

        //размещение ещё надо настроить
        controller.firstPlayerText.setLayoutX(600);
        controller.firstPlayerText.setLayoutY(50);
        controller.secondPlayerText.setLayoutX(750);
        controller.secondPlayerText.setLayoutY(50);
        controller.restart.setLayoutX(900);
        controller.restart.setLayoutY(100);
        controller.skip.setLayoutX(900);
        controller.skip.setLayoutY(200);

        final Group root = new Group(controller.firstScoreText,
                controller.secondScoreText, controller.firstPlayerText,
                controller.secondPlayerText, controller.restart,
                controller.skip);

        final Scene scene = new Scene(root, Color.CORNFLOWERBLUE);
        stage.setScene(scene);

        stage.show();
    }
}
