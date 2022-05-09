package main;

import observer.Autobuz;
import observer.Calator;
import observer.Icalator;
import observer.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz = new Autobuz(168);
        Icalator calator1 = new Calator("Popescu");
        Icalator calator2 = new Calator("Georgescu");
        Icalator calator3 = new Calator("Ionescu");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);

        autobuz.anuntaCalatori();

        autobuz.stergeCalator(calator2);
        autobuz.adaugaCalator(calator3);

        autobuz.anuntaCalatori();
    }
}
