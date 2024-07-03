package CarloPatalano.U5D3W3.Entities;

public class Tenente extends Ufficiale{
    @Override
    public String getRuolo() {
        return "Tenente";
    }

    @Override
    public int getStipendio() {
        return 1000;
    }
}

