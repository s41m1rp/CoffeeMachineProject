package test;

import exception.AvvisiMacchinaCaffe;
import macchinacaffe.MacchinaCaffe;
import macchinacaffe.Moneta;
import macchinacaffe.Ordine;
import macchinacaffe.Prodotto;

public class Test2MacchinaCaffe {
  
    public static void main(String[] args) {
    	
    	//set macchina caffe nello stato iniziale [NOMonetaInseritaState]
        MacchinaCaffe machine = new MacchinaCaffe();                
        Ordine ordine;         
        //Primo test: distribuzione prodotto con prezzo esatto
        try {
        	ordine = new Ordine(Prodotto.CIOCCOLATO,1);
            machine.inserisciMoneta(Moneta.CINQUANTA);
            machine.selezionaOrdine(ordine);                                  
        } catch (AvvisiMacchinaCaffe e) {
            System.out.println("Test 1:" + e.getMessage());
        }
        //Secondo test: distribuzione prodotto con resto
        try {
        	ordine = new Ordine(Prodotto.TE);
            machine.inserisciMoneta(Moneta.UNO);            
            machine.selezionaOrdine(ordine);            
        } catch (AvvisiMacchinaCaffe e) {
            System.out.println("Test 2:" + e.getMessage());
            try {
            	//richiesta prodotto senza inserire soldi 
            	ordine = new Ordine(Prodotto.CIOCCOLATO,1);
                machine.selezionaOrdine(ordine);
            } catch (AvvisiMacchinaCaffe f) {
            	System.out.println("Test 2.1:" + f.getMessage());
            }
        }
        //Terzo test: richiesta prodotto con soldi mancanti
        try {
        	ordine = new Ordine(Prodotto.CIOCCOLATO,1);
        	machine.inserisciMoneta(Moneta.DIECI);            
            machine.selezionaOrdine(ordine);              
        } catch (AvvisiMacchinaCaffe e) {
            System.out.println("Test 3:" + e.getMessage());
        }
        //Quarto test: richiesta prodotto senza inserire soldi 
        try {
        	ordine = new Ordine(Prodotto.CIOCCOLATO,1);
        	machine.selezionaOrdine(ordine); 
        } catch (AvvisiMacchinaCaffe e) {
            System.out.println("Test 4:" + e.getMessage());
        }
    }
}