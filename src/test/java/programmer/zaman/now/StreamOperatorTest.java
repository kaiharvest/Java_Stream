package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperatorTest {

    @Test
    void testStreamOperator() {

        List<String> names = List.of("Indra", "Dwi", "Prabowo");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(String::toUpperCase);

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);

    }

}
