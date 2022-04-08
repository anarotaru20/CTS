package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Dorel").setDeschideUsile(false);
        Autobuz autobuz = autobuzBuilder.build();

        Autobuz autobuz2 = new AutobuzBuilder().setNumeSofer("Bobita").setNrLinie(2).build();

        System.out.println(autobuz.toString());
        System.out.println(autobuz2.toString());

        AutobuzBuilder builder = new AutobuzBuilder();
        builder.setTextRulat("La multi ani").setOraIncepereProgram(9);

        Autobuz a1 = builder.build();
        Autobuz a2 = builder.build(); // a1 cu a2 au aceeasi instanta

    }
}
