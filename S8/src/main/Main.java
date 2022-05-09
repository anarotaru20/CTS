package main;

import proxy.Autobuz;
import proxy.MijlocTransportNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(20, "b123ABC");
        Autobuz autobuz2 = new Autobuz(0, "b123XC");

        MijlocTransportNoapte mijlocTransportNoapte1 = new MijlocTransportNoapte(autobuz1);
        MijlocTransportNoapte mijlocTransportNoapte2 = new MijlocTransportNoapte(autobuz2);

        autobuz1.opresteInStatie();
        autobuz2.opresteInStatie();
        mijlocTransportNoapte1.opresteInStatie();
        mijlocTransportNoapte2.opresteInStatie();
    }
}
