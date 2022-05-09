package main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Dorel").setDeschideUsile(false);
        Autobuz autobuz = autobuzBuilder.build();

        Autobuz autobuz2 = new AutobuzBuilder().setNumeSofer("Bobita").setNrLinie(5).build();

        System.out.println(autobuz.toString());
        System.out.println(autobuz2.toString());

        AutobuzBuilder builder = new AutobuzBuilder();
        builder.setTextDerulat("La multi ani").setOraIncepereProgram(9);

        Autobuz a1 = builder.build();
        System.out.println(a1.toString());
    }
}
