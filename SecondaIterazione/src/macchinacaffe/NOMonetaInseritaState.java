package macchinacaffe;

import exception.AvvisiMacchinaCaffe;

public class NOMonetaInseritaState implements IMacchinaCaffeState{
	
	MacchinaCaffe macchina;
    
    public NOMonetaInseritaState(MacchinaCaffe aMacchina) {
        this.macchina =  aMacchina;
    }

	@Override
	public void inserisciMoneta(Moneta moneta) throws AvvisiMacchinaCaffe {		
		macchina.setMonetaInseritaState(macchina.getMonetaInseritaState(), moneta);        
	}
	@Override
	public void selezionaOrdine(Ordine ordine, Moneta moneta) throws AvvisiMacchinaCaffe {
		throw new AvvisiMacchinaCaffe("[NOMonetaInseritaState] Nessuna moneta inserita ..");
		
	}
	@Override
	public void distribuisciOrdine(Ordine ordine) throws AvvisiMacchinaCaffe {
		throw new AvvisiMacchinaCaffe("[NOMonetaInseritaState] Operazione non concessa.");		
	}
}
