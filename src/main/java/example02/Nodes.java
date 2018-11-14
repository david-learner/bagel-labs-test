package example02;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Nodes {

    private List<Node> nodes;

    public Nodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String print() {
        StringJoiner joiner = new StringJoiner(", ");
        for (Node node : nodes) {
            for (int count = 0; count < node.getValue(); count++) {
                joiner.add(node.getKey().toString());
            }
        }
        return joiner.toString();
    }

    public void sort() {
        Collections.sort(nodes);
    }
}
