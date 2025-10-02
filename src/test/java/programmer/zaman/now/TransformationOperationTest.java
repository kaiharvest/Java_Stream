package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testTransformationOperation() {
        List.of("Indra", "Dwi", "Prabowo").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(System.out::println);
    }

    @Test
    void testFlatMapOperation() {
        List.of("Indra", "Dwi", "Prabowo").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(System.out::println);
    }

}
