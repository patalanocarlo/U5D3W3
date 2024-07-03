package CarloPatalano.U5D3W3.Entities;

import CarloPatalano.U5D3W3.Interface.BaseInterface;

public class Pagine implements BaseInterface {

    private int pageNumber;

    public Pagine(int pageNumber){
        this.pageNumber=pageNumber;
    }

    @Override
    public void print() {
        System.out.println("Stampa pagina: " + pageNumber);
    }

    @Override
    public int getNumberOfPages() {
        return 1;
    }
}
