package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("Indra", "Dwi", "Budi", "Prabowo", "Ai").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> comparator = Comparator.reverseOrder();

        List.of("Indra", "Dwi", "Budi", "Prabowo", "Ai").stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

}
