import lab4.compulsory.Projects;
import lab4.compulsory.Students;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main  {
    public static void main(String[] args) {

        var students = IntStream.rangeClosed(0,3)
                .mapToObj(i -> new Students("S" + i) )
                .toArray(Students[]::new);

        var proiecte = IntStream.rangeClosed(0,3)
                .mapToObj(i -> new Projects("P" + i) )
                .toArray(Projects[]::new);

        List<Students> lista_studenti = Arrays.asList(students);
        //lista_studenti.addAll(Arrays.asList(students));

        LinkedList<Students> lista_s_inlantuita = lista_studenti.stream().collect(Collectors.toCollection(LinkedList::new));
        //for (Students s : lista_studenti){
        //lista_s_inlantuita.add(s);}

        List<Students> lista_sortata = lista_s_inlantuita.stream().sorted(Comparator.comparing(Students::getName)).collect(Collectors.toList());

        List<Projects> lista_proiecte = Arrays.asList(proiecte);
        LinkedList<Projects> lista_p_inlantuita = lista_proiecte.stream().collect(Collectors.toCollection(LinkedList::new));
        List<Projects> lista_p_sortata = lista_p_inlantuita.stream().sorted(Comparator.comparing(Projects::getName)).collect(Collectors.toList());

        System.out.println("UNSORTED STUDENTS LIST");
        for (Students s : lista_studenti) {
            System.out.println(s.name);
        }

        System.out.println("SORTED STUDENTS LIST");
        System.out.println(lista_sortata);


        System.out.println("UNSORTED PROJECTS LIST");
        for (Projects p : lista_proiecte) {
            System.out.println(p.getName());
        }

        System.out.println("SORTED PROJECTS LIST");
        System.out.println(lista_p_sortata);

}}