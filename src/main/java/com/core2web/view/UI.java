package com.core2web.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class UI extends  Application{

    Stage primaryStage;
    @Override
    public void start(Stage myStage) throws Exception {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'start'");
        //myStage.show();
        primaryStage = myStage;

      /*   Text heading = new Text("my first ui");

        Text tx = new Text();
        tx.setText("Hello good Morning ");

        Label subHeading = new Label("welcome to java FX"); //parameterised constructor

        Label lb = new Label();
        lb.setText("go to hell");
       
        VBox vb = new VBox(heading,subHeading,tx,lb); //constructor

        HBox hb = new HBox(20,heading,subHeading,tx);
         */

        Text t1 = new Text("T1");
        Text t2 = new Text("T2");
        Text t3 = new Text("T3");
        VBox vb1 = new VBox(20,t1,t2,t3);
        vb1.setStyle("-fx-background-color: green;" + "-fx-pre-width:400px;" +"-fx-preheight:400px;" );
       
       
        Text t4 = new Text("T4");
        Text t5 = new Text("T5");
        Text t6 = new Text("T6");

        Image logo = new Image("assets\\images\\image.png");

        ImageView iv= new ImageView(logo);

        VBox vb2 = new VBox(20,iv,t4,t5,t6);
        vb2.setStyle("-fx-background-color: red;"+"-fx-pre-width:600px;" + "-fx-pre-height:600px; " );

        HBox hb = new HBox(60,vb1,vb2);
        hb.setStyle("-fx-background-color: yellow;");

        Scene sc = new Scene(hb,600,600); // constructor

        primaryStage.setScene(sc);
        primaryStage.setTitle("First UI");
        primaryStage.getIcons().add(logo);        primaryStage.show();

    }
    
    }
    
 

