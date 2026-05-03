package model;

import java.util.ArrayList;

public class OrarioLezioni {
    public ArrayList<Lezione> listaLezioni;
    public int anno;

    public OrarioLezioni(ArrayList<Lezione> listaLezioni, int anno) {
        if(listaLezioni != null) {
            this.listaLezioni = listaLezioni;
        }
        else {
            this.listaLezioni = new ArrayList<>();
        }
        this.anno = anno;
    }

    public void aggiungiLezione(Lezione lezione) {
        listaLezioni.add(lezione);
    }
}
