package model;

import java.util.ArrayList;

public class TestModel {

    public static void main(String[] args) {
        Aula aula = new Aula("A7");
        Insegnamento insegnamento = new Insegnamento("POO", 1, 3);
        Lezione lezione = new Lezione("Giovedì", "8:45", "10:45", aula, insegnamento);
        OrarioLezioni orarioLezioni = new OrarioLezioni(null, 1);
        System.out.println(orarioLezioni.listaLezioni);
        System.out.println(orarioLezioni.anno);
        orarioLezioni.aggiungiLezione(lezione);
        System.out.println(orarioLezioni.listaLezioni);
        Docente docente = new Docente("Marco123", "Antonio123", "Marco", "Antonio", "marco.antonio@gmail.com");
        Responsabile responsabile = new Responsabile("Antonio456", "Romano456", "Antonio", "Romano", "antonio.romano@gmail.com");
        RichiestaSpostamento richiestaSpostamento1 = docente.richiediSpostamento(lezione, "Lunedì", "16:30", "18:30");
        System.out.println(richiestaSpostamento1.giornoSettimanaProposto);
        System.out.println(richiestaSpostamento1.oraInizioProposta);
        System.out.println(richiestaSpostamento1.oraFineProposta);
        responsabile.rifiutaRichiestaSpostamento(richiestaSpostamento1);
        System.out.println(richiestaSpostamento1);
        RichiestaSpostamento richiestaSpostamento2 = docente.richiediSpostamento(lezione, "Lunedì", "16:30", "18:30");
        System.out.println(richiestaSpostamento2.giornoSettimanaProposto);
        System.out.println(richiestaSpostamento2.oraInizioProposta);
        System.out.println(richiestaSpostamento2.oraFineProposta);
        responsabile.approvaRichiestaSpostamento(richiestaSpostamento2, orarioLezioni);
        System.out.println(orarioLezioni.listaLezioni);
        System.out.println(orarioLezioni.anno);
    }

}
