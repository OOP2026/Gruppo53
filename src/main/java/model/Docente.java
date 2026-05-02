package model;

import java.util.ArrayList;

public class Docente extends Utente{
    public ArrayList<Insegnamento> listaInsegnamenti;

    public Docente(String login, String password, String nome, String cognome, String email) {
        super(login, password, nome, cognome, email);
    }

    public void aggiungiInsegnamento(Insegnamento insegnamento) {
        listaInsegnamenti.add(insegnamento);
    }
}
