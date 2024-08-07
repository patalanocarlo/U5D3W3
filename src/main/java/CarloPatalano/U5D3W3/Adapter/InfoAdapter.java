package CarloPatalano.U5D3W3.Adapter;

import CarloPatalano.U5D3W3.Entities.Info;

import javax.sql.DataSource;
import java.util.Calendar;

public abstract class InfoAdapter implements DataSource {
    protected Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }


    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    public int getEta() {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        cal.setTime(info.getDataDiNascita());
        int birthYear = cal.get(Calendar.YEAR);
        return currentYear - birthYear;
    }
}


