package TASKs_DONE.task_10;

import els3.logging_research.first.Someclass;

import java.util.logging.Logger;

/**
 * Created by Admin on 22.02.2017.
 */
public class Freestyler extends Sportsman {
    private static Logger log = Logger.getLogger(Someclass.class.getName());

    private int amountOfShows;

    public Freestyler (int a) {
        this.amountOfShows = a;
    }

    //getter and setter starts here

    public int getAmountOfShows() {
        return amountOfShows;
    }

    public void setAmountOfShows(int amountOfShows) {
        this.amountOfShows = amountOfShows;
    }

    //getter and setter ends here

    @Override
    public void start () {
        log.info("_Freestyle_");
    }

}
