package macchinacaffe;

import exception.AvvisiMacchinaCaffe;

public class NoSelezioneState implements IMacchinaCaffeState{
	
	MacchinaCaffe macchina ;
    
	NoSelezioneState(MacchinaCaffe aMacchina) {
        this.macchina = aMacchina;
    }
	
	@Override
	public void selezionaOrdine(Ordine ordine)  {		
		macchina.setSISelezioneState(macchina.getSiSelezioneState(), ordine);
		throw new AvvisiMacchinaCaffe(ordine.getProdotto().getNome() + " è stato selezionato...");
	}
	
	@Override
	public void distribuisciOrdine(Ordine ordine) {
		throw new AvvisiMacchinaCaffe("[NoSelezioneState]Macchina Caffe non può distribuire il prodotto " + ordine.getProdotto().getNome() +
				" poichè niente è stato selezionato...");
		
	}
}
