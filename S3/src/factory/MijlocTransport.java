package factory;

public abstract class MijlocTransport {

    private int nrInamtriculare;

    public MijlocTransport(int nrInamtriculare){
        this.nrInamtriculare = nrInamtriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "nrInamtriculare=" + nrInamtriculare +
                '}';
    }
}