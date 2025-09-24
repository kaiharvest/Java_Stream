package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateBuilderTest {

    @Test
    void testCreateStreamBuilder(){

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Indra");
        builder.add("Dwi").add("Prabowo");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimplefy() {
        Stream<Object> build = Stream.builder()
                .add("Indra").add("Dwi").add("Prabowo").build();

        build.forEach(System.out::println);
    }

}
