package macchinacaffe;

import exception.AvvisiMacchinaCaffe;

public class ErogazioneState implements IMacchinaCaffeState{

	MacchinaCaffe macchina ;
    
	ErogazioneState(MacchinaCaffe aMacchina) {
        this.macchina = aMacchina;
    }
	@Override
	public void inserisciMoneta(Moneta moneta) throws AvvisiMacchinaCaffe {
		throw new AvvisiMacchinaCaffe("[ErogazioneState] aspetta ... un altro ordine in corso...");		
	}
	@Override
	public void selezionaOrdine(Ordine ordine, Moneta moneta) throws AvvisiMacchinaCaffe {
		throw new AvvisiMacchinaCaffe("[ErogazioneState] aspetta ... un altro ordine in corso...");
	}
	@Override	
	public void distribuisciOrdine(Ordine ordine) throws AvvisiMacchinaCaffe {		
		
		macchina.setNoMonetaInseritaState(macchina.getNoMonetaInseritaState());
		
		// resto uguale alla differenza fra importo e prezzo del prodotto
		double importo = macchina.getMoneta().getValore();
		double prezzo = ordine.getProdotto().getPrezzo();
		double diff = importo - prezzo;
		
		//"Drink maker makes 1 tea with 1 sugar and a stick"
		//"Drink maker makes 1 chocolate with no sugar and therefore no stick"						
		if(diff < 0){
			throw new AvvisiMacchinaCaffe("Drink maker coud not make product " + ordine.getProdotto().getNome() + " because needs " + Math.abs(diff) + "€");	
		}else if(diff > 0){			
			throw new AvvisiMacchinaCaffe(getMessaggio(ordine) + " with rest " + diff + " - " + getCommando(ordine));
		}else{
			throw new AvvisiMacchinaCaffe(getMessaggio(ordine) + " - " + getCommando(ordine));
		}
		
	}
	
	private String getMessaggio(Ordine ordine){
		
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
