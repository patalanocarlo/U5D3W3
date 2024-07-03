package CarloPatalano.U5D3W3.Runner;

import CarloPatalano.U5D3W3.Adapter.InfoAdapter;
import CarloPatalano.U5D3W3.Adapter.InfoDataSource;
import CarloPatalano.U5D3W3.Entities.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Runner {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Carlo");
        info.setCognome("Patalano");
        info.setDataDiNascita(new GregorianCalendar(2003, Calendar.APRIL, 4).getTime());


        InfoDataSource dataSource = new InfoDataSource(info);

        UserData userData = new UserData();
        userData.getData(dataSource);

        System.out.println("Nome del Utente: " + userData.getNomeCompleto());
        System.out.println("Età del utente: " + userData.getEta());



        Pagine pagina1 = new Pagine(1);
        Pagine pagina2 = new Pagine(2);
        Pagine pagina3 = new Pagine(3);
        Pagine pagina4 = new Pagine(4);

       Sezione sezione1 = new Sezione();
        sezione1.addComponent(pagina1);
        sezione1.addComponent(pagina2);
        Sezione sezione2 = new Sezione();
        sezione1.addComponent(pagina3);
        sezione1.addComponent(pagina4);

        Libro libro = new Libro();
        libro.addComponent(sezione1);
        libro.addComponent(sezione2);
        libro.addAutore("Carlo Patalano");
        libro.addAutore("Autore Ignoto");
        libro.setPrezzo(19.99);

        System.out.println("Stampa del libro:");
        libro.print();

        int totalPagine = libro.getNumberOfPages();
        System.out.println("Numero totale di pagine del libro: " + totalPagine);
        System.out.println("Nomi autori" + libro.getAutori());

    }
}