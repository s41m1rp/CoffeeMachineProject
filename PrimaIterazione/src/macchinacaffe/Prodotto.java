package macchinacaffe;


	/** * Items or products supported by Vending Machine.
	 *  * 
	 *   */ 
	public enum Prodotto{ 
		TE("TE", "T"), CAFFE("CAFFE", "C"), CIOCCOLATO("CIOCCOLATO", "H"); 
		
		private String nome;					
		private String codice;		
		
		private Prodotto(String aNome, String aCodice){ 						
			this.nome = aNome; 		
			this.codice = aCodice; 			
		} 	
		public String getNome(){ 
			return nome; 
		}
		
		public String getCodice(){ 
			return codice; 
		}				
	}
