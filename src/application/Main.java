package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application implements Initializable {

	@FXML
	private TextField txtName;
	@FXML
	private TextField txtIdade;
	@FXML
	private TextField txtTurma;
	@FXML
	private TextField txtRemove;
	@FXML
	private Button btSalvar;
	@FXML
	private Button btRemover;
	@FXML
	private TextArea area;

	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
			// Cria a cena
			Scene mainScene = new Scene(root);
			// Define parâmetros para a janela
			primaryStage.setTitle("Estrutura de dados");
			primaryStage.setResizable(false);
			primaryStage.setScene(mainScene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void salvar(ActionEvent event) {
		String nome = txtName.getText().trim();
		int idade = Integer.parseInt(txtIdade.getText().trim());
		String turma = txtTurma.getText().trim();
		Aluno aluno = new Aluno(nome, idade, turma);
		attTextArea();
	}

	@FXML
	public void remover(ActionEvent event) {
		String nome = txtRemove.getText().trim();
		System.out.println(nome);
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	public void attTextArea() {
		System.out.println("att..");
	}
}
