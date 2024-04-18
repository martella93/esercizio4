public abstract class Dipendente implements TurnoLavoro {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public void stampaDipendenti() {
        System.out.println("Matricola: " + this.matricola);
        System.out.println("Stipendio totale: " + this.stipendio);
        System.out.println("Dipartimento: " + this.dipartimento);

    }
    public abstract void calculateSalary();

    @Override
    public void turno() {
        System.out.println("il turno di lavoro inizia alle 14");
    }
}
