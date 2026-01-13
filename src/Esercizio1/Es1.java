package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        HashSet<String> Ripetute = new HashSet<>();

        System.out.println("Inserisci il numero di elementi da inserire ");
        int nElementi = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nElementi; i++) {
            System.out.println("Scrivi la parola da inserire");
            String parola = scanner.nextLine();
            if(set.contains(parola)) {
                Ripetute.add(parola);
            } else set.add(parola);
        }
        System.out.println("Le parole che hai inserito sono: " + set.toString());
        System.out.println("Le parole inserite sono: " + set.size());
        System.out.println("Le parole ripetute sono: " + Ripetute.toString());
    }
}
