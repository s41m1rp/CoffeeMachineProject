package macchinacaffe;

//POJO RICEVUTO DAL CLIENTE
public class Ordine {
	
	private Prodotto prodotto;
	private int numZucchero;
	private boolean hasStick;
	
	
	public Ordine(Prodotto aProdotto){
		this.prodotto = aProdotto;
	}
	public Ordine (Prodotto aProdotto, int aNumZucchero){
		this.prodotto = aProdotto;
		this.numZucchero = aNumZucchero;
		this.hasStick = aNumZucchero == 0 ? false : true;
	}
	
	public Prodotto getProdotto(){
		return this.prodotto;
	}
	
	public void setProdotto(Prodotto aProdotto){
		this.prodotto = aProdotto;
	}
	
	public int getNumZucchero(){
		return this.numZucchero;
	}	

	public void setNumZucchero(int aNumZucchero){
		this.numZucchero = aNumZucchero;
	}
    
	public boolean getHasStick(){
		return this.hasStick;
	}

}
