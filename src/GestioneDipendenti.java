public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente[] dipendenti = istanziaDipendenti();
        Volontario[] volontari= istanziaVolontari();
        stampaDipendenti(dipendenti);
        stampaVolontari(volontari);

    }

    public static Dipendente[] istanziaDipendenti(){
        Dipendente[] arrayDipendenti = new Dipendente[3];

        arrayDipendenti[0]= new DipendenteFullTime("256578",1200,Dipartimento.AMMINISTRAZIONE);
        arrayDipendenti[1]= new DipendentePartTime("127485",15,Dipartimento.PRODUZIONE);
        arrayDipendenti[2]= new Dirigente("365987",1800,Dipartimento.VENDITE);
        return arrayDipendenti;
    }
    public static void stampaDipendenti(Dipendente[] dipendenti){
        for(int i=0; i< dipendenti.length; i++){
            Dipendente dipendente = dipendenti[i];
            dipendente.calculateSalary();
            dipendente.stampaDipendenti();
            dipendente.turno();
        }
    }
    public static Volontario[] istanziaVolontari() {
        Volontario[] arrayVolontari = new Volontario[1];
        arrayVolontari[0] = new Volontario("Luca", 30, "fullstack developer");
        return arrayVolontari;
    }
    public static void stampaVolontari(Volontario[] volontari){
        for(int i=0; i< volontari.length; i++){
            Volontario volontario = volontari[i];
            volontario.stampaVolontari();
            volontario.turno();

        }
    }


}
