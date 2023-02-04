import module7.Calculator;
import module8.HomeworkModule8;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkModule8Test {

    public static class Module8Test {

        @BeforeEach
        public void beforeEach() {
            System.out.println("Test start:");
        }

        @AfterEach
        public void afterEach() {
            System.out.println("Test finish");
        }

        @Test
        public void positiveTest1() {
            Logger LOGGER = LogManager.getLogger(Module8Test.class);
            LOGGER.info("checking test....");
            String dayOfWeek1 = HomeworkModule8.getDay(1);
            assertEquals("Sunday", dayOfWeek1);
            LOGGER.info("print this area----------");

        }
        @Test
        public void positiveTest2() {
            String dayOfWeek2 = HomeworkModule8.getDay(2);
            assertEquals("Monday",dayOfWeek2);
            System.out.println("all the days have correct return values");
        }
        @Test
        public void positiveTest3() {
            String dayOfWeek3 = HomeworkModule8.getDay(3);
            assertEquals("Tuesday",dayOfWeek3);
            System.out.println("all the days have correct return values");
        }
        @Test
        public void positiveTest4() {
            Logger LOGGER = LogManager.getLogger(Module8Test.class);
            LOGGER.info("checking test....");
            String dayOfWeek4 = HomeworkModule8.getDay(4);
            assertEquals("Wednesday",dayOfWeek4,"all the days have correct return values");
            LOGGER.info("Test Complete");

        }
        @Test
        public void positiveTest5() {
            String dayOfWeek5 = HomeworkModule8.getDay(5);
            assertEquals("Thursday",dayOfWeek5);
            System.out.println("all the days have correct return values");
        }
        @Test
        public void positiveTest6() {
            String dayOfWeek6 = HomeworkModule8.getDay(6);
            assertEquals("Friday",dayOfWeek6);
            System.out.println("all the days have correct return values");
        }
        @Test
        public void positiveTest7() {
            String dayOfWeek7 = HomeworkModule8.getDay(7);
            assertEquals("Saturday",dayOfWeek7);
            System.out.println("all the days have correct return values");
        }
        @ParameterizedTest
        @ValueSource(ints = {8, 777, 123585})
        public void negativeGreater7Test(int a) {

            String expectedResult = "The number should be equal or smaller than 7";
            String actualResult = HomeworkModule8.getDay(a);
            Assertions.assertEquals(expectedResult, actualResult);
        }

        @ParameterizedTest
        @ValueSource(ints = {-15, -277, -12312})
        public void negativeLesser1Test(int a) {
            Logger LOGGER = LogManager.getLogger(Module8Test.class);
            LOGGER.info("checking test....");
            String expectedResult = "The number should be equal or larger than 1";
            String actualResult = HomeworkModule8.getDay(a);
            Assertions.assertEquals(expectedResult, actualResult);
            LOGGER.info("Test Complete");

        }

        @Test
        public void nullValueTest() {
            int input = 1;
            int times2 = input * 2;
            int times3 = times2 * times2 * 1124124124;

            Logger LOGGER = LogManager.getLogger(Module8Test.class);
            LOGGER.info("checking test....");
            String actualResult = HomeworkModule8.getDay(times3);
            try {
                assertNotNull(actualResult, "____The result is null____");
                LOGGER.info(times3);
            }
            catch (Exception e){
                System.out.println("Error");

            }
            LOGGER.info("Test Complete");

        }
    }
}