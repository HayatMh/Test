package testeController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class testController implements Initializable{

    @FXML
    private TextField text;

    @FXML
    private Button button;

    @FXML
    private TextField text2;

    @FXML
    void onClick(ActionEvent event) {
     text2.setText(text.getText());
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		text.setText("write here");
		text2.setText("results here");
		
	}

}
