package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TransformationOperationTest {

    @Test
    void testTransformationOperation() {
        List.of("Indra", "Dwi", "Prabowo").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(System.out::println);
    }

}
