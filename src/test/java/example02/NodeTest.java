package example02;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class NodeTest {

    @Test
    public void create() {
        Integer key = 1;
        Integer value = 10;
        Node node = new Node(key, value);
        assertNotNull(node);
    }

    @Test
    public void compareTo() {
        List<Node> nodes = Arrays.asList(
                new Node(3, 2), new Node(8, 3)
                , new Node(2, 2), new Node(1, 1)
                , new Node(4, 1), new Node(56, 1));

        Collections.sort(nodes);

        StringJoiner joiner = new StringJoiner(", ");
        for (Node node : nodes) {
            joiner.add(node.getKey().toString());
        }

        String joinedResult = joiner.toString();
        String result = "56, 4, 1, 3, 2, 8";

        assertThat(result.equals(joinedResult), is(true));
    }
}
