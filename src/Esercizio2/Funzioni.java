package Esercizio2;
import java.util.*;
public class Funzioni {
//    FUNZIONE 1 LISTA ORDINATA
    public static List<Integer> generaLista(int n){
        List<Integer> listaNumeri = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            listaNumeri.add(random.nextInt(100)+1);
        }
        Collections.sort(listaNumeri);
        return listaNumeri;
    };

//    FUNZIONE 2 LISTA COMPLETA
    public static List<Integer>  generaLista2(List<Integer> listaNumeri){
        List<Integer> listaNumeri2 = new ArrayList<>(listaNumeri);
        Collections.reverse(listaNumeri2);
        listaNumeri2.addAll(listaNumeri);


        return listaNumeri2;
    }
//    FUNZIONE 3 PARI DISPARI
    public static void pariDispari(List<Integer>lista,boolean pari){
        for(int i=0;i<lista.size();i++){
            if(pari && i%2==0){
                System.out.println(lista.get(i));
            }else  if(!pari && i%2==1){
                System.out.println(lista.get(i));
            }
        }
    }
}
