package lab5.compulsory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String name;
    private List<Document> docs = new ArrayList<>();

    /**
     * Getter pentru numele catalogului
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter numele catalogului
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor ce seteaza numele catalogului
     * @param name
     */
    public Catalog(String name) {
        this.name = name;
    }

    public void add(Document doc) {
        docs.add(doc);
    }

    public String toString(){
        StringBuilder parsing = new StringBuilder();
        parsing.append("Catalogul ");
        parsing.append(this.getName());
        parsing.append(" contine: ");
        System.out.println(parsing);
        for(var entry : docs){
            parsing.delete(0, parsing.length());
            parsing.append(entry.getTitle());
            parsing.append(" cu ID-ul ");
            parsing.append(entry.getId());
            parsing.append(" si locatia: ");
            parsing.append(entry.getLocation());
            System.out.println(parsing);
        }
        return " ";
    }
    public Document findById(String id) {
        return docs.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

}
