package controller;

import database.DBaccess;
import model.Conducteur;
import model.Machinist;
import model.Manager;
import model.Personeel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class PensioenLauncher {

	public static void main(String[] args) {
		System.out.println("Welkom bij de Pensioen app van de NS, geschreven door: Bart Falkena");
		// Tests voor het maken van de klassen en methoden voor het pensioen.
		// Let wel: zorg dat je de imports goed zet
//		testStap2();
		Personeel personeel = testStap5();
		testStap6(personeel);
		testStap7(personeel);
		testStap8(personeel);
	}
	private static Personeel testStap5() {
		Personeel personeel = new Personeel();
		Machinist piet = new Machinist("Piet Paaltjens", LocalDate.of(1949, 5, 3), 34, true, 7);
		Machinist fred = new Machinist("Fred Teeven", LocalDate.of(1958, 8, 5), 2, false, 0);
		Machinist rob = new Machinist("Rob de Nijs", LocalDate.of(1942, 12, 26), 27, true, 12);
		Conducteur kees = new Conducteur("Kees van Deuren", LocalDate.of(1973, 10, 21), 12);
		Conducteur jan = new Conducteur("Jan van Splinteren", LocalDate.of(1959, 2, 5), 30);
		Conducteur willem = new Conducteur("Willem Vermeend", LocalDate.of(1948, 12, 21), 10);
		Manager janWillem = new Manager("Jan-Willem van Deuren", LocalDate.of(1973, 10, 21), 12, true);
		Manager berend = new Manager("Berend Hoogervorst", LocalDate.of(1959, 4, 20), 30, false);
		Manager willemijn = new Manager("Willemijn van Driesen", LocalDate.of(1962, 9, 9),10, true);
		personeel.voegMedewerkerToe(piet);
		personeel.voegMedewerkerToe(fred);
		personeel.voegMedewerkerToe(rob);
		personeel.voegMedewerkerToe(kees);
		personeel.voegMedewerkerToe(jan);
		personeel.voegMedewerkerToe(willem);
		personeel.voegMedewerkerToe(janWillem);
		personeel.voegMedewerkerToe(berend);
		personeel.voegMedewerkerToe(willemijn);
		System.out.println("--- Test stap 5 ---");
		System.out.println("Alle medewerkers zijn aan het personeel toegevoegd!");
		System.out.println();
		return personeel;
	}
	private static void testStap6(Personeel personeel) {
		System.out.println("--- Test stap 6 ---");
		System.out.println(personeel);
		System.out.println();
	}
	private static void testStap7(Personeel personeel) {
		System.out.println("--- Test stap 7 ---");
		System.out.println();
		personeel.printPensionados();
	}
	private static void testStap8(Personeel personeel) {
		personeel.printMedewerkers();
		System.out.println("--- Test stap 8 ---");
		System.out.println("Tekstbestand gemaakt");
		System.out.println();
	}












}

//
//		testStap3();
//
//		testStap4();

//		Personeel personeel = testStap5();

//		testStap6(personeel);

//	 	testStap7(personeel);

//		testStap8(personeel);

//		testStap9();

	// Stap 2 Machinist
//	private static void testStap2() {
//		Machinist piet = new Machinist("Piet Paaltjens", LocalDate.of(1949, 5, 3), 34, true, 7);
//		Machinist fred = new Machinist("Fred Teeven", LocalDate.of(1958, 8, 5), 2, false, 0);
//		Machinist rob = new Machinist("Rob de Nijs", LocalDate.of(1942, 12, 26), 27, true, 12);
//		System.out.println("--- Test stap 2 ---");
//		System.out.println();
//		System.out.println(piet);
//		System.out.println();
//		System.out.println(fred);
//		System.out.println();
//		System.out.println(rob);
//		System.out.println();
//	}

//	 Stap 3 Conducteur
//	private static void testStap3() {
//		Conducteur kees = new Conducteur("Kees van Deuren", LocalDate.of(1973, 10, 21), 12);
//		Conducteur jan = new Conducteur("Jan van Splinteren", LocalDate.of(1959, 2, 5), 30);
//		Conducteur willem = new Conducteur("Willem Vermeend", LocalDate.of(1948, 12, 21), 10);
//		System.out.println("--- Test stap 3 ---");
//		System.out.println();
//		System.out.println(kees);
//		System.out.println();
//		System.out.println(jan);
//		System.out.println();
//		System.out.println(willem);
//		System.out.println();
//	}

	// Stap 4 Manager
//	private static void testStap4() {
//		Manager janWillem = new Manager("Jan-Willem van Deuren", LocalDate.of(1973, 10, 21), 12, true);
//		Manager berend = new Manager("Berend Hoogervorst", LocalDate.of(1959, 4, 20), 30, false);
//		Manager willemijn = new Manager("Willemijn van Driesen", LocalDate.of(1962, 9, 9),10, true);
//		System.out.println("--- Test stap 4 ---");
//		System.out.println();
//		System.out.println(janWillem);
//		System.out.println();
//		System.out.println(berend);
//		System.out.println();
//		System.out.println(willemijn);
//		System.out.println();
//	}

	// Stap 5 Personeel
//	private static Personeel testStap5() {
//		Personeel personeel = new Personeel();
//		Machinist piet = new Machinist("Piet Paaltjens", LocalDate.of(1949, 5, 3), 34, true, 7);
//		Machinist fred = new Machinist("Fred Teeven", LocalDate.of(1958, 8, 5), 2, false, 0);
//		Machinist rob = new Machinist("Rob de Nijs", LocalDate.of(1942, 12, 26), 27, true, 12);
//		Conducteur kees = new Conducteur("Kees van Deuren", LocalDate.of(1973, 10, 21), 12);
//		Conducteur jan = new Conducteur("Jan van Splinteren", LocalDate.of(1959, 2, 5), 30);
//		Conducteur willem = new Conducteur("Willem Vermeend", LocalDate.of(1948, 12, 21), 10);
//		Manager janWillem = new Manager("Jan-Willem van Deuren", LocalDate.of(1973, 10, 21), 12, true);
//		Manager berend = new Manager("Berend Hoogervorst", LocalDate.of(1959, 4, 20), 30, false);
//		Manager willemijn = new Manager("Willemijn van Driesen", LocalDate.of(1962, 9, 9),10, true);
//		personeel.voegMedewerkerToe(piet);
//		personeel.voegMedewerkerToe(fred);
//		personeel.voegMedewerkerToe(rob);
//		personeel.voegMedewerkerToe(kees);
//		personeel.voegMedewerkerToe(jan);
//		personeel.voegMedewerkerToe(willem);
//		personeel.voegMedewerkerToe(janWillem);
//		personeel.voegMedewerkerToe(berend);
//		personeel.voegMedewerkerToe(willemijn);
//		System.out.println("--- Test stap 5 ---");
//		System.out.println("Alle medewerkers zijn aan het personeel toegevoegd!");
//		System.out.println();
//		return personeel;
//	}


//	 Stap 6 Personeel gesorteerd op pensioenleeftijd
//	private static void testStap6(Personeel personeel) {
//		System.out.println("--- Test stap 6 ---");
//		System.out.println(personeel);
//		System.out.println();
//	}


	// Stap 7 Personeel dat met pensioen is.
//	private static void testStap7(Personeel personeel) {
//		System.out.println("--- Test stap 7 ---");
//		System.out.println();
//		personeel.printPensionados();
//	}

	// Stap 8 Personeel in dienst.
//	private static void testStap8(Personeel personeel) {
//		personeel.printMedewerkers();
//		System.out.println("--- Test stap 8 ---");
//		System.out.println("Tekstbestand gemaakt");
//		System.out.println();
//	}

	// Stap 9: Maak een connectie met de database Pensioen en haal Machinisten op.
//	private static void testStap9() {
//		DBaccess db = new DBaccess();
//		db.openConnection();
//		// Plaats hier code om de tabel te lezen
//		System.out.println("--- Test stap 9 ---");
//		System.out.println();
//		// Plaats hier code om de resultaten af te drukken
//
//		db.closeConnection();
//	}


