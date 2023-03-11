package lab3.compulsory;

public class Company implements Comparable<Company>,Node{
    private
    String name;

    public Company() {
        this.name = null;
    }

    public Company (String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Company o) {
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
