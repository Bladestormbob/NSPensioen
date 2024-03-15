package model;

import java.time.LocalDate;
import java.time.Period;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public abstract class Medewerker implements Comparable <Medewerker>{

    private String naam;
    private LocalDate geboorteDatum;
    private int dienstJaren;
    protected int leeftijd;
    protected  String functie;


    public Medewerker(String naam, LocalDate geboorteDatum, int dienstJaren) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.dienstJaren = dienstJaren;
        this.leeftijd = getLeeftijd();

    }
    public abstract int bepaalPensioenLeeftijd();


    @Override
    public String toString() {
        return String.format("%s,\nleeftijd: %d jaar met %d dienstjaren.\nPensioenleeftijd: %d jaar."
                , naam, leeftijd, dienstJaren, bepaalPensioenLeeftijd());
    }
    @Override
    public int compareTo(Medewerker andereMedewerker) {
        if (this.bepaalPensioenLeeftijd() > andereMedewerker.bepaalPensioenLeeftijd()) {
            return 1;
        } else if (this.bepaalPensioenLeeftijd() < andereMedewerker.bepaalPensioenLeeftijd()) {
            return -1;
        } else {
            return 0;
        }


    }



    public int getLeeftijd() {
        return Period.between(this.geboorteDatum, LocalDate.now()).getYears();

    }

    public int getDienstJaren() {
        return dienstJaren;
    }
}