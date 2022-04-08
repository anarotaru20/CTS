package autobuzbuilderV2;

import clase.Autobuz;
import clase.Builder;

public class AutobuzBuilder implements Builder{

    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textDerulat;

    public AutobuzBuilder() {
        this.numeSofer = "Sofer";
        this.nrLinie = 2;
        this.pauzaSofer = true;
        this.deschideUsile = true;
        this.oraIncepereProgram = 7;
        this.textDerulat = "STB";
    }

    @Override
    public Autobuz build() {
        return new Autobuz(this.numeSofer, this.nrLinie, this.pauzaSofer, this.deschideUsile,
                this.oraIncepereProgram, this.textDerulat);
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
        return this;
    }
}