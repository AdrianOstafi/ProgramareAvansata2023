package lab3.homework;



import java.util.HashMap;

public class Persons implements Comparable<Persons>, Node {
    private
    String name;
    private
    int age;
    private
    String birthdate;
    private
    HashMap<Node,String> relationships = new HashMap();
    public Persons() {
        this.name = null;
        this.age = 0;
        this.birthdate = null;
    }

    public Persons(String name, int age, String birthdate) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
    }


    public void Add_Relationships(Node node, String value){
        relationships.put(node,value);
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

    @Override
    public String getBirthdate() {
        return null;
    }
}
