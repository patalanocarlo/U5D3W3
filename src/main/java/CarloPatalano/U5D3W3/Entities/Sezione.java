package CarloPatalano.U5D3W3.Entities;

import CarloPatalano.U5D3W3.Interface.BaseInterface;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements BaseInterface {
    private List<BaseInterface> elements = new ArrayList<>();
    @Override
    public void print() {
        for (BaseInterface baseInterface : elements) {
            baseInterface.print();
        }
    }

    @Override
    public int getNumberOfPages() {
        int total = 0;
        for (BaseInterface baseInterface: elements) {
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
}
