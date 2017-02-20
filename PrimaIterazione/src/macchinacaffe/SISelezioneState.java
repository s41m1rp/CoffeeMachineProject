package macchinacaffe;

import exception.AvvisiMacchinaCaffe;

public class SISelezioneState implements IMacchinaCaffeState{	
		
	MacchinaCaffe macchina ;
    
	SISelezioneState(MacchinaCaffe aMacchina) {
        this.macchina = aMacchina;
    }
	
	@Override
	public void selezionaOrdine(Ordine ordine) {
		throw new AvvisiMacchinaCaffe("[SISelezioneState] La Macchina Caffe ha gia il prodotto " + macchina.getCurrentOrdine().getProdotto().name() +
				" selezionato, aspetta che finisca cosi potra selezionare un altro ... ");		
	}
	
	@Override
	public void distribuisciOrdine(Ordine ordine) {
		
		//"Drink maker makes 1 tea with 1 sugar and a stick"
		//"Drink maker makes 1 chocolate with no sugar and therefore no stick"	
		macchina.setNoSelezioneState(macchina.getNoSelezioneState());
		throw new AvvisiMacchinaCaffe(getMessaggio(ordine) + " - " + getCommando(ordine));		
	}
	
	private String getMessaggio (Ordine ordine){
		String messaggio = "Drink maker makes 1 " + ordine.getProdotto().getNome();
		if (ordine.getNumZucchero() != 0){
			messaggio = messaggio + " with " + ordine.getNumZucchero() + " sugar and a stick";
		}else{
			messaggio = messaggio + " with no sugar and therefore no stick";
		}
		
		return messaggio;
	}
	
	private String getCommando(Ordine ordine){
		String c = "[" + ordine.getProdotto().getCodice() + ":" + ordine.getNumZucchero() + ":" +
	    ordine.getHasStick() + "]";
		return c;
	}

}
