package model;

import java.time.LocalDate;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Machinist extends Medewerker{
    private static final int PENSIOENLEEFTIJD_GEEN_STOOMTREIN = 67;
    private static final int BASIS_PENSIOENLEEFTIJD = 65;
    private boolean stoomTrein;
    private int aantalStoomJaren;


    public Machinist(String naam, LocalDate geboorteDatum, int dienstJaren, boolean stoomTrein) {
        super(naam, geboorteDatum, dienstJaren);
        this.stoomTrein = stoomTrein;
        this.aantalStoomJaren = 0;
    }
    public Machinist(String naam, LocalDate geboorteDatum, int dienstJaren, boolean stoomTrein, int aantalStoomJaren) {
        super(naam, geboorteDatum, dienstJaren);
        this.stoomTrein = stoomTrein;
        this.aantalStoomJaren = aantalStoomJaren;
    }


    @Override
    public int bepaalPensioenLeeftijd() {
        if (stoomTrein) {
            return BASIS_PENSIOENLEEFTIJD - (aantalStoomJaren / 5);
        } else {
            return PENSIOENLEEFTIJD_GEEN_STOOMTREIN;
        }

    }


    @Override
    public String toString() {
        return String.format("%s",super.toString().replaceFirst("\n", " machinist\n")
                .replaceFirst("dienstjaren.", " dienstjaren waarvan " + aantalStoomJaren + " jaar op een stoomtrein."));
    }

}