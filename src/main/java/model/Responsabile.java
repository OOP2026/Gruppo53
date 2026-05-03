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
        return new OrarioLezioni(lezioni, anno);
    }

    public void aggiungiLezione(OrarioLezioni orarioLezioni, Lezione lezione) {
        orarioLezioni.aggiungiLezione(lezione);
    }

    public void approvaRichiestaSpostamento(RichiestaSpostamento richiestaSpostamento, OrarioLezioni orarioLezioni) {
        for(Lezione l : orarioLezioni.listaLezioni)
        {
            if(l == richiestaSpostamento.lezione) {
                continue;
            }

            if(l.giornoSettimana.equals(richiestaSpostamento.giornoSettimanaProposto)) {
                if(Utility.sovrapposti(richiestaSpostamento.oraInizioProposta, richiestaSpostamento.oraFineProposta, l.oraInizio, l.oraFine)) {
                    if(l.aula.nome.equals(richiestaSpostamento.lezione.aula.nome)) {
                        richiestaSpostamento.stato = "RIFIUTATA";
                        return;
                    }
                    if(l.insegnamento.equals(richiestaSpostamento.lezione.insegnamento)) {
                        richiestaSpostamento.stato = "RIFIUTATA";
                        return;
                    }
                }
            }
        }

        richiestaSpostamento.lezione.giornoSettimana = richiestaSpostamento.giornoSettimanaProposto;
        richiestaSpostamento.lezione.oraInizio = richiestaSpostamento.oraInizioProposta;
        richiestaSpostamento.lezione.oraFine = richiestaSpostamento.oraFineProposta;
        richiestaSpostamento.stato = "ACCETTATA";
    }

    public void rifiutaRichiestaSpostamento(RichiestaSpostamento richiestaSpostamento) {
        richiestaSpostamento.stato = "RIFIUTATA";
    }
}
