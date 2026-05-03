package model;

public class RichiestaSpostamento {
    public Lezione lezione;
    public String giornoSettimanaProposto;
    public String oraInizioProposta;
    public String oraFineProposta;
    public String stato;

    public RichiestaSpostamento(Lezione lezione, String giornoSettimanaProposto, String oraInizioProposta, String oraFineProposta) {
        this.lezione = lezione;
        this.giornoSettimanaProposto = giornoSettimanaProposto;
        this.oraInizioProposta = oraInizioProposta;
        this.oraFineProposta = oraFineProposta;
        this.stato = "PENDENTE";
    }
}
