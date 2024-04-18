public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
        double salarioBase= getStipendio();
        double aumento= 100;
        double stipendioTotale= salarioBase+aumento;
        setStipendio(stipendioTotale);
    }

}
