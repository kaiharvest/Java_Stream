package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    Stream<String> getStream() {
        return Stream.of("Indra", "Dwi", "Prabowo");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> imutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(imutableSet);

        List<String> list = getStream().collect(Collectors.toList());
        System.out.println(list);
        List<String> imutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(imutableList);
    }

    @Test
    void testMap() {
        Map<String, String> map = getStream().collect(Collectors.toMap(
                name -> name,
                name -> String.valueOf(name.length())
        ));
        System.out.println(map);
    }

}
