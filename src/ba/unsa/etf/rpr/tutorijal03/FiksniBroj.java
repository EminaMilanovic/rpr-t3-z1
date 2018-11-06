package ba.unsa.etf.rpr.tutorijal03;
/*FiksniBroj sadrži konstruktor FiksniBroj(Grad grad, String broj). Parametar broj je dio telefonskog broja bez pozivnog broja npr. "123-456", a grad je promjenljiva pobrojanog tipa koji označava pozivni broj koji treba koristiti npr.:
	enum Grad { SARAJEVO, TUZLA, ZENICA…}
Spisak pozivnih brojeva se može naći ovdje. Umjesto imena kantona koristite ime glavnog grada kantona (kao u primjeru iznad), a umjesto Brčko distrikta stavite BRCKO. Metoda ispisi() treba vratiti broj oblika "033/123-456".
*/

import java.util.EnumMap;

public class FiksniBroj extends TelefonskiBroj{
    enum Grad {
        TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKI_BRIJEG,BRCKO
    }
    private String br;
    private Grad gr;
    private static EnumMap<Grad,String > mapa;
    static{
        mapa=new EnumMap<Grad, String>(Grad.class);
        mapa.put(Grad.TRAVNIK,"030");
        mapa.put(Grad.ORASJE,"031");
        mapa.put(Grad.ZENICA,"032");
        mapa.put(Grad.LIVNO,"034");
        mapa.put(Grad.TUZLA,"035");
        mapa.put(Grad.MOSTAR,"036");
        mapa.put(Grad.BIHAC,"037");
        mapa.put(Grad.GORAZDE,"038");
        mapa.put(Grad.SIROKI_BRIJEG,"039");
    mapa.put(Grad.SARAJEVO,"033");

    }
    FiksniBroj(Grad grad, String broj){
    gr=grad;
    br=broj;
    }


    @Override
    public String ispisi(){

        String s=mapa.get(gr)+"/"+br;
        return s;
    }
    @Override
    public int hashCode(){return  0;}  //je li vraca koji grad ili ?
}
