package test;

import exception.AvvisiMacchinaCaffe;
import macchinacaffe.MacchinaCaffe;
import macchinacaffe.Ordine;
import macchinacaffe.Prodotto;

public class TestMacchinaCaffe {
    
    public static void main(String[] args) {
    	/*
         * Inizializzazione della macchina con lo stato NoSelezioneState
         */
        MacchinaCaffe macchinaCaffe = new MacchinaCaffe();
        //preparazione degli ordini
        Ordine ordineCaffe = new Ordine(Prodotto.CAFFE,1);
        Ordine ordineTe = new Ordine(Prodotto.TE);
        Ordine ordineCioccolato = new Ordine(Prodotto.CIOCCOLATO,2);        
        
        System.out.println("Current Macchina Caffe State : "
                        + macchinaCaffe.getMacchinaCaffeState().getClass().getName()+"\n");
        //1° Test (richiesta prodotto senza selezione)
        try{
        	macchinaCaffe.distribuisciOrdine(ordineCaffe);
            	
        }catch(AvvisiMacchinaCaffe e){
        	System.out.println("Test 1: " + e.getMessage());
        }        
        //2° Test (seleziona prodotto cioccolato con zucchero)        
        try{
            macchinaCaffe.selezionaOrdine(ordineCioccolato);            
        } catch(AvvisiMacchinaCaffe e){        	
        	System.out.println("Test 2: " + e.getMessage());
        }           
        /*
         * Una selezione è stata fatta quindi la macchina del caffè ha cambiato il suo stato 
         * interno in 'SISelezioneState'
         */    
        //3° Test (seleziona prodotto te contemporaneamente al precedente cioccolato)
        try{
        	macchinaCaffe.selezionaOrdine(ordineTe);
        }catch(AvvisiMacchinaCaffe e){
        	System.out.println("Test 3: " + e.getMessage());
        } 
        
        //4° Test (distribuire prodotto 'cioccolato' selezionato in precedenza)
        try{
        	macchinaCaffe.distribuisciOrdine(ordineCioccolato);
        }catch(AvvisiMacchinaCaffe e){
        	System.out.println("Test 4: " + e.getMessage());
        }                
        /*
         * Il prodotto è stato distribuito quindi la macchina del caffè cambia il suo stato
         * interno in 'NOSelezioneState'
         */                
        //5° Test (seleziona prodotto senza zucchero)
        try{
        	macchinaCaffe.selezionaOrdine(ordineTe);        	
        }catch(AvvisiMacchinaCaffe e){
        	System.out.println("Test 5: " + e.getMessage());
        	try{
        		macchinaCaffe.distribuisciOrdine(ordineTe);       	
            }catch(AvvisiMacchinaCaffe f){
            	System.out.println("Test 5.1: " + f.getMessage());
            }
        }                      
        
    }
}