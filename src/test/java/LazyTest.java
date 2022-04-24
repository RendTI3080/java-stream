import org.junit.jupiter.api.Test;

import java.util.List;

public class LazyTest {

    /**
     *
     * STREAM SECARA DEFAULT ADALAH LAZY
     * Artinya ia hanya akan berjalan ketika dipanggil saja
     *
     * di dalam stream terdapat 2 jenis operation
     * INTERMEDIATE DAN JUGA TERMINAL OPERATION
     *
     * Intermediate -> map. ia hanya akan berjalana ketika dipanggil
     *
     * Terminal operation -> forEach. ia akan dipanggil dan menampilkan hasil di terminal*/

    @Test
    void lazyStreamTest() {
        List.of("Rendy", "Eka").stream().map(value -> {
            System.out.println("Hello " + value.toUpperCase());
            return value.toUpperCase();
        }).forEach(item -> {
            System.out.println("id = " + item);
        });
    }
}
