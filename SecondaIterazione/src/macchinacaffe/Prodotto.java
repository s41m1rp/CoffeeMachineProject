package macchinacaffe;


	/** * Items or products supported by Vending Machine.
	 *  * 
	 *   */ 
	public enum Prodotto{ 
		TE("TE", "T", 0.4), CAFFE("CAFFE", "C", 0.6), CIOCCOLATO("CIOCCOLATO", "H", 0.5); 
		
		private String nome;					
		private String codice;
		private double prezzo;	
		
		private Prodotto(String aNome, String aCodice, double aPrezzo){ 						
			this.nome = aNome; 		
			this.codice = aCodice;
			this.prezzo = aPrezzo; 			
		} 	
		public String getNome(){ 
			return nome; 
		}
		
		public String getCodice(){ 
			return codice; 
		}
		
		public double getPrezzo(){ 
			return prezzo; 
		}
	}
