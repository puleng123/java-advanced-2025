package Chapter9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParameterizedTests {

    @ParameterizedTest(name = "Test Pass Mark - [{index}] : {arguments}")
    @ValueSource(doubles = {77.7, 80, 23, 34.99,47})
    void testPassMark(double testMark)
    {
        boolean expected = true;

        boolean actual = testMark >= 65;
        assertEquals(expected, actual, "Pass maek should be >= 65: " + testMark);
        System.out.println("testMark = " + testMark);
    }

    @ParameterizedTest(name = "Test names - [{index}] : {arguments}")
    @ValueSource(strings = {"Kate", "Jake", "Jess", "Peter", "Sam", "Jacob"})
    void testNamesStartsWithJ(String testName)
    {
        assertTrue(testName.startsWith("J"), testName + " names does not start with J: " );
    }

    @ParameterizedTest
    @CsvSource( value = {"Milk,20.99,50","Cheese,55,25","Eggs,23.99,10","Bread,19.89,8"}) //comma separated values are used here
    void testLowStockProducts(String name, double price, int quantity)
    {
        assertTrue(quantity < 50, "There is enough stock for ["+name+"] in ["+quantity+"]");
        System.out.println("name = " + name + ", price = " + price + ", quantity = " + quantity);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Student Test Marks.csv", numLinesToSkip = 1) //the headings were skipped
    void testFailedStudents(String firstname, String lastname, int testMark)
    {

        assertTrue(testMark < 65, "Student [" + firstname + " " + lastname + "] should have been less than 65");
        System.out.println("firstname = " + firstname + ", lastname = " + lastname + ", testMark = " + testMark);
    }

    @ParameterizedTest
    @MethodSource("hobbies")
    void testHobbies(String hobby)
    {
        System.out.println("hobby = " + hobby);
    }

    @ParameterizedTest(name = "[{index}] : Test even numbers - {arguments}")
    @MethodSource("randomNumbers")
    void testRandomNumbers(int number)
    {
        assertTrue(number % 2 == 0, "Random number should be odd");
        System.out.println("number = " + number);
    }

//    @ParameterizedTest
//    @MethodSource
//    void randomNumbers(int number)
//    {
//        System.out.println("number = " + number);
//    }

    @ParameterizedTest
    @MethodSource("Chapter9.DataStore#randomNumbers")
    void testOddNumbers(int number)
    {
        assertTrue(number % 2 != 0, number + "is not an odd number");
        System.out.println("number = " + number);
    }

    static List<Integer> randomNumbers()
    {
        Random random = new Random();
        List<Integer> myNumbers = new ArrayList<>();
        int count = random.nextInt(5, 15);

        for (int i = 1; i <= count; i++)
        {
            myNumbers.add(random.nextInt(5, 70));
        }

        return myNumbers;
    }


    static Stream<String> hobbies()
    {
        return Stream.of("Tennis", "Hockey", "Chess", "Hiking", "Soccer");
    }
}
