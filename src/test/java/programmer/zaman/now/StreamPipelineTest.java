package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreatePipeline() {

        // jarang di gunakan cara seperti ini
        List<String> names = List.of("Indra", "Dwi", "Prabowo");

        Stream<String> streamNames = names.stream();

        Stream<String> streamUpper = streamNames.map(String::toUpperCase);

        Stream<String> streamMr = streamUpper.map(upper -> "Mr. " + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateTestPipelineOke() {
        List<String> names = List.of("Indra", "Prabowo");

        names.stream()
                .map(String::toUpperCase)
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);
    }

}
