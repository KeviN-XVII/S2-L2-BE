package Esercizio3;

import java.util.HashMap;

public class Rubrica {
    private HashMap<String,Integer> numeriTelefonici;
    public Rubrica() {
        numeriTelefonici = new HashMap<>();
    }
//   inserimento coppia
    public void inserimentoCoppia(String nome,int numero){
        numeriTelefonici.put(nome,numero);
    }
//    cancellazione coppia
    public void cancellazioneCoppia(String nome){
        numeriTelefonici.remove(nome);
    }
//    ricerca persona tramite numero di telefono
    public void ricercaNumero(int numero){
        

    }
//    ricerca numero di telefono tramite persona
//    stampa tutti contatti
}
