package model;

public class Studente extends Utente{
    public int matricola;
    public int annoCorso;

    public Studente(String login, String password, String nome, String cognome, String email, int matricola, int annoCorso) {
        super(login, password, nome, cognome, email);
        this.matricola = matricola;
        this.annoCorso = annoCorso;
    }
}
