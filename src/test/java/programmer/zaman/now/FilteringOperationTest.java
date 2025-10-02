package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFilteringOperation() {
        List.of("Indra", "Dwi","Prabowo", "Budi", "Joko").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);


        List.of(1,2,3,4,5,6,7,8,9).stream()
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Indra", "Dwi","Prabowo", "Budi", "Joko", "Indra", "Budi").stream()
                .distinct()
                .forEach(System.out::println);
    }

}
