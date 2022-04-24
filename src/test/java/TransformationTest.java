import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationTest {

    @Test
    void testMapOperations() {
        List.of("Rendy", "Eka", "Febriyanto").stream()
                .map(String::toUpperCase)
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    void testFlatMapOperations() {
        List.of("Rendy", "Eka", "Febriyanto").stream()
                .map(String::toUpperCase)
                .flatMap(value -> Stream.of(value, value.length()))
                .forEach(System.out::println);
    }
}
