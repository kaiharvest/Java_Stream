package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RetrivingOperationTest {

    @Test
    void testLimit() {
        List.of("Indra", "Dwi","Prabowo", "Budi", "Joko").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Indra", "Dwi","Prabowo", "Budi", "Joko").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Dani","Edo", "Indra", "Dwi","Prabowo", "Budi", "Joko").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Dani","Edo", "Indra", "Dwi","Prabowo", "Budi", "Joko").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        List.of("Dani","Edo", "Indra", "Dwi","Prabowo", "Budi", "Joko").stream()
                .findAny()
                .ifPresent(System.out::println);
    }

    @Test
    void testFindFirst() {
        List.of("Dani","Edo", "Indra", "Dwi","Prabowo", "Budi", "Joko").stream()
                .findFirst()
                .ifPresent(System.out::println);
    }

}
