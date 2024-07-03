package CarloPatalano.U5D3W3.Entities;

import CarloPatalano.U5D3W3.Interface.BaseInterface;

import java.util.ArrayList;
import java.util.List;

public class Libro implements BaseInterface {
    private List<BaseInterface> elements = new ArrayList<>();
    private List<String> autori = new ArrayList<>();
    private double prezzo;

    @Override
    public void print() {
        for (BaseInterface baseInterface : elements) {
            baseInterface.print();
        }
    }


    @Override
    public int getNumberOfPages() {
        int total = 0;
        for (BaseInterface baseInterface : elements) {
            total += baseInterface.getNumberOfPages();
        }
        return total;
    }

    public void addComponent(BaseInterface baseInterface) {
        elements.add(baseInterface);
    }

    public void removeComponent(BaseInterface baseInterface) {
        elements.remove(baseInterface);
    }

    public void addAutore(String autore) {
        autori.add(autore);
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<String> getAutori() {
        return autori;
    }
}
