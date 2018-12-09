/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionproject;

import java.math.BigInteger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

/**
 *
 * @author AHmed G. ARabie
 */
public class EncryptionProject extends Application {

    public static String css = EncryptionProject.class.getResource("myCss.css").toExternalForm();
    Scene mainScene, scene1, scene2, scene3;

    @Override
    public void start(Stage primaryStage) {
        
        //buttons
        Button btn12 = new Button("Ceaser");
        Button btn34 = new Button("Vigenere");
        Button btn56 = new Button("Affine");
        Button back1 = new Button("back");
        Button reset1 = new Button("Reset");
        Button back2 = new Button("back");
        Button reset2 = new Button("Reset");
        Button back3 = new Button("back");
        Button reset3 = new Button("Reset");
        Button btn1 = new Button("Encrypt");
        Button btn2 = new Button("Decrypt");
        Button btn3 = new Button("Encrypt");
        Button btn4 = new Button("Decrypt");
        Button btn5 = new Button("Encrypt");
        Button btn6 = new Button("Decrypt");
        //labels
        Label title = new Label("Encryption Poject");
        title.setId("title");
        title.setFont(Font.font(40));
        title.setFont(Font.font(STYLESHEET_MODENA, FontPosture.ITALIC, 40));
        //ceaser
        Label l1 = new Label("Plain Text : ");
        Label l2 = new Label("Cipher Text : ");
        Label l3 = new Label("Plain Text : ");
        //vigenere
        Label l4 = new Label("Plain Text : ");
        Label l5 = new Label("Cipher Text : ");
        Label l6 = new Label("Plain Text : ");
        //affine
        Label l7 = new Label("Plain Text : ");
        Label l8 = new Label("Cipher Text : ");
        Label l9 = new Label("Plain Text : ");

        //Text fields
        //Ceaser 
        TextField txt = new TextField();
        txt.setPromptText("Enter The Plain Text");
        TextField txtDec = new TextField();
        txtDec.setFont(Font.font(26));
        txtDec.setEditable(false);
        txtDec.setPromptText("Cipher Text");
        TextField txtReEnc = new TextField();
        txtReEnc.setFont(Font.font(26));
        txtReEnc.setEditable(false);
        txtReEnc.setPromptText("Plain Text");

        //Vigenere
        TextField txt2 = new TextField();
        txt2.setPromptText("Enter The Plain Text");
        TextField txt2Dec = new TextField();
        txt2Dec.setPromptText("Cipher Text");
        txt2Dec.setFont(Font.font(26));
        txt2Dec.setEditable(false);
        TextField txt2ReEnc = new TextField();
        txt2ReEnc.setPromptText("Plain Text");
        txt2ReEnc.setFont(Font.font(26));
        txt2ReEnc.setEditable(false);

        //Affine
        TextField txt3 = new TextField();
        txt3.setPromptText("Enter The Plain Text");
        TextField txt3Dec = new TextField();
        txt3Dec.setPromptText("Cipher Text");
        txt3Dec.setFont(Font.font(26));
        txt3Dec.setEditable(false);
        TextField txt3ReEnc = new TextField();
        txt3ReEnc.setPromptText("Plain Text");
        txt3ReEnc.setFont(Font.font(26));
        txt3ReEnc.setEditable(false);

        //actions
        //Switching Scenes
        //Ceaser Scene
        btn12.setOnAction((e) -> {
            primaryStage.setScene(scene1);
            primaryStage.setTitle("Ceaser Method For Encryption");
        });
        //Vigenere Scene
        btn34.setOnAction((e) -> {
            primaryStage.setScene(scene2);
            primaryStage.setTitle("Vigenere Method For Encryption");

        });
        //Affine
        btn56.setOnAction((e) -> {
            primaryStage.setScene(scene3);
            primaryStage.setTitle("Affine Method For Encryption");

        });
        //back Switch setup
        back1.setOnAction((e) -> {
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Encryption Project");
        });
        back2.setOnAction((e) -> {
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Encryption Project");
        });
        back3.setOnAction((e) -> {
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Encryption Project");
        });
        //reset switch setup
        reset1.setOnAction((e) -> {
            txt.setText("");
            txtDec.setText("");
            txtReEnc.setText("");
        });
        reset2.setOnAction((e) -> {
            txt2.setText("");
            txt2Dec.setText("");
            txt2ReEnc.setText("");
        });
        reset3.setOnAction((e) -> {
            txt3.setText("");
            txt3Dec.setText("");
            txt3ReEnc.setText("");
        });
        //Perform Encryption and Decryption
        //Perform ceaser Encryption
        btn1.setOnAction((ActionEvent event) -> {
            String str0 = txt.getText();
            StringBuilder str = new StringBuilder(str0);
            StringBuilder c = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char x = str.charAt(i);
                if (x == 'x') {
                    x = 'a';
                } else if (x == 'X') {
                    x = 'A';
                } else if (x == 'y') {
                    x = 'b';
                } else if (x == 'Y') {
                    x = 'B';
                } else if (x == 'z') {
                    x = 'c';
                } else if (x == 'Z') {
                    x = 'C';
                } else {
                    x += 3;
                }
                c.append(x);

            }
            //System.out.println(c);
            txtDec.setText(c.toString());
        });
        //Perform ceaser Encryption
        btn2.setOnAction((ActionEvent event) -> {
            String str0 = txtDec.getText();
            StringBuilder str = new StringBuilder(str0);
            StringBuilder c = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char x = str.charAt(i);
                if (x == 'a') {
                    x = 'x';
                } else if (x == 'A') {
                    x = 'X';
                } else if (x == 'b') {
                    x = 'y';
                } else if (x == 'B') {
                    x = 'Y';
                } else if (x == 'c') {
                    x = 'z';
                } else if (x == 'C') {
                    x = 'Z';
                } else {
                    x -= 3;
                }
                c.append(x);

            }
            //System.out.println(c);
            txtReEnc.setText(c.toString());
        });

        //Perfom vigenere Encryption
        btn3.setOnAction((ActionEvent event) -> {
            int count = 0;
            char character;
            String string = txt2.getText();
            StringBuilder plain = new StringBuilder(string);
            StringBuilder encrypted = new StringBuilder();
            StringBuilder decrypted = new StringBuilder();
            StringBuilder lowerKey = new StringBuilder("happyencryption");
            StringBuilder upperKey = new StringBuilder("HAPPYENCRYPTION");
            for (int i = 0; i < plain.length(); i++) {
                if (count == lowerKey.length()) {
                    count = 0;
                }
                if (Character.isLowerCase(plain.charAt(i))) {
                    character = (char) (plain.charAt(i) + (lowerKey.charAt(count) - 'a'));
                    if (character > 'z') {
                        character -= 26;
                    }
                    encrypted.append((char) character);
                    count++;
                } else if (Character.isUpperCase(plain.charAt(i))) {
                    character = (char) (plain.charAt(i) + (upperKey.charAt(count) - 'A'));
                    if (character > 'Z') {
                        character -= 26;
                    }
                    encrypted.append((char) character);
                    count++;
                } else {
                    encrypted.append(plain.charAt(i));
                }
            }
            txt2Dec.setText(encrypted.toString());
            //System.out.println(encrypted);
        });
        //Perfom vigenere Decryption
        btn4.setOnAction((e) -> {
            int count = 0;
            char character;
            String string = txt2.getText();
            StringBuilder plain = new StringBuilder(string);
            StringBuilder encrypted = new StringBuilder(txt2Dec.getText());
            StringBuilder decrypted = new StringBuilder();
            StringBuilder lowerKey = new StringBuilder("happyencryption");
            StringBuilder upperKey = new StringBuilder("HAPPYENCRYPTION");

            for (int i = 0; i < encrypted.length(); i++) {
                if (count == lowerKey.length()) {
                    count = 0;
                }
                if (Character.isLowerCase(encrypted.charAt(i))) {
                    character = (char) (encrypted.charAt(i) - (lowerKey.charAt(count) - 'a'));
                    if (character < 'a') {
                        character += 26;
                    }
                    decrypted.append((char) character);
                    count++;
                } else if (Character.isUpperCase(encrypted.charAt(i))) {
                    character = (char) (encrypted.charAt(i) - (upperKey.charAt(count) - 'A'));
                    if (character < 'A') {
                        character += 26;
                    }
                    decrypted.append((char) character);
                    count++;
                } else {
                    decrypted.append(plain.charAt(i));
                }
            }
            txt2ReEnc.setText(decrypted.toString());
            //System.out.println(decrypted);

        });
        //Perfom Affine Encryption
        btn5.setOnAction((e) -> {
            int key1 = 7, key2 = 2;
            String msg = txt3.getText();
            //String encmsg = encrypt(msg, key1, key2);
            txt3Dec.setText(encrypt(msg, key1, key2));
            //txt3ReEnc.setText( decrypt(txt3Dec.getText(), key1, key2));

        });
        //Perfom Affine Decryption
        btn6.setOnAction((e) -> {
            int key1 = 7, key2 = 2;
            String msg = txt3.getText();
            //String encmsg = encrypt(msg, key1, key2);
            //txt3Dec.setText(encrypt(msg, key1, key2));
            txt3ReEnc.setText(decrypt(txt3Dec.getText(), key1, key2));
        });
        //Creating and organizing Scenes
        Pane pane1 = new Pane();
        title.layoutXProperty().bind(pane1.widthProperty().divide(2).subtract(title.widthProperty().divide(2)));
        title.layoutYProperty().bind(pane1.heightProperty().divide(3).subtract(title.heightProperty().divide(2)));
        btn12.layoutXProperty().bind(pane1.widthProperty().divide(2).subtract(150));
        btn12.layoutYProperty().bind(title.heightProperty().add(250));
        btn34.layoutXProperty().bind(pane1.widthProperty().divide(2).subtract(btn34.widthProperty().divide(2)));
        btn34.layoutYProperty().bind(title.heightProperty().add(250));
        btn56.layoutXProperty().bind(pane1.widthProperty().divide(2).add(120).subtract(btn56.widthProperty().divide(2)));
        btn56.layoutYProperty().bind(title.heightProperty().add(250));
        //title.fontProperty().bind(primaryStage.maximizedProperty());
        pane1.getChildren().addAll(title, btn12, btn34, btn56);
        mainScene = new Scene(pane1, 500, 500);

        //Ceaser Scene
        GridPane ceaser = new GridPane();
        ceaser.setAlignment(Pos.TOP_CENTER);
        ceaser.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        ceaser.setHgap(2.5);
        ceaser.setVgap(2.5);
        ceaser.add(l1, 0, 0);
        ceaser.add(txt, 2, 0);
        ceaser.add(btn1, 0, 1);
        ceaser.add(l2, 0, 3);
        ceaser.add(txtDec, 2, 3);
        ceaser.add(l3, 0, 8);
        ceaser.add(btn2, 0, 5);
        ceaser.add(txtReEnc, 2, 8);
        ceaser.add(back1, 5, 18);
        ceaser.add(reset1, 3, 18);
//
        // Vigenere Scene
        GridPane vigenere = new GridPane();
        vigenere.setAlignment(Pos.TOP_CENTER);
        vigenere.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        vigenere.setHgap(2.5);
        vigenere.setVgap(2.5);
        vigenere.add(l4, 0, 0);
        vigenere.add(txt2, 2, 0);
        vigenere.add(btn3, 0, 1);
        vigenere.add(l5, 0, 3);
        vigenere.add(txt2Dec, 2, 3);
        vigenere.add(l6, 0, 8);
        vigenere.add(btn4, 0, 5);
        vigenere.add(txt2ReEnc, 2, 8);
        vigenere.add(back2, 5, 18);
        vigenere.add(reset2, 3, 18);

        // Affine Scene
        GridPane affine = new GridPane();
        affine.setAlignment(Pos.TOP_CENTER);
        affine.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        affine.setHgap(2.5);
        affine.setVgap(2.5);
        affine.add(l7, 0, 0);
        affine.add(txt3, 2, 0);
        affine.add(btn5, 0, 1);
        affine.add(l8, 0, 3);
        affine.add(txt3Dec, 2, 3);
        affine.add(l9, 0, 8);
        affine.add(btn6, 0, 5);
        affine.add(txt3ReEnc, 2, 8);
        affine.add(back3, 5, 18);
        affine.add(reset3, 3, 18);

        //txt.setPrefWidth(200);
        //root.getChildren().addAll(l1, txt, btn1, l2, l3, l4, btn2, l5, l6, l7, txt2, btn3, l8, l9, btn4, l10,back);
        scene1 = new Scene(ceaser, 650, 320);
        scene2 = new Scene(vigenere, 650, 320);
        scene3 = new Scene(affine, 650, 320);
        mainScene.getStylesheets().add(css);
        scene1.getStylesheets().add(css);
        scene2.getStylesheets().add(css);
        scene3.getStylesheets().add(css);
        primaryStage.setTitle("Encryption Project");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    String encrypt(String input, int key1, int key2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    c = (char) ((key1 * (c - 'a') + key2) % 26 + 'a');
                } else {
                    c = (char) ((key1 * (c - 'A') + key2) % 26 + 'A');
                }
            }
            str.append(c);
        }
        return str.toString();
    }

    String decrypt(String encmsg, int key1, int key2) {
        StringBuilder str = new StringBuilder();
        BigInteger inv = BigInteger.valueOf(key1).modInverse(BigInteger.valueOf(26));
        for (int i = 0; i < encmsg.length(); i++) {
            char c = encmsg.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {

                    int decoded = inv.intValue() * (c - 'a' - key2 + 26);
                    c = (char) (decoded % 26 + 'a');
                } else {
                    int decoded = inv.intValue() * (c - 'A' - key2 + 26);
                    c = (char) (decoded % 26 + 'A');
                }
            }
            str.append(c);

        }
        return str.toString();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
