import lab3.compulsory.Company;
import lab3.compulsory.Node;

import java.util.ArrayList;
import java.util.Collections;

public class Main  {
    public static void main(String[] args) {
        Company c1 = new Company("Continental");
        Company c2 = new Company("Falcon");
        Company c3 = new Company("Centric");
        ArrayList<Company> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

    for(Node c: lista){
        System.out.println(c.getName());
    }

        Collections.sort(lista);
            for(Node c: lista){
                System.out.println(c.getName());
            }

    }
}