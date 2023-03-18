package lab4.compulsory;

import java.util.ArrayList;
import java.util.List;

public class Students implements Comparable<Students> {
    public String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public List<Projects> lista_proiecte = new ArrayList<>();


    @Override
    public int compareTo(Students o) {
        if (this.getName().length() == o.getName().length()) return 0;
        else
        if (this.getName().length() > o.getName().length()) return 1;
        else
            return -1;
    }
}
