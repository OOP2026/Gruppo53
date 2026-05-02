package model;

public class Lezione {
    public String giornoSettimana;
    public String oraInizio;
    public String oraFine;
    public Aula aula;
    public Insegnamento insegnamento;

    public Lezione(String giornoSettimana, String oraInizio, String oraFine, Aula aula, Insegnamento insegnamento) {
        this.giornoSettimana = giornoSettimana;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.aula = aula;
        this.insegnamento = insegnamento;
    }
}
