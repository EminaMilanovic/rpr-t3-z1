package ba.unsa.etf.rpr.tutorijal03;
/*MedunarodniBroj ima konstruktor MedunarodniBroj(String drzava, String broj) pri čemu string drzava sadrži kompletan
pozivni broj za državu npr. "+387".
 */
public class MedunarodniBroj  extends  TelefonskiBroj{
    String br;
    String drz;
    MedunarodniBroj(String drzava, String broj){
        br=broj;
        drz=drzava;
    }
    @Override public int hashCode(){
        return drz.hashCode();
    }

    @Override public  String ispisi(){
        // String s= mreza.toString(); //ZASTO NECE
        return drz+" "+br;
    }

}
