package federicoPoggi.enteties;

import federicoPoggi.PERIODICITA;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class NewsPaper extends Articolo{
    private PERIODICITA periodicita;
    public NewsPaper(String title, int yearPublication, int pageNumber, PERIODICITA periodicita){
        super(title,yearPublication,pageNumber);
        this.periodicita=periodicita;
    }

    /*GETTERS AND SETTERS*/

    public PERIODICITA getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(PERIODICITA periodicita) {
        this.periodicita = periodicita;
    }
}
