package macchinacaffe;

import exception.AvvisiMacchinaCaffe;

public interface IMacchinaCaffeState {
		
	public void selezionaOrdine(Ordine ordine) throws AvvisiMacchinaCaffe;
	
	public void distribuisciOrdine(Ordine ordine) throws AvvisiMacchinaCaffe;
}
