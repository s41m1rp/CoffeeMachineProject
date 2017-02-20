package macchinacaffe;

import exception.AvvisiMacchinaCaffe;
//Context
public class MacchinaCaffe{

	private IMacchinaCaffeState monetaInseritaState = new SIMonetaInseritaState(this);    	
	private IMacchinaCaffeState noMonetaInseritaState = new NOMonetaInseritaState(this);    
	private IMacchinaCaffeState erogazioneState = new ErogazioneState(this);		
	private IMacchinaCaffeState macchinaCaffeState = null;
	private Moneta moneta;	
    
    public MacchinaCaffe() {
        macchinaCaffeState = noMonetaInseritaState;        
        moneta = null;
    }
        	
	public void inserisciMoneta(Moneta moneta) throws AvvisiMacchinaCaffe {		
		macchinaCaffeState.inserisciMoneta(moneta);
	}
	
	public void selezionaOrdine(Ordine ordine) throws AvvisiMacchinaCaffe {		 					 
		macchinaCaffeState.selezionaOrdine(ordine, this.moneta);
		macchinaCaffeState.distribuisciOrdine(ordine);			 			 	 		
	}	
   
    public void setMachineState(IMacchinaCaffeState machineState) {
        this.macchinaCaffeState = machineState;        
    }
    
    public IMacchinaCaffeState getMachineState() {
        return macchinaCaffeState;
    }
        
    public Moneta getMoneta() {
        return this.moneta;
    }
    
    public void setMonetaInseritaState(IMacchinaCaffeState monetaInseritaState, Moneta moneta) {
        this.macchinaCaffeState = monetaInseritaState;  
        this.moneta = moneta;        
    }
    public IMacchinaCaffeState getMonetaInseritaState() {
        return monetaInseritaState;
    }
    
    public void setNoMonetaInseritaState(IMacchinaCaffeState noMonetaInseritaState) {
        this.macchinaCaffeState = noMonetaInseritaState;
    }
    public IMacchinaCaffeState getNoMonetaInseritaState() {
        return noMonetaInseritaState;
    }
    public void setErogazioneState(IMacchinaCaffeState erogazioneState, Moneta moneta) {
        this.macchinaCaffeState = erogazioneState;
        this.moneta = moneta;
    }
    
    public IMacchinaCaffeState getErogazioneState() {
        return erogazioneState;
    }	        
}
