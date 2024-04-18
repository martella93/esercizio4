public class DipendentePartTime extends Dipendente {
    private int oreLavoratePerSettimana;

    public DipendentePartTime(String matricola,int oreLavoratePerSettimana, Dipartimento dipartimento) {
        super(matricola, 0 , dipartimento);
        this.oreLavoratePerSettimana=oreLavoratePerSettimana;
    }

    @Override
    public void calculateSalary() {
        double salarioOra = 10;
        double stipendio= salarioOra * oreLavoratePerSettimana;
        setStipendio(stipendio);
    }
    public void setOreLavoratePerSettimana(int oreLavoratePerSettimana) {
        this.oreLavoratePerSettimana = oreLavoratePerSettimana;
    }

    @Override
    public void stampaDipendenti() {
        super.stampaDipendenti();
        System.out.println("Ore lavorative: " + oreLavoratePerSettimana);
        }
}
