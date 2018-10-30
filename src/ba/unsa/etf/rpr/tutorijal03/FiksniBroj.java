package ba.unsa.etf.rpr.tutorijal03;
/*FiksniBroj sadrži konstruktor FiksniBroj(Grad grad, String broj). Parametar broj je dio telefonskog broja bez pozivnog broja npr. "123-456", a grad je promjenljiva pobrojanog tipa koji označava pozivni broj koji treba koristiti npr.:
	enum Grad { SARAJEVO, TUZLA, ZENICA…}
Spisak pozivnih brojeva se može naći ovdje. Umjesto imena kantona koristite ime glavnog grada kantona (kao u primjeru iznad), a umjesto Brčko distrikta stavite BRCKO. Metoda ispisi() treba vratiti broj oblika "033/123-456".
*/
public class FiksniBroj extends TelefonskiBroj{
    private String br;
    private Grad gr;
    FiksniBroj(Grad grad, String broj){
    gr=grad;
    br=broj;
    }
    @Override
    public String ispisi(){
        //SWITCH CASE or niz stringova ?
        String s="/"+br;
        return s;
    }
    @Override
    public int hashCode(){return  0;}  //je li vraca koji grad ili ?
}
