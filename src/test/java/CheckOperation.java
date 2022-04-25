import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperation {

    @Test
    void checkTest(){
        List<String> data = List.of("Rendy","Eka","Febriyanto");

        /**
         *
         * Ada 3 operasi dalam checking operator
         * anyMatch() mengecek apakah minimal ada 1 data yang berkondisi true
         * allMatch() mengecek apakah semua data berkondisi true
         * noneMatch() mengecek apakah semua data berkondisi false
         *
         * */

        Boolean test1 = data.stream().anyMatch(name -> name.equals("Rendy"));

        // Boolean test2 = data.stream().allMatch(name -> name.equals("Rendy"));

        // Boolean test2 = data.stream().noneMatch(name -> name.equals("Rendy"));
        System.out.println(test1);
    }
}
