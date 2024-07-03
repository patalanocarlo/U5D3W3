package CarloPatalano.U5D3W3.Entities;

public abstract class Ufficiale {
    protected Ufficiale responsabile;

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    public abstract String getRuolo();
    public abstract int getStipendio();

    public void verificaStipendio(int importo) {
        if (this.getStipendio() >= importo) {
            System.out.println(getRuolo() + " percepisce almeno " + importo + " euro.");
        } else if (responsabile != null) {
            responsabile.verificaStipendio(importo);
        } else {
            System.out.println("Nessun ufficiale percepisce almeno " + importo + " euro.");
        }
    }
}