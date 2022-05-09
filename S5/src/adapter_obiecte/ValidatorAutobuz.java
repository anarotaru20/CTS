package adapter_obiecte;

public class ValidatorAutobuz implements Validator {

    @Override
    public void validare_abonament() {
        System.out.println("Am verificat abonamentul");
    }

    @Override
    public void validare_bilet() {
        System.out.println("Am verificat biletul");
    }
}