public class Dirigente extends Dipendente{
    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
        double salarioBase=getStipendio();
        double aumento= 150;
        double stipendioTotale = salarioBase+aumento;
        setStipendio(stipendioTotale);
    }

}
