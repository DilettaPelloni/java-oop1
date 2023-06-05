package org.lessons.java.shop;
//IMPORT
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    //COSTRUTTORE
    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.codice = new Random().nextInt(0, 100000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //GETTERS
    public int getCodice() {
        return codice;
    }
    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public int getIva() {
        return iva;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }

    //METODI
    public double getPrezzoIvato() {
        return prezzo + prezzo * iva / 100;
    }
    public String getNomeCompleto() {
        return codice + "-" + nome;
    }
    public void stampaAttibuti() {
        System.out.println("Codice: " + codice);
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + new DecimalFormat("###,###.00€").format(prezzo));
        System.out.println("Aliquota IVA: " + iva + "%");
        System.out.println("Prezzo ivato: " + new DecimalFormat("###,###.00€").format(getPrezzoIvato()));
        System.out.println("Nome completo: " + getNomeCompleto());
    }

}
