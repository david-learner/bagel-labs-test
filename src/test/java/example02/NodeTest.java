package example02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeTest {

    @Test
    public void create() {
        Integer key = 1;
        Integer value = 10;
        Node node = new Node(key, value);
    }

    @Test
    public void compareTo() {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node(3, 2));
        nodes.add(new Node(8, 3));
        nodes.add(new Node(2, 2));
        nodes.add(new Node(1, 1));
        nodes.add(new Node(4, 1));
        nodes.add(new Node(56, 1));

        Collections.sort(nodes);

        for (Node node : nodes) {
            System.out.println("key : " + node.getKey() + " value : " + node.getValue());
        }
    }
}
