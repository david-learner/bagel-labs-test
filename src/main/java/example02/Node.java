package example02;

public class Node implements Comparable<Node> {

    private final Integer key;
    private final Integer value;

    public Node(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public int compareTo(Node o) {
        if (this.value > o.getValue()) {
            return 1;
        } else if (this.value < o.getValue()) {
            return -1;
        } else {
            if (this.key > o.getKey()) {
                return -1;
            } else if (this.key < o.getKey()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
