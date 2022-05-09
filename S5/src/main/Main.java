package main;

import adapter_clase.AdapterMetrou;
import adapter_obiecte.Validator;
import adapter_obiecte.ValidatorAutobuz;
import adapter_obiecte.ValidatorSubteranAdapter;
import metrou.ValidatorMetrou;

public class Main {

    public static void valideazaBilet(Validator validator) {
        validator.validare_bilet();
    }

    public static void valideazaAbonament(Validator validator) {
        validator.validare_abonament();
    }

    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
        valideazaAbonament(validatorAutobuz);

        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        ValidatorSubteranAdapter adapter = new ValidatorSubteranAdapter(validatorMetrou);
        valideazaBilet(adapter);
        valideazaAbonament(adapter);

        AdapterMetrou adapterMetrou = new AdapterMetrou();
        valideazaAbonament(adapterMetrou);
        valideazaBilet(adapterMetrou);
    }
}
