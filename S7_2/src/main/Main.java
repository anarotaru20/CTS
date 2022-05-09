package main;

import strategy.SMS;
import strategy.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(3);
        validator.valideazaCalatorie();

        validator.setModPlata(new SMS());
        validator.valideazaCalatorie();
    }
}
