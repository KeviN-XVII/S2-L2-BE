package Esercizio2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Esercizio2.Funzioni.generaLista;
import static Esercizio2.Funzioni.generaLista2;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire la quantità di numeri da generare: ");
        int num = scanner.nextInt();

        System.out.println("----PRIMA FUNZIONE----");
        List<Integer> lista1 = generaLista(num);
        System.out.println(lista1);

        System.out.println("----SECONDA FUNZIONE----");
        List<Integer> lista2 = generaLista2(lista1);
        System.out.println(lista2);

        System.out.println("----TERZA FUNZIONE----");
        System.out.println("posizioni pari");
        Funzioni.pariDispari(lista2,true);
        System.out.println("posizioni dispari");
        Funzioni.pariDispari(lista1,false);

    }
}
