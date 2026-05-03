package model;

public class Utility {
    static boolean sovrapposti(String inizio1, String fine1, String inizio2, String fine2) {
        int i1 = convertiInMinuti(inizio1);
        int f1 = convertiInMinuti(fine1);
        int i2 = convertiInMinuti(inizio2);
        int f2 = convertiInMinuti(fine2);

        return i1 < f2 && f1 > i2;
    }

    static int convertiInMinuti(String orario) {
        String[] parti = orario.split(":");
        int ore = Integer.parseInt(parti[0]);
        int minuti = Integer.parseInt(parti[1]);

        return ore * 60 + minuti;
    }
}
