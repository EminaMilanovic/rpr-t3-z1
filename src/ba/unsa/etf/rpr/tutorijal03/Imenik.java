package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

//impplementirati interfejs comperable<telefonski broj>, overajdati compareto metodu
/*omogućuje da se pretražuju brojevi koristeći klasu HashMap . Ova klasa
treba sadržavati sljedeće javne metode:
○ void dodaj(String ime, TelefonskiBroj broj)
○ String dajBroj(String ime) - vraća telefonski broj osobe pod imenom ime u
formi stringa pozivajući metodu ispisi() klase TelefonskiBroj,
○ String dajIme(TelefonskiBroj broj) - vraća ime osobe čiji telefonski broj je broj
- i ova operacija treba koristiti HashMapu,
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
public class Imenik implements Comparable<TelefonskiBroj>{
private HashMap<String,TelefonskiBroj> mapa;

    void dodaj(String ime, TelefonskiBroj broj){

         mapa.put(ime,broj);
         }

    @Override
    public int compareTo(TelefonskiBroj o) {
        return 0;
    }

}
