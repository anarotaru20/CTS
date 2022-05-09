package main;

import state.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(100);
        autobuz.trimiteInService();
        autobuz.pleacaInCursa();
        autobuz.iesireDinService();
        autobuz.pleacaInCursa();
        autobuz.trimiteInService();
        autobuz.ajungeLaCapatDeLinie();
    }
}
