package lab3.compulsory;

public class Persons implements Comparable<Persons>,Node{
    private
    String name;
    private
    int age;

    public Persons() {
        this.name = null;
        this.age = 0;
    }

    public Persons (String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Persons o) {
        if (this.getName().length() == o.getName().length()) return 0;
        else
        if (this.getName().length() > o.getName().length()) return 1;
        else
            return -1;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
