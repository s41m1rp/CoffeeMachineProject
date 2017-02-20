package exception;

public class AvvisiMacchinaCaffe extends RuntimeException{
	
		private static final long serialVersionUID = 1L;
		
		private String message;		

		public AvvisiMacchinaCaffe(String message) {
			this.message = message;			
		}
		
		@Override
		public String getMessage() {
			return message;
		}
	}

