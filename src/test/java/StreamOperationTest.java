import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void streamOperatinExample(){

        // example dari operation di stream
        List<String> list = List.of("Rendy","Eka");

        Stream<String> stream1 = list.stream().map(String::toUpperCase);
        stream1.forEach(System.out::println);

    }
}
