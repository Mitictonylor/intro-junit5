package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;
    @BeforeAll
    public static void beforeClass(){
        System.out.println("just at the start");
    }



    @BeforeEach
    void setUp() {
        System.out.println("before each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {


        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {


        System.out.println(greeting.helloWorld("john"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In Afeter each");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("just at the end");
    }
}