package clase;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAn_studii(int an_studii) {
        this.anStudii = an_studii;
    }


    public Student() {
        super();

    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + "Facultate=" + facultate + ", An_studii=" + anStudii;
    }

}
