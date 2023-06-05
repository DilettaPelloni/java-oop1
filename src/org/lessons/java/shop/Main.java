package org.lessons.java.shop;

//IMPORT
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        //creo una nuova istanza di Prodotto
        Prodotto product1 = new Prodotto("pasta", "pasta fresca", 5.2, 22);

        //Stampo gli attributi di product1 usando i getters
        System.out.println("Codice: " + product1.getCodice());
        System.out.println("Nome: " + product1.getNome());
        System.out.println("Descrizione: " + product1.getDescrizione());
        System.out.println("Prezzo: " + new DecimalFormat("###,###.00€").format(product1.getPrezzo()));
        System.out.println("Aliquota IVA: " + product1.getIva() + "%");
        //stampo anche il prezzo ivato e il nome completo
        System.out.println("Prezzo ivato: " + new DecimalFormat("###,###.00€").format(product1.getPrezzoIvato()));
        System.out.println("Nome completo: " + product1.getNomeCompleto());
        //BONUS
        System.out.println("Codice di 8 cifre: " + product1.getCodicePad());

        //Spazio
        System.out.println("\n---\n");

        //Modifico i campi modificabili
        product1.setNome("pane");
        product1.setDescrizione("pane caldo");
        product1.setPrezzo(10.3);
        product1.setIva(10);

        //stampo gli attributi usando il metodo stampaAttibuti
        product1.stampaAttibuti();

    }
}
