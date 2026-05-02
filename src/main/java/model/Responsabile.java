package model;

import java.util.ArrayList;

public class Responsabile extends Docente{
    public Responsabile(String login, String password, String nome, String cognome, String email) {
        super(login, password, nome, cognome, email);
    }

    public Insegnamento creaInsegnamento(String nome, int anno, int CFU) {
        return new Insegnamento(nome, anno, CFU);
    }

    public void associaInsegnamento(Docente docente, Insegnamento insegnamento) {
        docente.aggiungiInsegnamento(insegnamento);
    }

    public Aula creaAula(String nome) {
        return new Aula(nome);
    }

    public Lezione creaLezione(String giornoSettimana, String oraInizio, String oraFine, Aula aula, Insegnamento insegnamento) {
        return new Lezione(giornoSettimana, oraInizio, oraFine, aula, insegnamento);
    }

    public OrarioLezioni creaOrarioLezioni(ArrayList<Lezione> lezioni, String annoAccademico, int anno) {
        return new OrarioLezioni(lezioni, annoAccademico, anno);
    }
}
