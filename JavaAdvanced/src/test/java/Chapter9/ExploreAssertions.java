package Chapter9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExploreAssertions {


    @Test
    @DisplayName("Sum of Two Numbers")
    void testSumOfTwoNumbers()
    {
        //Arrange - define initial and expected values / results
        int num1 = 6, num2 = 3;
        int expectedNum = 9;

        //Act / Actual - actual processing done by the system
        int actualNum = num1 + num2;

        //Assert - comparing expected results with actual results
        assertEquals(expectedNum, actualNum, "Sum of" + num1 + " + " + num2 + " = " + expectedNum);

        //this takes a boolean conditions
        assertTrue(expectedNum == actualNum);
    }

    @Test
    @DisplayName("product of Two Numbers")
    void testProductOfTwoNumbers()
    {
        //Arrange - define initial and expected values / results
        int num1 = 3, num2 = 3;
        int expectedNum = 9;

        //Act / Actual - actual processing done by the system
        int actualNum = num1 * num2 + 1;

        //Assert - comparing expected results with actual results
        assertEquals(expectedNum, actualNum, "Sum of" + num1 + " * " + num2 + " = " + expectedNum);

        //this takes a boolean conditions
        assertTrue(expectedNum == actualNum);
    }
}
