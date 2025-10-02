package programmer.zaman.now;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GrupingBy {

    @Test
    void testGrupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9)
                .collect(Collectors.groupingBy(number -> {
                    if (number > 5) {
                        return "Besar";
                    } else {
                        return "Kecil";
                    }
                }));
        System.out.println(collect);
    }

    @Test
    void testGrupingBy2() {
        Map<String, List<String>> collect = Stream.of("Indra", "Dwi", "Prabowo", "Joko")
                .collect(Collectors.groupingBy(name -> {
                    if (name.length() > 4) {
                        return "Panjang";
                    } else {
                        return "Pendek";
                    }
                }));

        System.out.println(collect);
    }

    @Test
    void testPartitionBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9)
                        .collect(Collectors.partitioningBy(numbers -> {
                            return numbers > 5;
                        }));
        System.out.println(collect);
    }

    @Test
    void testPartitionBy2() {
        Map<Boolean, List<String>> collect = Stream.of("Indra", "Dwi", "Prabowo", "Joko")
                        .collect(Collectors.partitioningBy(name -> {
                            return name.length() > 4;
                        }));

        System.out.println(collect);
    }

}
