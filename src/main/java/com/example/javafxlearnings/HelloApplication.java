package com.example.javafxlearnings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root=new Group();

        Scene scene=new Scene(root, Color.GREY);

        stage.setScene(scene);

        stage.setTitle("You did it! Keep Going");
        Image award=new Image("data:image/png;base64,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");
        stage.getIcons().add(award);
        stage.setHeight(420);
        stage.setWidth(420);

        Text txt=new Text();
        txt.setText("siuuuuuu!!!!");
        txt.setX(250);
        txt.setY(50);

        Circle circle1=new Circle();
        circle1.setCenterX(150);
        circle1.setCenterY(360);
        circle1.setRadius(23);


        Rectangle rec=new Rectangle();
        rec.setX(10);
        rec.setY(600);
        rec.setHeight(40);
        rec.setWidth(500);
        rec.setFill(Color.RED);

        Circle c1=new Circle();
        c1.setRadius(20);
        c1.setCenterX(100);
        c1.setCenterY(100);
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.RED);

        root.getChildren().add(txt);
        root.getChildren().add(rec);
        root.getChildren().add(c1);



        stage.show();

    }
}