package model;

import java.time.LocalDate;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Conducteur extends Medewerker {

    private static final int PENSIOEN_ONDER = 68;
    private static final int PENSIOEN_OVER = 67;

    public Conducteur(String naam, LocalDate geboorteDatum, int dienstJaren) {
        super(naam, geboorteDatum, dienstJaren);

    }

    @Override
    public int bepaalPensioenLeeftijd() {
        if (super.getDienstJaren() < 25) {
            return PENSIOEN_ONDER;
        } else if (super.getDienstJaren() >= 25) {
            return PENSIOEN_OVER;
        }
        return 0;
    }
    @Override
    public String toString() {
        return String.format("%s",super.toString().replaceFirst("\n", " conducteur\n"));
    }
}