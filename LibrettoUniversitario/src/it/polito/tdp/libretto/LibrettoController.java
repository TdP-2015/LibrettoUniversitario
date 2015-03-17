package it.polito.tdp.libretto;

import java.time.LocalDate;

import it.polito.tdp.libretto.model.Esame;
import it.polito.tdp.libretto.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LibrettoController {
	
	private Model model;

    @FXML
    private DatePicker txtData;

    @FXML
    private TextField txtMedia;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtEsami;

    @FXML
    private TextField txtCorso;

    @FXML
    private Button btnVisuallizza;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnInserisci;


    @FXML
    void doInserisci(ActionEvent event) {
    	
    	LocalDate data = txtData.getValue() ;
    	String corso = txtCorso.getText() ;
    	int voto = Integer.parseInt(txtVoto.getText()) ;
    	
    	model.add(new Esame(data, corso, voto));
    	
    	txtEsami.setText(String.format("%d", model.getNumeroEsami()));
    	txtMedia.setText(String.format("%.2f", model.getMediaEsami()));
    }

    @FXML
    void doVisualizza(ActionEvent event) {
    	
    	txtResult.clear();
    	
    	for(Esame e: model.getLibretto()) {
    		txtResult.appendText(
    				String.format("%tF %-20s %2d\n", e.getData(), e.getCorso(), e.getVoto())
    				);
    		
    	}

    }

	public void setModel(Model model) {
		this.model = model ;
	}

}
