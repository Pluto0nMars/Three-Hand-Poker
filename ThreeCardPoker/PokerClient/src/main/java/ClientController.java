import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class ClientController {
    @FXML
    private  TextField ipTextField;

    @FXML
    private  TextField portTextField;

    @FXML
    private Button joinButoon;

    private PokerClient client = new PokerClient();

    private void connectToServer(){
        String ip = ipTextField.getText().trim();
        int port = Integer.parseInt(portTextField.getText());
        client.connectToServer(ip, port);
    }
}
