package macchinacaffe;

public enum Moneta {	
		
		DIECI(0.1), VENTI(0.2), CINQUANTA(0.5), UNO(1), DUE(2); 
		
		private double valore;
		
		private Moneta(double aValore){ 
			this.valore = aValore; 
		} 
		
		public double getValore(){ 
			return valore; 
		} 
		
	}
