package example02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeConverter {
    public static List<Node> convertToNodes(HashMap<Integer, Integer> numberFrequencyChart) {
        List<Node> nodes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numberFrequencyChart.entrySet()){
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        return nodes;
    }
}
