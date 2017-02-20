package macchinacaffe;

import exception.AvvisiMacchinaCaffe;

public interface IMacchinaCaffeState {

	public void inserisciMoneta(Moneta moneta) throws AvvisiMacchinaCaffe;
	
	public void selezionaOrdine(Ordine ordine, Moneta moneta) throws AvvisiMacchinaCaffe;
	
	public void distribuisciOrdine(Ordine ordine) throws AvvisiMacchinaCaffe;
}
