package model;

public class Studente extends Utente{
    public int matricola;

    public Studente(String login, String password, String nome, String cognome, String email, int matricola) {
        super(login, password, nome, cognome, email);
        this.matricola = matricola;
    }
}
