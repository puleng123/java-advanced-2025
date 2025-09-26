package Chapter9;

import org.junit.jupiter.api.*;

/*
* @author Puleng Senyatso
* this class demonstrate use of different annotations from JUnit library
* */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExploreAnnotations {

    @BeforeAll
    static void beforeAll()
    {
        System.out.println("greetings before all");
    }

    @AfterAll
    static void  afterAll()
    {
        System.out.println("finished after all");
    }
    @BeforeEach
    void beforeEachTest()
    {
        System.out.println("@BeforeEachTest");
    }

    @AfterEach
    void afterEachTest()
    {
        System.out.println("@AfterEachTest");
    }

    @Test
    @DisplayName("TC1-test first method")
    @Order(1)
    @Tag("Sanity")
    void firstTest()
    {
        System.out.println("First Test");
    }

    @Test
    @DisplayName("TC2-test second method")
    @Order(3)
    @Tag("Regression")
    @Tag("Integration")
    void secondTest()
    {
        System.out.println("Second Test");
    }

    @Test
    @DisplayName("TC3-test third method")
    @Order(2)
    @Tag("Integration")
    void thirdTest()
    {
        System.out.println("Third Test");
    }
}
