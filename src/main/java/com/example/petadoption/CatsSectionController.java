package com.example.petadoption;

import Classes.Animal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CatsSectionController implements Initializable {

    @FXML
    private Button RegPets;

    @FXML
    private Button activity;

    @FXML
    private Button profile;
    @FXML
    private Button Logout;
    @FXML
    private Rectangle profile1;

    @FXML
    private Rectangle profile2;

    @FXML
    private Rectangle profile3;

    @FXML
    private Rectangle profile4;

    @FXML
    private Rectangle profile5;

    @FXML
    private Rectangle profile6;

    @FXML
    void exit(MouseEvent event) {
        System.exit(0);

    }

    @FXML
    void minimize(MouseEvent e) {

        HelloApplication.primaryStage.setIconified(true);
    }
    @FXML
    public void switchtoSceneProfile(ActionEvent e)throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("Profile.fxml")) ;

        Scene scene=new Scene(root);
        HelloApplication.primaryStage.setScene(scene);
        HelloApplication.primaryStage.show();

    }
    @FXML
    public void switchtoSceneSignin1(ActionEvent e)throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("Sign1st.fxml")) ;

        Scene scene=new Scene(root);
        HelloApplication.primaryStage.setScene(scene);
        HelloApplication.primaryStage.show();

    }
    @FXML
    void switchtoRegpets(ActionEvent e) throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("RegisteredPETS.fxml")) ;

        Scene scene=new Scene(root);
        HelloApplication.primaryStage.setScene(scene);
        HelloApplication.primaryStage.show();

    }
    public void switchtoSceneHelloview(ActionEvent e)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml")) ;

        Scene scene=new Scene(root);
        HelloApplication.primaryStage.setScene(scene);
        HelloApplication.primaryStage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Init();
    }
    private void Init(){
        ArrayList<Animal>cats= new ArrayList<>();
        try{
            Scanner sc= new Scanner("cat.txt");
            String line="";
            while (sc.hasNext()){
                line=sc.nextLine();

            }

        }
        catch (IOException e){}


    }
}
