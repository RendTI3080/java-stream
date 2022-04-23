import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FirstTest {

    @Test
    void testCreateStream(){

        // create stream
        Stream<String> strem1 = Stream.of("Rendy");

        // create stream empty
        Stream<String> stream2 = Stream.empty();

        //create stream nullable
        Stream<String> stream = Stream.ofNullable(null);
    }

    @Test
    void testStreamFromArray(){

        // array
        String[] array1 = new String[]{
                "Rendy","Eka","Febriyanto"
        };

        // create array from stream
        Stream<String> stream4 = Arrays.stream(array1);

        Stream<String> stream5 = Arrays.stream(array1);

        // run stream with foreach
        stream4.forEach(name -> System.out.println(name));

        stream5.forEach(System.out::println);
    }

    @Test
    void testStreamFromCollection(){
        Collection<String> list1 = List.of("Rendy","Ganteng","Banget");

        /**
         * Stream Hanya bisa di jalankan sekali seperti sungai
         * kita tidak bisa mengembalikkan stream ke hulu
         *
         * jika kita ingin memanggilnya 2 kali maka kita harus membuat stream 2 kali juga
         *
         * */

        Stream<String> stream6 = list1.stream();
        stream6.forEach(System.out::println);
    }
}
