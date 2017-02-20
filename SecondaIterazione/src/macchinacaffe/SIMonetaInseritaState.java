package macchinacaffe;

import exception.AvvisiMacchinaCaffe;

public class SIMonetaInseritaState implements IMacchinaCaffeState{
	
	MacchinaCaffe macchina = null;
    
    public SIMonetaInseritaState(MacchinaCaffe aMacchine) {
        this.macchina =  aMacchine;
    }
   
	@Override
	public void inserisciMoneta(Moneta moneta) throws AvvisiMacchinaCaffe {
		throw new AvvisiMacchinaCaffe("[SIMonetaInseritaState] Moneta � gi� stata inserita.");		
	}
	@Override
	public void selezionaOrdine(Ordine ordine, Moneta moneta) throws AvvisiMacchinaCaffe {
		macchina.setErogazioneState(macchina.getErogazioneState(), moneta);		
	}
	@Override
	public void distribuisciOrdine(Ordine ordine) throws AvvisiMacchinaCaffe {
		throw new AvvisiMacchinaCaffe("[SIMonetaInseritaState] Non � stato selezionato nessun prodotto.");
		
	}
}
