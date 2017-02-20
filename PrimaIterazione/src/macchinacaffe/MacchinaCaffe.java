package macchinacaffe;

import exception.AvvisiMacchinaCaffe;
//Context
public class MacchinaCaffe{

	private IMacchinaCaffeState noSelezioneState = new NoSelezioneState(this);    
	private IMacchinaCaffeState sISelezioneState = new SISelezioneState(this);	
	private IMacchinaCaffeState macchinaCaffeState;
    
	private Ordine currentOrdine;
    
	public MacchinaCaffe()
	{
		macchinaCaffeState = noSelezioneState;
	}

	public IMacchinaCaffeState getMacchinaCaffeState()
	{
	    return macchinaCaffeState;
	}

	public void setMacchinaCaffeState( IMacchinaCaffeState macchinaCaffeState )
	{
		this.macchinaCaffeState = macchinaCaffeState;
	}
	
	public void setNoSelezioneState(IMacchinaCaffeState aNoSelezioneState) {
        this.macchinaCaffeState = aNoSelezioneState;         
    }
    public IMacchinaCaffeState getNoSelezioneState() {
        return noSelezioneState;
    }
    
    public void setSISelezioneState(IMacchinaCaffeState aSiSelezioneState, Ordine ordine) {
        this.macchinaCaffeState = aSiSelezioneState;   
        setCurrentOrdine(ordine);
    }
    
    public IMacchinaCaffeState getSiSelezioneState() {
        return sISelezioneState;
    }
    
	public void setCurrentOrdine(Ordine ordine){
		this.currentOrdine=ordine;
	}
	
	public Ordine getCurrentOrdine(){
		return this.currentOrdine;
	}
	
	public void selezionaOrdine(Ordine ordine)throws AvvisiMacchinaCaffe {				
		macchinaCaffeState.selezionaOrdine(ordine);		
		      
	}	

	public void distribuisciOrdine(Ordine ordine)throws AvvisiMacchinaCaffe {			
		macchinaCaffeState.distribuisciOrdine(ordine);
	    	   
	}

}
