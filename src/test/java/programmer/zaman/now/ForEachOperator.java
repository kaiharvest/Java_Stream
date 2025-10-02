package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperator {

    @Test
    void testPeekBefore() {
        List.of("Indra", "Dwi", "Prabowo").stream()
                .map(name -> {
                    System.out.println("Before Change name to Upper " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change name to Upper " + upper);
                    return upper;
                })
                .forEach(System.out::println);
    }

    @Test
    void testPeekAfter() {
        List.of("Indra", "Dwi", "Prabowo").stream()
                .peek(name -> System.out.println("Before Change name to Upper " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change name to Upper " + upper))
                .forEach(System.out::println);

    }

}
