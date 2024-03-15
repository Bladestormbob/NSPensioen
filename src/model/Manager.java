package model;

import java.time.LocalDate;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Manager extends Medewerker{

    private static final int PENSIOEN_DIRECTIELID = 70;
    private static final int PENSIOEN_ANDERS = 65;
    private boolean directieLid;



    public Manager(String naam, LocalDate geboorteDatum, int dienstJaren, boolean directieLid) {
        super(naam, geboorteDatum, dienstJaren);
        this.directieLid = directieLid;
    }

    @Override
    public int bepaalPensioenLeeftijd() {
    if (directieLid) {
        return PENSIOEN_DIRECTIELID;
    } else {
        return PENSIOEN_ANDERS;
    }
    }
    public String isDirectielid() {
        if (directieLid){
            return "(directieLid)";}
        else return "";
    }

    @Override
    public String toString() {
        return String.format("%s",super.toString()
                .replaceFirst("\n", " manager " + isDirectielid() + "\n"));
    }
}