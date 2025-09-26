package Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DataStore {
    static List<Integer> randomNumbers()
    {
        Random random = new Random();
        List<Integer> myNumbers = new ArrayList<>();
        int count = random.nextInt(3, 20);

        for (int i = 1; i <= count; i++)
        {
            myNumbers.add(random.nextInt(210, 350));
        }

        return myNumbers;
    }

    static Stream<String> cities()
    {
        return Stream.of("Midrand", "Pta", "Joburg", "CPT", "Centurion");
    }
}
