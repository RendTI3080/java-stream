import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamBuilderTest {

    @Test
    void streamBuilder(){

        /**
         * Mmebuat stream secara manual dengan Stream.Builder
         *
         * */
        Stream.Builder<Object> builder = Stream.builder();
        builder.add("Rendy").add("Eka");

        Stream<Object> stream1 = builder.build();
        stream1.forEach(System.out::println);
    }

    // cara kedua lebih simple
    @Test
    void streamBuilderSimple(){
        Stream<Object> stream2 = Stream.builder().add("RendTi3080").build();
        stream2.forEach(System.out::println);
    }
}
