package adapter_obiecte;

import metrou.ValidatorMetrou;

public class ValidatorSubteranAdapter implements Validator {
    private ValidatorMetrou validatorMetrou;


    @Override
    public void validare_abonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void validare_bilet() {
        validatorMetrou.validareCalatorie();
    }

    public ValidatorSubteranAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }
}
