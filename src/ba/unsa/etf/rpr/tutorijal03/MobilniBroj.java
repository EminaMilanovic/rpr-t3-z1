package ba.unsa.etf.rpr.tutorijal03;
/*MobilniBroj ima konstruktor MobilniBroj(int mobilnaMreza, String broj) pri čemu oznaka mobilne mreže predstavlja drugu i
treću cifru pozivnog broja tj. 60-67 (detaljnije informacije možete naći na istoj stranici).
Metoda ispisi vraća broj istog oblika "061/987-654".
*/
public class MobilniBroj extends  TelefonskiBroj{
    private String br;
    private int mreza;


    MobilniBroj(int mobilnaMreza, String broj){
        mreza=mobilnaMreza;
        br=broj;
    }
       @Override public  String ispisi(){
          // String s= mreza.toString(); //ZASTO NECE
           return "0"+mreza+"/"+br;
        }
       @Override public int hashCode(){
        return mreza;
       }

    }

