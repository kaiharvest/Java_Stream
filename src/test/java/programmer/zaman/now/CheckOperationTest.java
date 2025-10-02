package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {

    @Test
    void testAnyMatch() {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10,21).stream()
                .anyMatch(number -> number > 20);
        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10,21).stream()
                .allMatch(number -> number > 0);
        System.out.println(match);
    }

    @Test
    void testNonMatch() {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10,21).stream()
                .noneMatch(number -> number > 20);
        System.out.println(match);
    }

}
