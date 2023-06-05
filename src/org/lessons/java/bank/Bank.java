package org.lessons.java.bank;

//IMPORT
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        //Apro lo scanner
        Scanner scan = new Scanner(System.in);
        //Chiedo il nome all'utente
        System.out.print("Benvenuto!\nInserisci il tuo nome per creare un conto: ");
        String nomeUtente = scan.nextLine();
        //Creo un nuovo conto
        Conto nuovoConto = new Conto(nomeUtente);
        System.out.println("Conto creato con successo!\n");

        //Entro nel loop delle attività possibili finché l'utente non sceglie 3
        int inputUtente;
        do {
            do {
                //Faccio scegliere all'utente un'opzione, raccolgo l'input e verifico se è valido
                System.out.println("Cosa vuoi fare? Digita il numero dell'opzione:");
                System.out.println("1 - Versa una somma");
                System.out.println("2 - Preleva una somma");
                System.out.println("3 - Esci");
                inputUtente = scan.nextInt();
                if (inputUtente < 1 || inputUtente > 3) {
                    System.out.println("L'input inserito non è valido.\n");
                }
            } while (inputUtente < 1 || inputUtente > 3);
            //faccio cose in base all'input
            switch (inputUtente) {
                case 1:
                    System.out.println("Inserisci l'importo da versare:");
                    double sommaDaVersare = scan.nextDouble();
                    nuovoConto.versaSomma(sommaDaVersare);
                    break;
                case 2:
                    System.out.println("Inserisci l'importo da prelevare:");
                    double sommaDaPrelevare = scan.nextDouble();
                    nuovoConto.prelevaSomma(sommaDaPrelevare);
                    break;
            }
        } while (inputUtente != 3);

        //Chiudo lo scanner
        scan.close();

    }
}
