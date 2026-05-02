package model;

import java.util.ArrayList;

public class OrarioLezioni {
    public ArrayList<Lezione> lezioni;
    public String annoAccademico;
    public int anno;

    public OrarioLezioni(ArrayList<Lezione> lezioni, String annoAccademico, int anno) {
        this.lezioni = lezioni;
        this.annoAccademico = annoAccademico;
        this.anno = anno;
    }
}
