package observer.pattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Event {

    private int type;
    private String description;
    private Date date;

    public Event() {}

    public Event(int type, String description) {
        // TODO
    }

    public int getType() {
        // TODO
    }

    public void setType(int type) {
        // TODO
    }

    public String getDescription() {
        // TODO
    }

    public void setDescription(String description) {
        // TODO
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
