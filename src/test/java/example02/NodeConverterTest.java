package example02;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class NodeConverterTest {

    @Test
    public void convertToNodes() {
        String userInput = "3, 8, 8, 3, 2, 8, 1, 2, 4, 56";
        Nodes nodes = NodeConverter.convertToNodes(StringUtils.convertToHashMap(userInput));
        assertNotNull(nodes);
    }
}
