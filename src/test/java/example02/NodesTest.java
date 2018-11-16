package example02;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class NodesTest {

    @Test
    public void create() {
        Nodes nodes = new Nodes(new ArrayList<>());
        assertNotNull(nodes);
    }

    @Test
    public void print() {
        String userInput = "3, 8, 8, 3, 2, 8, 1, 2, 4, 56";
        Nodes nodes = NodeConverter.convertToNodes(StringUtils.convertToHashMap(userInput));
        assertThat(nodes.print().length() > 0, is(true));
    }

    @Test
    public void sort() {
        String userInput = "3, 8, 8, 3, 2, 8, 1, 2, 4, 56";
        Nodes nodes = NodeConverter.convertToNodes(StringUtils.convertToHashMap(userInput));
        nodes.sort();
        String result = "56, 4, 1, 3, 3, 2, 2, 8, 8, 8";
        assertThat(nodes.print(), is(result));
    }
}
