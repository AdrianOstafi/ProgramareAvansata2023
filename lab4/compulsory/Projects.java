package lab4.compulsory;

import java.util.ArrayList;
import java.util.List;

public class Projects implements Comparable<Projects>{
    private String name;

    public List<Projects> lista_studenti = new ArrayList<>();

    public Projects(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Projects o) {
        if (this.getName().length() == o.getName().length()) return 0;
        else
        if (this.getName().length() > o.getName().length()) return 1;
        else return -1;
    }
}
