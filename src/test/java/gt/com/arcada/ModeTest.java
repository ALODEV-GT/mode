package gt.com.arcada;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ModeTest {
    @Test
    void testUnimodal() {
        Mode mode = new Mode();
        Integer[] input = {0};
        var result = mode.getResult(input);

        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.contains(0));
    }

    @Test
    void testUnimodalMultipleElements() {
        Mode mode = new Mode();
        Integer[] input = {1,2,2,4,5};
        var result = mode.getResult(input);

        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.contains(2));
    }

    @Test
    void testUnimodalAllSame() {
        Mode mode = new Mode();
        Integer[] input = {1,1,1,1,1,1};
        var result = mode.getResult(input);

        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.contains(1));
    }

    @Test
    void testBimodal() {
        Mode mode = new Mode();
        Integer[] input = {2,2,3,3,3,4,4,5,5,5};
        var result = mode.getResult(input);

        Assertions.assertEquals(2, result.size());
        Assertions.assertTrue(result.containsAll(Arrays.asList(3,5)));
    }

    @Test
    void testNoMode() {
        Mode mode = new Mode();
        Integer[] input = {1,1,2,2,3,3,4,4};
        var result = mode.getResult(input);

        Assertions.assertEquals(0, result.size());
    }
}
