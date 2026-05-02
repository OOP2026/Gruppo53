package model;

public class Utente {
    protected String login;
    protected String password;
    protected String nome;
    protected String cognome;
    protected String email;

    public Utente(String login, String password, String nome, String cognome, String email) {
        this.login = login;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public boolean login(String login, String password) {
        return ( login.equals(this.login) && password.equals(this.password));
    }
}
