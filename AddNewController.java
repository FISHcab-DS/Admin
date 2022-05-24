package com.example.fishcab;


import javafx.fxml.FXML;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddNewController {
//implements Initializable{

    //Table
    @FXML
    private TableView<IO> tableView;

    //Columns
    @FXML
    private TableColumn<IO, String> driverColumn;

    @FXML
    private TableColumn<IO, String> statusColumn;

    @FXML
    private TableColumn<IO, String> capacityColumn;

    @FXML
    private TableColumn<IO, String> locationColumn;

    @FXML
    private TableColumn<IO, String> customerColumn;

    //Text input
    @FXML
    private TextField driverInput;

    @FXML
    private TextField statusInput;

    @FXML
    private TextField capacityInput;

    @FXML
    private TextField locationInput;

    @FXML
    private TextField customerInput;

    private Scene scene;
    private Stage stage;
/*
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        driverColumn.setCellValueFactory(new PropertyValueFactory<IO, String>("driver"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<IO, String>("status"));
        capacityColumn.setCellValueFactory(new PropertyValueFactory<IO, String>("capacity"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<IO, String>("location"));
        customerColumn.setCellValueFactory(new PropertyValueFactory<IO, String>("customer"));

        ObservableList<IO> input = FXCollections.observableArrayList(
                new IO("Ali",
                        "Pending",
                        "2",
                        "Melaka",
                        "Sarah"));

            tableView.setItems(input);
        }


        //Submit button
        @FXML
        void submit(ActionEvent event) {
            IO io = new IO(driverInput.getText(),
                    statusInput.getText(),
                    capacityInput.getText(),
                    locationInput.getText(),
                    customerInput.getText());
            ObservableList<IO> input = tableView.getItems();
            input.add(io);
            tableView.setItems(input);
        }
*/
        public void switchToAddDetails(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("AddDetails.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.centerOnScreen();
        }

        public void switchToRemoveDriver(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("RemoveDriver.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.centerOnScreen();
        }

        public void switchToAdminHomePage(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.centerOnScreen();
        }

}
