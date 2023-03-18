package lab3.homework;

import lab3.homework.Company;
import lab3.homework.Network;
import lab3.homework.Node;
import lab3.homework.Persons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        Company c1 = new Company("Continental");
        Company c2 = new Company("Falcon");
        Company c3 = new Company("Centric");
        Persons p1 = new Persons("Ioan",23,"15.2.2000");
        Persons p2 = new Persons("Adrian",20,"13.12.2002");
        Persons p3 = new Persons("Robert",20,"11.4.2002");
        Network n1 = new Network();
        n1.addNode(p1);
        n1.addNode(p2);
        n1.addNode((Node) c1);
        System.out.println(n1);

        List<Node> lista = new ArrayList<>();
        lista.add((Node) c1);
        lista.add((Node) c2);
        lista.add((Node) c3);

    for(Node c: lista){
        System.out.println(c.getName());
    }

        /*Collections.sort(lista);
            for(Node c: lista){
                System.out.println(c.getName());
            }*/



    }
}