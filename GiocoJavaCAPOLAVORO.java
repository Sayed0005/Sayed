
                                   //CAPO LAVORO AZAB ELSAYED SAMIR 3CI

package giocojavacapolavoro;

import java.util.Scanner;
import java.util.Random;

public class GiocoJavaCAPOLAVORO {

    // Array delle domande 
    private static final String[] domande = {
        "QUAL E' IL CONCETTO FONDAMENTALE DI PROGRAMMAZIONE ORIENTATA AGLI OGGETTI IN JAVA?",
        "QUAL E' IL METODO PRINCIPALE CHE VIENE ESEGUITO AUTOMATICAMENTE QUANDO SI AVVIA UN'APPLICAZIONE JAVA?",
        "COSA RAPPRESENTA LA PAROLA CHIAVE 'STATIC' IN JAVA?",
        "QUAL E' IL RISULTATO DELL'ESPRESSIONE '5 + 3 * 2' IN JAVA?",
        "COSA RAPPRESENTA LA PAROLA CHIAVE 'VOID' IN JAVA?",
        "COS'E' UN CICLO 'FOR' IN JAVA?",
        "COS'E' UNA VARIABILE LOCALE IN JAVA?",
        "COSA E' UNA CLASSE IN JAVA?",
        "QUAL E' LA DIFFERENZA TRA '==' E '.EQUALS()' IN JAVA?",
        "COSA SIGNIFICA 'JVM' IN JAVA?",
        "COS'E' UNA 'EXCEPTION' IN JAVA?",
        "COSA E' IL 'GARBAGE COLLECTION' IN JAVA?",
        "QUAL E' IL SIGNIFICATO DI 'SERIALIZZAZIONE' IN JAVA?",
        "COSA E' IL 'POLIMORFISMO' IN JAVA?"

    };

    // Array delle risposte alle domande 
    private static final String[][] risposte = {
        {"EREDITARIETA'", "POLIMORFISMO", "INCAPSULAMENTO", "INTERFACCIA"},
        {"MAIN()", "START()", "RUN()", "EXECUTE()"},
        {"UNA VARIABILE COSTANTE", "UN METODO CHE APPARTIENE ALLA CLASSE, NON ALL'ISTANZA", "UN'ISTANZA DI UNA CLASSE", "UNA VARIABILE LOCALE"},
        {"16", "11", "13", "10"},
        {"INDICA CHE IL METODO NON RESTITUISCE ALCUN VALORE", "INDICA CHE IL METODO RESTITUISCE UN VALORE BOOLEANO", "INDICA CHE IL METODO RESTITUISCE UN VALORE DI TIPO VOID", "INDICA CHE IL METODO PUO' ESSERE UTILIZZATO SOLO DA UN'ALTRA CLASSE"},
        {"UN'ISTRUZIONE PER L'ITERAZIONE DI UN BLOCCO DI CODICE UN NUMERO SPECIFICATO DI VOLTE", "UN'ISTRUZIONE PER L'ITERAZIONE DI UN BLOCCO DI CODICE FINCHE' UNA CONDIZIONE E' VERA", "UN'ISTRUZIONE PER L'ITERAZIONE DI UN BLOCCO DI CODICE UN NUMERO INDEFINITO DI VOLTE", "UN'ISTRUZIONE PER L'ITERAZIONE DI UN BLOCCO DI CODICE FINO A QUANDO UNA CONDIZIONE DIVENTA FALSA"},
        {"UNA VARIABILE DICHIARATA ALL'INTERNO DI UN BLOCCO DI CODICE CHE E' ACCESSIBILE SOLO ALL'INTERNO DI QUEL BLOCCO", "UNA VARIABILE DICHIARATA ALL'INTERNO DI UNA CLASSE CHE E' ACCESSIBILE SOLO A METODI DI QUELLA CLASSE", "UNA VARIABILE DICHIARATA ALL'ESTERNO DI QUALSIASI METODO CHE E' ACCESSIBILE A TUTTI I METODI DELLA CLASSE", "UNA VARIABILE DICHIARATA COME ARGOMENTO DI UN METODO"},
        {"UNA STRUTTURA CHE RAGGRUPPA DATI E METODI PER RAPPRESENTARE UN OGGETTO", "UN METODO STATIC CHE NON APPARTIENE A NESSUNA CLASSE", "UNA VARIABILE DICHIARATA CON IL MODIFICATORE 'STATIC'", "UNA VARIABILE DI ISTANZA"},
        {"'==' COMPARE I VALORI DEGLI OGGETTI, '.EQUALS()' COMPARE I CONTENUTI DEGLI OGGETTI", "'==' COMPARE I CONTENUTI DEGLI OGGETTI, '.EQUALS()' COMPARE I VALORI DEGLI OGGETTI", "'==' COMPARE GLI OGGETTI PER RIFERIMENTO, '.EQUALS()' COMPARE I CONTENUTI DEGLI OGGETTI", "'==' COMPARE GLI OGGETTI PER CONTENUTO, '.EQUALS()' COMPARE GLI OGGETTI PER RIFERIMENTO"},
        {"JAVA VIRTUAL MACHINE", "JAVA VALIDATION MODULE", "JAVA VISUAL MODULE", "JAVA VIRTUAL MODULE"},
        {"UN ERRORE CHE SI VERIFICA DURANTE L'ESECUZIONE DI UN PROGRAMMA E INTERROMPE IL SUO FLUSSO NORMALE", "UN ERRORE CHE SI VERIFICA DURANTE LA COMPILAZIONE DI UN PROGRAMMA", "UNA CLASSE CHE VIENE UTILIZZATA PER LA GESTIONE DELLE OPERAZIONI DI INPUT/OUTPUT", "UNA SOTTOCLASSE DELLA CLASSE 'EXCEPTION'"},
        {"UN MECCANISMO AUTOMATICO DI RACCOLTA DEGLI OGGETTI NON UTILIZZATI PER LIBERARE LA MEMORIA", "UN PROCESSO DI CREAZIONE DI COPIE DEGLI OGGETTI PER EVITARE LA PERDITA DI DATI", "UN PROCESSO PER ORDINARE GLI OGGETTI IN MEMORIA PER MIGLIORARE LE PRESTAZIONI", "UN MECCANISMO PER GESTIRE LE ECCEZIONI DURANTE L'ESECUZIONE DI UN PROGRAMMA"},
        {"IL PROCESSO DI CONVERTIRE UN OGGETTO IN UNA SEQUENZA DI BYTE PER SALVARLO SU UN SUPPORTO DI ARCHIVIAZIONE", "UN METODO PER CONVERTIRE LE STRINGHE IN INTERI", "UN MECCANISMO PER ORDINARE GLI OGGETTI IN MEMORIA PER MIGLIORARE LE PRESTAZIONI", "IL PROCESSO DI TRASFORMARE UNA CLASSE IN UN'INTERFACCIA"},
        {"LA CAPACITA' DI UN OGGETTO DI ESSERE INTERPRETATO IN MODI DIVERSI A SECONDA DEL SUO TIPO", "UNA TECNICA DI PROGRAMMAZIONE CHE CONSENTE DI UTILIZZARE LO STESSO METODO CON DIVERSI TIPI DI DATI", "UN PROCESSO DI RACCOLTA DEGLI OGGETTI NON UTILIZZATI PER LIBERARE LA MEMORIA", "IL PROCESSO DI CONVERTIRE UN OGGETTO IN UNA SEQUENZA DI BYTE PER SALVARLO SU UN SUPPORTO DI ARCHIVIAZIONE"}
    };

    // Array delle risposte corrette alle domande 
    private static final String[] rispostegiuste = {
        "EREDITARIETA'", "MAIN()", "UN METODO CHE APPARTIENE ALLA CLASSE, NON ALL'ISTANZA", "11",
        "INDICA CHE IL METODO NON RESTITUISCE ALCUN VALORE", "UN'ISTRUZIONE PER L'ITERAZIONE DI UN BLOCCO DI CODICE UN NUMERO SPECIFICATO DI VOLTE",
        "UNA VARIABILE DICHIARATA ALL'INTERNO DI UN BLOCCO DI CODICE CHE E' ACCESSIBILE SOLO ALL'INTERNO DI QUEL BLOCCO",
        "UNA STRUTTURA CHE RAGGRUPPA DATI E METODI PER RAPPRESENTARE UN OGGETTO",
        "'==' COMPARE I VALORI DEGLI OGGETTI, '.EQUALS()' COMPARE I CONTENUTI DEGLI OGGETTI",
        "JAVA VIRTUAL MACHINE",
        "UN ERRORE CHE SI VERIFICA DURANTE L'ESECUZIONE DI UN PROGRAMMA E INTERROMPE IL SUO FLUSSO NORMALE",
        "UN MECCANISMO AUTOMATICO DI RACCOLTA DEGLI OGGETTI NON UTILIZZATI PER LIBERARE LA MEMORIA",
        "IL PROCESSO DI CONVERTIRE UN OGGETTO IN UNA SEQUENZA DI BYTE PER SALVARLO SU UN SUPPORTO DI ARCHIVIAZIONE",
        "LA CAPACITA' DI UN OGGETTO DI ESSERE INTERPRETATO IN MODI DIVERSI A SECONDA DEL SUO TIPO"
    };

    // Array delle domande matematiche
    private static final String[] domandeMatematiche = {
        "QUANTO FA 5 + 3 * 3?",
        "QUANTO FA 6 * (7 + 4)?",
        "QUANTO FA 3 + 4 * (6 * 4) + 3?"
    };

    // Array delle risposte alle domande matematiche
    private static final String[][] risposteMatematiche = {
        {"14", "16", "18", "20"},
        {"54", "60", "66", "72"},
        {"97", "111", "115", "119"}
    };

    // Array delle risposte corrette alle domande matematiche
    private static final String[] risposteGiusteMatematiche = {"14", "66", "115"};

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Random random = new Random();
        boolean vuoiRipetere = true;

        while (vuoiRipetere) {
            int punteggio = 0;
            boolean[] domandeGiocate = new boolean[domande.length];
            int domandeGiocateCount = 0;

            System.out.println("BENVENUTO AL GIOCO JAVA!");
            System.out.println("");
            System.out.print("INSERISCI IL TUO NOME: ");
            String nome = tastiera.nextLine().toUpperCase();
            System.out.print("INSERISCI IL TUO COGNOME: ");
            String cognome = tastiera.nextLine().toUpperCase();
            System.out.print("INSERISCI LA TUA ETA': ");
            int eta = tastiera.nextInt();

            while (domandeGiocateCount < domande.length) {
                int randomI;
                do {
                    randomI = random.nextInt(domande.length);
                } while (domandeGiocate[randomI]);
                System.out.println("----------------------------------------------------");
                System.out.println("DOMANDA: " + domande[randomI]);
                int[] risposteRandom = {0, 1, 2, 3};
                shuffleArray(risposteRandom);
                for (int j = 0; j < risposte[randomI].length; j++) {
                    System.out.println((j + 1) + ". " + risposte[randomI][risposteRandom[j]]);
                }
                System.out.println("----------------------------------------------------");
                System.out.print("RISPOSTA ('F' PER TERMINARE): ");

                String sceltaUtente = tastiera.next().toUpperCase();

                if (sceltaUtente.equals("F")) {
                    break;
                } else if (sceltaUtente.matches("[1-4]")) {
                    int scelta = Integer.parseInt(sceltaUtente);
                    String domandaScelta = risposte[randomI][risposteRandom[scelta - 1]];

                    if (domandaScelta.equals(rispostegiuste[randomI])) {
                        System.out.println("CORRETTO!");

                        punteggio++;
                    } else {
                        System.out.println("SBAGLIATO. LA RISPOSTA CORRETTA ERA: " + rispostegiuste[randomI]);
                    }
                    System.out.println();
                    domandeGiocate[randomI] = true;
                    domandeGiocateCount++;
                } else {
                    System.out.println("INPUT NON VALIDO. RIPROVA.");
                }

                System.out.println("----------------------------------------------------");

                System.out.println("PUNTEGGIO ATTUALE: " + punteggio + " SU " + domandeGiocateCount);
            }

            int indiceMatematico = 0;
            while (indiceMatematico < domandeMatematiche.length) {
                System.out.println("----------------------------------------------------");
                System.out.println("DOMANDA: " + domandeMatematiche[indiceMatematico]);
                int[] risposteRandomMatematiche = {0, 1, 2, 3};
                shuffleArray(risposteRandomMatematiche);
                for (int j = 0; j < risposteMatematiche[indiceMatematico].length; j++) {
                    System.out.println((j + 1) + ". " + risposteMatematiche[indiceMatematico][risposteRandomMatematiche[j]]);
                }
                System.out.println("----------------------------------------------------");
                System.out.print("RISPOSTA ('F' PER TERMINARE): ");

                String sceltaUtenteMatematico = tastiera.next().toUpperCase();

                if (sceltaUtenteMatematico.equals("F")) {
                    break;
                } else if (sceltaUtenteMatematico.matches("[1-4]")) {
                    int sceltaMatematica = Integer.parseInt(sceltaUtenteMatematico);
                    String domandaSceltaMatematica = risposteMatematiche[indiceMatematico][risposteRandomMatematiche[sceltaMatematica - 1]];

                    if (domandaSceltaMatematica.equals(risposteGiusteMatematiche[indiceMatematico])) {
                        System.out.println("CORRETTO!");

                        punteggio++;
                    } else {
                        System.out.println("SBAGLIATO. LA RISPOSTA CORRETTA ERA: " + risposteGiusteMatematiche[indiceMatematico]);
                    }
                    System.out.println();
                    indiceMatematico++;
                } else {
                    System.out.println("INPUT NON VALIDO. RIPROVA.");
                }

                System.out.println("----------------------------------------------------");

                System.out.println("PUNTEGGIO ATTUALE: " + punteggio + " SU " + (domandeGiocateCount + indiceMatematico));
            }

            System.out.println("GAME OVER! IL TUO PUNTEGGIO FINALE E': " + punteggio + " SU " + (domandeGiocateCount + indiceMatematico));

            System.out.println("----------------------------------------------------");

            if (punteggio >= (domande.length + domandeMatematiche.length) / 2) {
                System.out.println("CONGRATULAZIONI, HAI SUPERATO IL GIOCO!");
            } else {
                System.out.println("MI DISPIACE, NON HAI SUPERATO IL GIOCO. RIPROVA!");
            }

            System.out.println("----------------------------------------------------");
            System.out.println("VUOI GIOCARE ANCORA? (SI/NO)");
            String risposta = tastiera.next().toUpperCase();
            vuoiRipetere = risposta.equals("SI");
        }
    }

    // Metodo per mescolare le risposte
    private static void shuffleArray(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            //Swap
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
