package main;

import autobuzbuilderV2.AutobuzBuilder;
import clase.Autobuz;

public class ProgramV2 {
    public static void main(String[] args) {
        AutobuzBuilder builder = new AutobuzBuilder();
        builder.setTextDerulat("La multi ani").setOraIncepereProgram(9);

        clase.Autobuz a1 = builder.build();

        builder.setTextDerulat("Romania").setOraIncepereProgram(7);
        Autobuz a2 = builder.build();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}