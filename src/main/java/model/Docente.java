package model;

import java.util.ArrayList;

public class Docente extends Utente{
    public ArrayList<Insegnamento> listaInsegnamenti = new ArrayList<>();

    public Docente(String login, String password, String nome, String cognome, String email) {
        super(login, password, nome, cognome, email);
    }

    public void aggiungiInsegnamento(Insegnamento insegnamento) {
        listaInsegnamenti.add(insegnamento);
    }

    public RichiestaSpostamento richiediSpostamento(Lezione lezione, String giornoSettimanaProposto, String oraInizioProposta, String oraFineProposta) {
        return new RichiestaSpostamento(lezione, giornoSettimanaProposto, oraInizioProposta, oraFineProposta);
    }
}
