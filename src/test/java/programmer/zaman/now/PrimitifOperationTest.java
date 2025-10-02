package programmer.zaman.now;

import jdk.dynalink.Operation;
import org.junit.jupiter.api.Test;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitifOperationTest {

    @Test
    void testCreate() {
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.range(1, 10);

        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
    }

    @Test
    void testOperation() {
        IntStream intStream = IntStream.range(1, 100);

        DoubleStream doubleStream = intStream.asDoubleStream();
        doubleStream.forEach(System.out::println);

        IntStream.range(0, 100)
                .mapToObj(number -> "Number " + number)
                .forEach(System.out::println);
    }


}
