import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class RetrieveTest {

    @Test
    void testRetrieveOperation(){
        Stream<String> stream = Stream.of("Rendy","EKa","Febriyanto");

        /**
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
}
