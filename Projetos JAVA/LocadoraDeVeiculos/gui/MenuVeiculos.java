package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cadastramentos.*;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Classe responsável por controlar a interface gráfica JavaFX ( Controller )
 */
public class MenuVeiculos implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private CadVeiculos listaVeiculos;
    
    public MenuVeiculos(){
    }

    public MenuVeiculos(CadVeiculos listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    // Cadastro de Veículos
    @FXML
    private TextField anoVeiculo;

    @FXML
    private TextField placaVeiculo;

    @FXML
    private TextField valorDiaVeiculo;

    @FXML
    public ChoiceBox<String> escolherTipoVeiculo2 = new ChoiceBox<>();
    public String[] tipoVeiculo2 = { "Carro", "Caminhão", "Ônibus" };

    @FXML
    void voltarMenuInicial(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("layoutInicio.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void getValorDiaLocacao(MouseEvent event) {
        
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        escolherTipoVeiculo2.getItems().addAll(tipoVeiculo2);
        escolherTipoVeiculo2.setOnAction(this::getTipoVeiculoMV);

    }

    public void getTipoVeiculoMV(ActionEvent event) {

        String tipoVeiculo2 = escolherTipoVeiculo2.getValue();
        System.out.println(tipoVeiculo2);

    }
}