package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationtest {


    @Test
    void testIntermediate() {
        List<String> names = List.of("Indra", "Dwi", "Prabowo");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Indra", "Dwi", "Prabowo");

        names.stream()
                .map(name  -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .forEach(System.out::println);

    }

}
