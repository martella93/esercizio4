public class Volontario implements TurnoLavoro{
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }
    public void volontari(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Età: " + this.eta);
        System.out.println("CV: " + this.CV);

    }
    public void stampaVolontari() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Età: " + this.eta);
        System.out.println("CV: " + this.CV);

    }

    @Override
    public void turno() {
        System.out.println("il turno di lavoro inizia alle 18");
    }
}
