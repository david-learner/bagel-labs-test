package example02;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringUtilsTest {

    @Test
    public void convertToHashMap() {
        String userInput = "1, 1, 1, 2, 2, 3, 6, 6, 6, 6, 9, 9, 9";
        // {1=3, 2=2, 3=1, 6=4, 9=3}
        assertThat(StringUtils.convertToHashMap(userInput).toString(), is("{1=3, 2=2, 3=1, 6=4, 9=3}"));
    }
}
