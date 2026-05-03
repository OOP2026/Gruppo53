package model;

import java.util.ArrayList;

public class OrarioLezioni {
    public ArrayList<Lezione> listaLezioni;
    public String annoAccademico;
    public int anno;

    public OrarioLezioni(ArrayList<Lezione> listaLezioni, String annoAccademico, int anno) {
        this.listaLezioni = listaLezioni;
        this.annoAccademico = annoAccademico;
        this.anno = anno;
    }

    public void aggiungiLezione(Lezione lezione) {
        listaLezioni.add(lezione);
    }
}
