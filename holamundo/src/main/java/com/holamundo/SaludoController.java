package com.holamundo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SaludoController {

    @FXML
    TextField txtMensaje;

    @FXML
    private void mostrarMensaje(ActionEvent event) {
        // Crear una alerta para mostrar el mensaje
        String mensaje = txtMensaje.getText();
        if (mensaje.isEmpty()) {    
            mensaje = "¡Hola, Mundo!";
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtMensaje.setText("");
    }

}
