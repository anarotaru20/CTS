package adapter_clase;

import adapter_obiecte.Validator;
import metrou.ValidatorMetrou;

public class AdapterMetrou extends ValidatorMetrou implements Validator {

    @Override
    public void validare_abonament() {
        super.validareAbonament();
    }

    @Override
    public void validare_bilet() {
        super.validareCalatorie();
    }
}
