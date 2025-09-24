package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class createStreamTest {

    @Test
    void testCreateEmptyOnSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        Stream<String> oneStream = Stream.of("Indra");
        oneStream.forEach(System.out::println);

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStream = Stream.of("Indra", "Dwi", "Prabowo");
        arrayStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Indra", "Dwi", "Prabowo"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);

    }

}
