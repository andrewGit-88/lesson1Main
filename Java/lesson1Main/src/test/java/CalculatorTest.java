import module7.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeAll
    public static void classSetup() {
        System.out.println("before all methods");
    }

    @AfterAll
    public static void classTearDown() {
        System.out.println("after all methods");
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("after each method");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("after each method");
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 27, 123412, -34125312})
    public void summaryParamsTest(int a) {
        int b = 6;
        double expectedResult = b + a;
        double resultReceived = Calculator.calculate(a, b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, resultReceived, "____The result is incorrect____");
    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void calculationTypesTest(Calculator.Type type) {
        int a = 25;
        int b = 6;
        double actualResult = Calculator.calculate(a, b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult > 0);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest(int a, int b, double expectedResult, Calculator.Type typeUse) {
        double actualResult = Calculator.calculate(a, b, typeUse);
        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(2, 2, 4, Calculator.Type.SUMMARY),
                Arguments.of(4, 2, 2, Calculator.Type.DIVISION),
                Arguments.of(2, 2, 4, Calculator.Type.MULTIPLICATION),
                Arguments.of(5, 2, 3, Calculator.Type.SUBTRACTION)
        );
    }

    @ParameterizedTest
    @CsvSource({"2,2,4,SUMMARY", "4,2,2,DIVISION"})
    public void csvParamsTest(int a, int b, double expectedResult, Calculator.Type typeUse) {
        double actualResult = Calculator.calculate(a, b, typeUse);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void summaryTest() {
        int a = 5;
        int b = 6;
        double expectedResult = 10;
        double resultReceived = Calculator.calculate(a, b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, resultReceived, "____The result is incorrect____");
    }

    @Test
    public void divisionTest() {
        int a = 8;
        int b = 2;
        double expectedResult = 10;
        double resultReceived = Calculator.calculate(a, b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, resultReceived, "____The result is incorrect____");
        assertNotNull(resultReceived, "____The result is null____");
        assertTrue(expectedResult == resultReceived);
        assertFalse(expectedResult == 0);
    }
//    @Test
//    @DisplayName("Nullpointer Exception Test")
//    public void errorTest(){
//        int a = 10;
//        int b = 2;
//        double expectedResult = 5;
//        double resultReceived = Calculator.calculate(a,b,null);
//
//    }
}
