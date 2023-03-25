package lab5.compulsory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {
    private String id;
    private String title;
    private String location; //file name or Web page
    private Map<String, Object> tags = new HashMap<>();

    /**
     * Getter pentru Id-ul documentului
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Setter pentru Id-ul documentului.
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter pentru titlul documentului
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter pentru titlul documentului
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter pentru locatia documentului
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter pentru locatia documentului
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Constructor ce seteaza informatiile despre document
     * @param id
     * @param title
     * @param location
     */
    public Document(String id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;
    }

    /**
     * Metoda ce adauga informatii suplimentare despre un document
     * @param key
     * @param obj
     */
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
}