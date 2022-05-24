package com.example.try1;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Table
    @FXML
    private TableView<Customer> tableView;

    //Columns
    @FXML
    private TableColumn<Customer, String> driverColumn;

    @FXML
    private TableColumn<Customer, String> statusColumn;

    @FXML
    private TableColumn<Customer, Integer> capacityColumn;

    @FXML
    private TableColumn<Customer, String> locationColumn;

    @FXML
    private TableColumn<Customer, String> customerColumn;

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        driverColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("driver"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        capacityColumn.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("capacity"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("location"));
        customerColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("customer"));
    }

    //Submit button
    @FXML
    void submit(ActionEvent event) {
        Customer customer = new Customer(driverInput.getText(),
                                        statusInput.getText(),
                                        Integer.parseInt(capacityInput.getText()),
                                        locationInput.getText(),
                                        customerInput.getText());
        ObservableList<Customer> customers = tableView.getItems();
        customers.add(customer);
        tableView.setItems(customers);
    }

    @FXML
    void removeCustomer(ActionEvent event) {
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }
}
