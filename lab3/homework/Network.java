package lab3.homework;

import java.util.ArrayList;
import java.util.List;

public class Network  {
    private List<Node> Lista_Noduri = new ArrayList<>();
    public void addNode(Node node) {
        Lista_Noduri.add(node);
    }

    @Override
    public String toString() {
        return "Lista_Noduri=" + Lista_Noduri +
                '}';
    }
}
