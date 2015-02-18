/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcinfo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

/**
 * FXML Controller class
 *
 * @author ALI IBRAHIM
 */
public class ConnexionController implements Initializable {
    @FXML
    private TitledPane fenêtre_identifiction;
    @FXML
    private TextField champ_nom;
    @FXML
    private PasswordField champ_mot2pass;
    @FXML
    private Button btn_connex_confirm;
    @FXML
    private Button btn_fermer;
    @FXML
    private Label Msg_retour;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
