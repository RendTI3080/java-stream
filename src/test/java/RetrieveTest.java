import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class RetrieveTest {

    @Test
    void testRetrieveOperation(){
        Stream<String> stream = Stream.of("Rendy","EKa","Febriyanto");

        /**
         *
         * RETRIEVE yaitu pengetesan untuk mengambil sebagian data
         *
         * LIMIT = Mengambil data sejumlah n
         * SKIP = Melawati data sejumlah n
         * TAKEWHILE = Mengambil data selama kondisi true
         * DROPWHILE = Mengambil data setelah kondisi false
         *
         * */
        stream.limit(2).forEach(System.out::println);
        // stream.skip(2).forEach(System.out::println);
        // stream.takeWhile(value -> value.length() > 2).forEach(System.out::println);
        // stream.dropWhile(value -> value.length() > 2).forEach(System.out::println);
    }

    @Test
    void testRetrieveSingleOperation(){
        Stream<String> stream = Stream.of("Rendy","EKa","Febriyanto");

        // mengambil satu element random
        stream.findAny().ifPresent(System.out::println);
        // mengambil elemet pertama
        // stream.findFirst().ifPresent(System.out::println);
    }
}
