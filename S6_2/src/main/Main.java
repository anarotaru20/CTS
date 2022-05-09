package main;

import decorator.Decorator;
import decorator.DecoratorAbstract;
import decorator.Iimprimanta;
import decorator.ImprimantaDeBilete;

public class Main {
    public static void main(String[] args) {
        Iimprimanta iimprimanta = new ImprimantaDeBilete(5);
        iimprimanta.printeazaBilet();

        DecoratorAbstract decorator = new Decorator(iimprimanta, "Paste fericit!");
        decorator.printeazaBilet();
        decorator.printeazaVerso();
    }
}
