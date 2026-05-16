package com.holamundo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SaludoController {

    @FXML
    TextField txtMensaje;

    @FXML
    private void mostrarMensaje(ActionEvent event) {

    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtMensaje.setText("");
    }

}
