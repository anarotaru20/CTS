package clase;

public class AutobuzBuilder implements Builder {

    private Autobuz autobuz;

    public AutobuzBuilder() {
        this.autobuz = new Autobuz("Sofer", 42, true, true, 7, "Statia finala");
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.autobuz.setPauzaSofer(pauzaSofer);
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.autobuz.setDeschideUsile(deschideUsile);
        return this;
    }

    public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
        this.autobuz.setOraIncepereProgram(oraIncepereProgram);
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat) {
        this.autobuz.setTextRulat(textRulat);
        return this;
    }
}
