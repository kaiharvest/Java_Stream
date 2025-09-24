package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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

    @Test
    void testCreateStreamFromCollection() {

        Collection<String> collection = List.of("Indra", "Dwi", "Prabowo");
        Stream<String> streamCollection1 = collection.stream();
        streamCollection1.forEach(System.out::println);

        Stream<String> streamCollection2 = collection.stream();
        streamCollection2.forEach(System.out::println);

    }

    @Test
    void testCreateInfiniteStream() {

        Stream<String> stream = Stream.generate(() -> "Programmer Zaman Now");
        // stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // iterate.forEach(System.out::println);

    }

}
