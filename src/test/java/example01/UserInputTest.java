package example01;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserInputTest {

    private final int[][] numbers = {
            {1, 2, 3, 4}
            , {5, 6, 7, 8}
            , {9, 10, 11, 12}
            , {13, 14, 15, 16}
    };

    private final int rotatingCount = 2;

    @Test
    public void create() {
        UserInput input = new UserInput(numbers, rotatingCount);
    }
}
