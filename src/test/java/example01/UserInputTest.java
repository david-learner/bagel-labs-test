package example01;

import org.junit.Test;

public class UserInputTest {

    @Test
    public void create() {
        int[][] numbers = {
                {1, 2, 3, 4}
                , {5, 6, 7, 8}
                , {9, 10, 11, 12}
                , {13, 14, 15, 16}
        };

        int rotatingCount = 2;

        UserInput input = new UserInput(numbers, rotatingCount);
    }
}
