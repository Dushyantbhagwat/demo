package com.example.demo;

/**
 * Sample Skeleton for '9_patientoverview (1).fxml' Controller Class
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BController implements Initializable {

    private Stage stage;

    private Scene scene;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchorpanel2AA"
    private AnchorPane anchorpanel2AA; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2AR"
    private Label anchorpanel2AR; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2ARNO"
    private Label anchorpanel2ARNO; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2BG"
    private AnchorPane anchorpanel2BG; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2BGB"
    private Label anchorpanel2BGB; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2H"
    private Button anchorpanel2H; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2H1"
    private Button anchorpanel2H1; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2L"
    private AnchorPane anchorpanel2L; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2LO"
    private Button anchorpanel2LO; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2MR"
    private Button anchorpanel2MR; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2PR"
    private Label anchorpanel2PR; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2PRNO"
    private Label anchorpanel2PRNO; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2RH"
    private Button anchorpanel2RH; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2RM"
    private Label anchorpanel2RM; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2RMNO"
    private Label anchorpanel2RMNO; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2RR"
    private Label anchorpanel2RR; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2RRNO"
    private Label anchorpanel2RRNO; // Value injected by FXMLLoader

    @FXML // fx:id="anchorpanel2SP"
    private SplitPane anchorpanel2SP; // Value injected by FXMLLoader

    @FXML // fx:id="bloodrequestsymbol"
    private ImageView bloodrequestsymbol; // Value injected by FXMLLoader

    @FXML // fx:id="donatesymbol"
    private ImageView donatesymbol; // Value injected by FXMLLoader

    @FXML // fx:id="homesymbol"
    private ImageView homesymbol; // Value injected by FXMLLoader

    @FXML // fx:id="imagefull"
    private ImageView imagefull; // Value injected by FXMLLoader

    @FXML // fx:id="requesthistorysybol"
    private ImageView requesthistorysybol; // Value injected by FXMLLoader

    @FXML
    void donatebuttonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("12_DONOR PAGE.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("donor");

    }

    @FXML
    void homebuttonOnAction(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("9_patientoverview (1).fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Home");

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchorpanel2AA != null : "fx:id=\"anchorpanel2AA\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2AR != null : "fx:id=\"anchorpanel2AR\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2ARNO != null : "fx:id=\"anchorpanel2ARNO\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2BG != null : "fx:id=\"anchorpanel2BG\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2BGB != null : "fx:id=\"anchorpanel2BGB\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2H != null : "fx:id=\"anchorpanel2H\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2H1 != null : "fx:id=\"anchorpanel2H1\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2L != null : "fx:id=\"anchorpanel2L\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2LO != null : "fx:id=\"anchorpanel2LO\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2MR != null : "fx:id=\"anchorpanel2MR\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2PR != null : "fx:id=\"anchorpanel2PR\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2PRNO != null : "fx:id=\"anchorpanel2PRNO\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2RH != null : "fx:id=\"anchorpanel2RH\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2RM != null : "fx:id=\"anchorpanel2RM\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2RMNO != null : "fx:id=\"anchorpanel2RMNO\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2RR != null : "fx:id=\"anchorpanel2RR\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2RRNO != null : "fx:id=\"anchorpanel2RRNO\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert anchorpanel2SP != null : "fx:id=\"anchorpanel2SP\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert bloodrequestsymbol != null : "fx:id=\"bloodrequestsymbol\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert donatesymbol != null : "fx:id=\"donatesymbol\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert homesymbol != null : "fx:id=\"homesymbol\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert imagefull != null : "fx:id=\"imagefull\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";
        assert requesthistorysybol != null : "fx:id=\"requesthistorysybol\" was not injected: check your FXML file '9_patientoverview (1).fxml'.";

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
