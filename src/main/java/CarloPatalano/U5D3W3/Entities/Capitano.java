package CarloPatalano.U5D3W3.Entities;

public class Capitano extends Ufficiale {
    @Override
    public String getRuolo() {
        return "Capitano";
    }

    @Override
    public int getStipendio() {
        return 2000;
    }
}
