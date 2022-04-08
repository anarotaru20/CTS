package clase;

public class Tramvai implements MijlocTransport {

    private String vatam;

    public Tramvai(String vatam) {
        this.vatam = vatam;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        return "Tramvai{" +
                "vatam='" + vatam + '\'' +
                '}';
    }
}
