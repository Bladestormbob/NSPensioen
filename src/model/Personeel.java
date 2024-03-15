package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Personeel {

private ArrayList<Medewerker> medewerkers;

    public Personeel() {
        this.medewerkers = new ArrayList<>();
    }

    public void voegMedewerkerToe(Medewerker medewerker) {
       medewerkers.add(medewerker);

    }
    @Override
    public String toString() {
        Collections.sort(medewerkers);
        StringBuilder stringBuilder = new StringBuilder();
        for (Medewerker medewerker : medewerkers) {
            stringBuilder.append(medewerker).append("\n\n");
        }

        return stringBuilder.toString();

    }
    public void printMedewerkers() {
        File medewerkersBestand = new File("resources/medewerkers.txt");

        try (PrintWriter printWriter = new PrintWriter(medewerkersBestand)) {
            for (Medewerker medewerker : medewerkers) {
                if (medewerker.getLeeftijd() < medewerker.bepaalPensioenLeeftijd()) {
                    printWriter.println(medewerker + "\n");
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Het is niet gelukt het bestand aan te maken of die te openen.");
        }
    }

    public void printPensionados() {
        for (Medewerker medewerker : medewerkers) {
            if (medewerker.getLeeftijd() >= medewerker.bepaalPensioenLeeftijd()) {
                System.out.println(medewerker + "\n");
            }
        }
    }



}