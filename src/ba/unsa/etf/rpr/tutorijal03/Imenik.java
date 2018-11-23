package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

//impplementirati interfejs comperable<telefonski broj>, overajdati compareto metodu
/*omogućuje da se pretražuju brojevi koristeći klasu HashMap . Ova klasa
treba sadržavati sljedeće javne metode:



○ String naSlovo(char s) - vraća sve brojeve u telefonskom imeniku za osobe čije
ime počinje na slovo s u formatu:
1. Ime Prezime - broj
2. Ime Prezime - broj
…
○ Set<String> izGrada(Grad g) - vraća skup Stringova koji sadrži imena i
prezimena svih osoba koje žive u gradu g (istog pobrojanog tipa koji je dat u klasi
FiksniBroj), što se može saznati ako osoba ima fiksni broj telefona u tom gradu.
Pri tome skup treba biti sortiran abecedno.
○ Set<TelefonskiBroj> izGradaBrojevi(Grad g) - vraća brojeve za osobe iz grada
g . Ovaj skup treba biti sortiran po stringu koji se dobije metodom ispisi() .
● Klasa Program treba sadržavati main metodu koja korisniku omogućuje da unosom
naredbi pomoću tastature pozove sve metode klasa navedenih iznad.*/
public class Imenik {

private HashMap<String,TelefonskiBroj> mapa;
//string je za ime
    //prvo kod mape je key-po kojem mozemo pretrazivat
    Imenik(){
        mapa=new HashMap<String, TelefonskiBroj>();
    }
    void dodaj(String ime, TelefonskiBroj broj){

         mapa.put(ime,broj);
         }

     String dajBroj(String ime){
         return (mapa.get(ime)).ispisi();
         }
    String dajIme(TelefonskiBroj broj){
       for(Map.Entry<String,TelefonskiBroj> m: mapa.entrySet()){
           if(m.getValue().equals(broj)) return m.getKey();
       }
       return "";
    }

    Set<String> izGrada(FiksniBroj.Grad grad){
        FiksniBroj f=new FiksniBroj(FiksniBroj.Grad.SARAJEVO,"333333");
        SortedSet<String> set=new TreeSet<String>();
        for(Map.Entry<String,TelefonskiBroj> m: mapa.entrySet()){
            if(m.getValue().ispisi().substring(0,3).equals(f.dajBrojGrada(grad))) set.add(m.getKey());
        }

    return  set;
    }
    Set<TelefonskiBroj>  izGradaBrojevi(FiksniBroj.Grad grad){
        FiksniBroj f=new FiksniBroj(FiksniBroj.Grad.SARAJEVO,"333333");
           SortedSet<TelefonskiBroj> set=new TreeSet<TelefonskiBroj>();
        for(Map.Entry<String,TelefonskiBroj> m: mapa.entrySet()){
            if(m.getValue().ispisi().substring(0,3).equals(f.dajBrojGrada(grad))) set.add(m.getValue());
        }

           return  set;
       }
    String naSlovo(char c){
        String spisak=" ";
        int i=1;
        for(Map.Entry<String,TelefonskiBroj> m: mapa.entrySet()){
            if(m.getKey().charAt(0)==c) {
                spisak += (i + ". "+m.getKey()+" - " + m.getValue().ispisi() + "\n");
            i++;
            }
        }

        return  spisak;

    }


}
