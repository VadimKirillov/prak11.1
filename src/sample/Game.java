package sample;
import javafx.scene.text.Text;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class Game extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        RandomNumber rand = new RandomNumber();


        javafx.scene.control.TextField textfield = new javafx.scene.control.TextField();
        javafx.scene.control.Label lbl = new javafx.scene.control.Label();

        textfield.setText("Угадай число от 1 до 20");
        textfield.setVisible(true);
        javafx.scene.control.Button conf_butt = new javafx.scene.control.Button("ОК");

        conf_butt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String str = textfield.getText();
                int temp = Integer.parseInt(str);
                str = rand.compare(temp);
                lbl.setText(str);
            }
        });
        FlowPane root = new FlowPane(Orientation.HORIZONTAL,80,80,textfield,conf_butt,lbl);
        Scene scene = new Scene(root, 600,50);

        primaryStage.setTitle("Игра-Угадайка");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
