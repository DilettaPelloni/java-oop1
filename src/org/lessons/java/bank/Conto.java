package org.lessons.java.bank;

//IMPORT
import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
    //ATTRIBUTI
    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    //COSTRUTTORE
    public Conto(String nomeProprietario) {
        this.numeroConto = new Random().nextInt(1, 1001);
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0;
    }

    //GETTERS
    public int getNumeroConto() {
        return numeroConto;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public double getSaldo() {
        return saldo;
    }

    //SETTERS
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    //METODI
    public String getSaldoFormattato() {
        return new DecimalFormat("#,###.00€").format(saldo);
    }

    //Per semplicità, nei metodi seguenti ho fatto stampare direttamente il messaggio di esito,
    //ma è sempre meglio restituire solamente un codice che identifichi l'esito e lasciare che questo venga stampato da un'altra parte.
    //È giusto anche creare una classe OperationResult che contenga i dati relativi all'esito(codice, messaggio, ecc.) e restituire un'istanza di questa.

    public void versaSomma(double somma) {
        if(somma > 0) {
            saldo += somma;
            System.out.println("Importo versato correttamente");
            System.out.println("Saldo aggiornato: " + getSaldoFormattato() + "\n");
        } else if(somma == 0) {
            System.out.println("Hai inserito 0. Nessun importo è stato versato\n");
        } else {
            System.out.println("Non è possibile versare un importo negativo.\nOPERAZIONE ANNULLATA\n");
        }
    }
    public void prelevaSomma(double somma) {
        if(somma == 0) {
            System.out.println("Hai inserito 0. Nessun importo è stato prelevato\n");
        } else if(somma <= saldo) {
            saldo -= somma;
            System.out.println("Importo prelevato correttamente");
            System.out.println("Saldo aggiornato: " + getSaldoFormattato() + "\n");
        } else {
            System.out.println("Stai cercando di prelevare una somma maggiore del saldo disponibile!\nOPERAZIONE ANNULLATA");
            System.out.println("Saldo disponibile: " + getSaldoFormattato() + "\n");
        }
    }

}
