import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelines {

    @Test
    void streamPipelinesTest() {

        // Kode seperti ini yang biasanya digunakan dalam industri
        // memakai yang namanya chaining
        Stream.of("Rendy", "Eka")
                .map(String::toUpperCase)
                .map(name -> "Mr " + name)
                .forEach(System.out::println);
    }
}
