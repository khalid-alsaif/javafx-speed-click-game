package com.example.projectdemo;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class ProjectDemo1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
/////////////////////////////////             //////////////////////////////////////////////////////////////////
//////////////////////////////// First Scene //////////////////////////////////////////////////////////////////
///////////////////////////////             //////////////////////////////////////////////////////////////////
        Text title = new Text(" Speed Click Game");
        title.setFill( Color.RED);
        title.setFont(new Font(70));


        Button start = new Button(" Start ");
        start.setPrefWidth(200);
        start.setPrefHeight(100);
        start.setFont( new Font(30 ));


        Button leave = new Button(" Close ");
        leave.setPrefWidth(200);
        leave.setPrefHeight(100);
        leave.setFont( new Font(30 ));


        VBox VboxScene1 = new VBox(40);
        VboxScene1.setAlignment(Pos.CENTER);
        VboxScene1.getChildren().addAll(start,leave);


        BorderPane paneScene1 = new BorderPane();
        paneScene1.setPadding( new Insets(15,15,15,15));
        paneScene1.setCenter(VboxScene1);
        paneScene1.setTop(title);
        BorderPane.setAlignment(title , Pos.BOTTOM_CENTER);


        Scene scene1 = new Scene(paneScene1,450,450);


/////////////////////////////////             //////////////////////////////////////////////////////////////////
//////////////////////////////// Second Scene //////////////////////////////////////////////////////////////////
///////////////////////////////             //////////////////////////////////////////////////////////////////
        Circle circle1 = new Circle(50) ;
        Circle circle2 = new Circle(50) ;
        Circle circle3 = new Circle(50) ;
        Circle circle4 = new Circle(50) ;
        Circle circle5 = new Circle(50) ;
        circle1.setFill(Color.RED);
        circle2.setFill(Color.RED);
        circle3.setFill(Color.RED);
        circle4.setFill(Color.RED);
        circle5.setFill(Color.RED);
        circle1.setLayoutX(-200);
        circle2.setLayoutX(-200);
        circle3.setLayoutX(-200);
        circle4.setLayoutX(-200);
        circle5.setLayoutX(-200);

        Rectangle rectangle1 = new Rectangle(140,70);
        Rectangle rectangle2 = new Rectangle(140,70);
        Rectangle rectangle3 = new Rectangle(140,70);
        Rectangle rectangle4 = new Rectangle(140,70);
        Rectangle rectangle5 = new Rectangle(140,70);
        rectangle1.setFill(Color.BLUE);
        rectangle2.setFill(Color.BLUE);
        rectangle3.setFill(Color.BLUE);
        rectangle4.setFill(Color.BLUE);
        rectangle5.setFill(Color.BLUE);
        rectangle1.setLayoutX(-200);
        rectangle2.setLayoutX(-200);
        rectangle3.setLayoutX(-200);
        rectangle4.setLayoutX(-200);
        rectangle5.setLayoutX(-200);


        Rectangle cube1 = new Rectangle(130,130);
        Rectangle cube2 = new Rectangle(130,130);
        Rectangle cube3 = new Rectangle(130,130);
        Rectangle cube4 = new Rectangle(130,130);
        Rectangle cube5 = new Rectangle(130,130);
        cube1.setFill(Color.GREEN);
        cube2.setFill(Color.GREEN);
        cube3.setFill(Color.GREEN);
        cube4.setFill(Color.GREEN);
        cube5.setFill(Color.GREEN);
        cube1.setLayoutX(-200);
        cube2.setLayoutX(-200);
        cube3.setLayoutX(-200);
        cube4.setLayoutX(-200);
        cube5.setLayoutX(-200);

        Label label = new Label("Score : ");
        label.setTextFill(Color.BLACK);


        Text text = new Text("0");


        HBox hBoxScene2 = new HBox(20);
        hBoxScene2.getChildren().addAll(label,text);
        hBoxScene2.setLayoutY(10);
        hBoxScene2.setLayoutX(15);

        ///////////////////////////////////////////
        Circle circleShow = new Circle(7);
        circleShow.setFill(Color.RED);
        Rectangle rectangleShow = new Rectangle(10,8);
        rectangleShow.setFill(Color.BLUE);
        Rectangle cubeShow = new Rectangle(9,9);
        cubeShow.setFill(Color.GREEN);

        Text text1 = new Text("15 point");
        Text text2 = new Text("10 point");
        Text text3 = new Text("5 point");

        HBox hBox1Scene2 = new HBox(10);
        hBox1Scene2.getChildren().addAll(circleShow,text1);
        hBox1Scene2.setAlignment(Pos.CENTER);
        HBox hBox2Scene2 = new HBox(10);
        hBox2Scene2.getChildren().addAll(rectangleShow,text2);
        hBox2Scene2.setAlignment(Pos.CENTER);
        HBox hBox3Scene2 = new HBox(10);
        hBox3Scene2.getChildren().addAll(cubeShow,text3);
        hBox3Scene2.setAlignment(Pos.CENTER);


        VBox vBoxScene2 = new VBox(15);
        vBoxScene2.getChildren().addAll(hBox1Scene2,hBox2Scene2,hBox3Scene2);
        vBoxScene2.setLayoutX(15);
        vBoxScene2.setLayoutY(35);
        ///////////////////////////////////////////
        Pane paneScene2 = new Pane();
        paneScene2.getChildren().addAll(circle1,circle2,circle3,circle4,circle5,rectangle2,rectangle1,rectangle3,rectangle4,rectangle5,cube2,cube1,cube3,cube4,cube5,hBoxScene2,vBoxScene2);



        PathTransition pt = new PathTransition(Duration.millis(6000) , new Line(1100, -100, 1100 ,1000), circle1);
        pt.setCycleCount(1);
        PathTransition pt1 = new PathTransition(Duration.millis(5400) , new Line(800, -100, 800 ,1000),rectangle1 );
        pt1.setCycleCount(1);
        PathTransition pt2 = new PathTransition(Duration.millis(5150) , new Line(1200, -100, 1200 ,1000), cube1);
        pt2.setCycleCount(1);
        PathTransition pt3 = new PathTransition(Duration.millis(4950) , new Line(500, -100, 500 ,1000),circle2 );
        pt3.setCycleCount(1);
        PathTransition pt4 = new PathTransition(Duration.millis(4500) , new Line(1600, -100, 1600 ,1000), rectangle2);
        pt4.setCycleCount(1);
        PathTransition pt5 = new PathTransition(Duration.millis(4150) , new Line(450, -100, 450 ,1000), cube2);
        pt5.setCycleCount(1);
        PathTransition pt6 = new PathTransition(Duration.millis(3800) , new Line(1100, -100, 1100 ,1000), circle3);
        pt6.setCycleCount(1);
        PathTransition pt7 = new PathTransition(Duration.millis(3450) , new Line(450, -100, 450 ,1000), rectangle3 );
        pt7.setCycleCount(1);
        PathTransition pt8 = new PathTransition(Duration.millis(3100) , new Line(1200, -100, 1200 ,1000), cube3);
        pt8.setCycleCount(1);
        PathTransition pt9 = new PathTransition(Duration.millis(2750) , new Line(500, -100, 500 ,1000),circle4 );
        pt9.setCycleCount(1);
        PathTransition pt10 = new PathTransition(Duration.millis(2400) , new Line(1600, -100, 1600 ,1000), rectangle4);
        pt10.setCycleCount(1);
        PathTransition pt11 = new PathTransition(Duration.millis(2000) , new Line(400, -100, 400 ,1000), cube4);
        pt11.setCycleCount(1);
        PathTransition pt12 = new PathTransition(Duration.millis(1700) , new Line(1100, -100, 1100 ,1000),circle5 );
        pt12.setCycleCount(1);
        PathTransition pt13 = new PathTransition(Duration.millis(1350) , new Line(650, -100, 650 ,1000), rectangle5);
        pt13.setCycleCount(1);
        PathTransition pt14 = new PathTransition(Duration.millis(1800) , new Line(900, -100, 900 ,1800),cube5 );
        pt14.setCycleCount(1);

        pt1.setDelay(new Duration(3000));
        pt2.setDelay(new Duration(5000));
        pt3.setDelay(new Duration(6000));
        pt4.setDelay(new Duration(7000));
        pt5.setDelay(new Duration(8000));
        pt6.setDelay(new Duration(9000));
        pt7.setDelay(new Duration(10000));
        pt8.setDelay(new Duration(11000));
        pt9.setDelay(new Duration(12000));
        pt10.setDelay(new Duration(13000));
        pt11.setDelay(new Duration(14000));
        pt12.setDelay(new Duration(15000));
        pt13.setDelay(new Duration(16000));
        pt14.setDelay(new Duration(17000));





        circle1.setOnMousePressed(e->{
            circle1.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+15+"");

        });
        rectangle1.setOnMousePressed(e->{
            rectangle1.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+10+"");
        });
        cube1.setOnMousePressed(e->{

            cube1.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+5+"");
        });

        circle2.setOnMousePressed(e->{

            circle2.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+15+"");

        });
        rectangle2.setOnMousePressed(e->{

            rectangle2.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+10+"");
        });
        cube2.setOnMousePressed(e->{

            cube2.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+5+"");
        });

        circle3.setOnMousePressed(e->{

            circle3.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+15+"");

        });
        rectangle3.setOnMousePressed(e->{

            rectangle3.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+10+"");
        });
        cube3.setOnMousePressed(e->{

            cube3.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+5+"");
        });
        circle4.setOnMousePressed(e->{

            circle4.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+15+"");

        });
        rectangle4.setOnMousePressed(e->{

            rectangle4.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+10+"");
        });
        cube4.setOnMousePressed(e->{

            cube4.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+5+"");
        });
        circle5.setOnMousePressed(e->{

            circle5.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+15+"");

        });
        rectangle5.setOnMousePressed(e->{

            rectangle5.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+10+"");
        });
        cube5.setOnMousePressed(e->{

            cube5.setVisible(false);
            text.setText(Integer.parseInt(text.getText())+5+"");
        });


        Scene scene2 = new Scene(paneScene2 , 450,450);

/////////////////////////////////             //////////////////////////////////////////////////////////////////
//////////////////////////////// Third Scene //////////////////////////////////////////////////////////////////
///////////////////////////////             //////////////////////////////////////////////////////////////////
        Button playAgain = new Button("Play Again");
        playAgain.setPrefWidth(200);
        playAgain.setPrefHeight(100);
        playAgain.setFont( new Font(30 ));
        Button leave2 = new Button("Close");
        leave2.setPrefWidth(200);
        leave2.setPrefHeight(100);
        leave2.setFont( new Font(30 ));

        TextField textField1 = new TextField("0");
        TextField textField2 = new TextField("0");
        TextField textField3 = new TextField("0");
        TextField textField4= new TextField("0");
        TextField textField5 = new TextField("0");
        textField1.setEditable(false);
        textField2.setEditable(false);
        textField3.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);


        VBox vBoxF = new VBox(30);
        vBoxF.getChildren().addAll(playAgain,leave2);
        vBoxF.setLayoutX(650);
        vBoxF.setLayoutY(400);


        GridPane paneF = new GridPane();
        paneF.setLayoutX(650);
        paneF.setLayoutY(200);
        paneF.setVgap(5);
        paneF.setHgap(5);
        paneF.add(new Label("First"),0,0);
        paneF.add(new Label("Second"),0,1);
        paneF.add(new Label("Third"),0,2);
        paneF.add(new Label("fourth"),0,3);
        paneF.add(new Label("fifth"),0,4);
        paneF.add(textField1,1,0);
        paneF.add(textField2,1,1);
        paneF.add(textField3,1,2);
        paneF.add(textField4,1,3);
        paneF.add(textField5,1,4);

        Pane paneScene3 = new Pane();
        paneScene3.getChildren().addAll(paneF,vBoxF);

        Scene scene3 = new Scene(paneScene3);



        start.setOnAction(e->{
            stage.setScene(scene2);
            stage.setFullScreen(true);
            pt.play();
            pt1.play();
            pt2.play();
            pt3.play();
            pt4.play();
            pt5.play();
            pt6.play();
            pt7.play();
            pt8.play();
            pt9.play();
            pt10.play();
            pt11.play();
            pt12.play();
            pt13.play();
            pt14.play();

        });
        leave.setOnAction(e->{
            stage.close();
        });
        playAgain.setOnAction(e->{
            stage.setScene(scene2);
            stage.setFullScreen(true);
            text.setText("0");

            pt.play();
            pt1.play();
            pt2.play();
            pt3.play();
            pt4.play();
            pt5.play();
            pt6.play();
            pt7.play();
            pt8.play();
            pt9.play();
            pt10.play();
            pt11.play();
            pt12.play();
            pt13.play();
            pt14.play();

            circle1.setVisible(true);
            circle2.setVisible(true);
            circle3.setVisible(true);
            circle4.setVisible(true);
            circle5.setVisible(true);
            rectangle1.setVisible(true);
            rectangle2.setVisible(true);
            rectangle3.setVisible(true);
            rectangle4.setVisible(true);
            rectangle5.setVisible(true);
            cube1.setVisible(true);
            cube2.setVisible(true);
            cube3.setVisible(true);
            cube4.setVisible(true);
            cube5.setVisible(true);

        });
        leave2.setOnAction(e->{
            stage.close();
        });


        pt14.setOnFinished(e->{
            stage.setScene(scene3);
            stage.setFullScreen(true);

            if (Integer.parseInt(text.getText()) > Integer.parseInt(textField1.getText())) {
                textField5.setText(Integer.parseInt(textField4.getText()) + "");
                textField4.setText(Integer.parseInt(textField3.getText()) + "");
                textField3.setText(Integer.parseInt(textField2.getText()) + "");
                textField2.setText(Integer.parseInt(textField1.getText()) + "");
                textField1.setText(Integer.parseInt(text.getText()) + "");
            } else if (Integer.parseInt(text.getText()) > Integer.parseInt(textField2.getText())) {
                textField5.setText(Integer.parseInt(textField4.getText()) + "");
                textField4.setText(Integer.parseInt(textField3.getText()) + "");
                textField3.setText(Integer.parseInt(textField2.getText()) + "");
                textField2.setText(Integer.parseInt(textField2.getText()) + "");
            } else if (Integer.parseInt(text.getText()) > Integer.parseInt(textField3.getText())) {
                textField5.setText(Integer.parseInt(textField4.getText()) + "");
                textField4.setText(Integer.parseInt(textField3.getText()) + "");
                textField3.setText(Integer.parseInt(text.getText()) + "");
            } else if (Integer.parseInt(text.getText()) > Integer.parseInt(textField4.getText())) {
                textField5.setText(Integer.parseInt(textField4.getText()) + "");
                textField4.setText(Integer.parseInt(text.getText()) + "");
            } else if (Integer.parseInt(text.getText()) > Integer.parseInt(textField5.getText())) {
                textField5.setText(Integer.parseInt(text.getText()) + "");

            }
        });

        stage.setScene(scene1);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}