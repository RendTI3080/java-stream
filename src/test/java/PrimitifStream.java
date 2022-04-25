import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitifStream {

    @Test
    void testCreatePrimitifStream(){

        /**
         *
         * Sayangnya stream hanya tersedia bagi data non primitif
         *
         * Tapi kita bisa membuat stream dari data primitif dengan
         * IntStream(integer), LongStream(long), DoubleStream(Double)
         *
         * */
        IntStream number = IntStream.range(0,10);
        number.forEach(System.out::println);

        IntStream number2 = IntStream.of(1,2,3);
        number2.forEach(System.out::println);

        IntStream number3 = IntStream.builder().add(1).add(2).build();
        number3.forEach(System.out::println);
    }


    @Test
    void testPrimitifStreamOperation(){

        /**
         *
         * Selain itu kita bisa menggunakan operator yang ada di dalam stream biasanya
         * bahkan lebih sederhana karena kita tidak perlu lagi yang namanya comparator
         *
         * */
        IntStream number = IntStream.range(0,10);
        number.average().ifPresent(System.out::println);

        Stream<Integer> number2 = IntStream.of(1,2,3).mapToObj(value -> value);
    }
}
