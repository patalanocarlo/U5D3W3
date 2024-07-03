package CarloPatalano.U5D3W3.Entities;

public class Generale extends Ufficiale {
    @Override
    public String getRuolo() {
        return "Generale";
    }

    @Override
    public int getStipendio() {
        return 5000;
    }
}