//package module8;
//
//public class OverView1 {

//Module 8 :
//#1            Intro: Maven, Junit  - Framework
//#2            Maven:   compile,manage dependecies,build:
//              Maven-test project
//                  unit testing library
//                  selenium web driver
//                  cucumber lib
//                  database connections
//                  http/api connectors
//                  helpers
//                  utilities
//          -full controll, <dependencies>, write code configurating the project (POM - project object model)
//          -leficycle: validate: the project correct and all necessary inform
//                      compile: the source code
//                      test: test the compiled source
//                      package:take the in JAR
//                      install: install package
//Module 8 :
//#3            Maven dependencies and Build:
//                      = Add framework MAVEN
//                      + add junit testing platform download
//#4                 POM xml LIBRARY and dependencies
//                      - additionally added and modified POM xml with Legion Dependencies and plug ins
//#6            Createfirst JUNIT test
//                      - name methods with clear description and add test to the end
//
//Module 8 :
//#7            Assertions:
//                  @Test + @DisplayName (tag display test name)
//                      public void anythingdsHim (){
//                      ASSERT funct}
//              ctrl click on assert to view all functions
//                  assertEquals(expectedResult,resultReceived,"____The result is incorrect____");
//                  assertNotNull(resultReceived,"____The result is null____");
//                  assertTrue(expectedResult==resultReceived);
//                  assertFalse(expectedResult==0);
//                  assertThrows(nullpointerexception.class,()->{what u need to do to get a nullpointer});
//              Experiment / play around with assert options and functions;
//Module 8 :
//#8            Assertions:
//                  @BeforeAll
//                  public static void classSetup(){}
//                      runs before all tests
//                  @AfterAll
//                  public static void classTearDown(){}
//                      runs before all tests
//                  @BeforeEach
//                  public void beforeTest(){}
//                  @AfterEach
//                  public void afterTest(){}
//                          VERY COMMONLY USED IN AUTOMATION
//Module 8 :
//#9            Parametrized tests - Value Source:
//                  rerunning the tests on the new cycle with new veriables or integers from another source value
//                      @ParameterizedTest
//                      @ValueSource(ints = {-10,0,27,123412,-34125312})
//                          public void summaryParamsTest(int a){)
//                              will run in 5 lines for every integer to be substituted
//                  TEST YOUR LEARNING QUESTION 2:
//                  Parametrized test with Strings input should have:Choose only ONE best answer.
//                      @ValueSource
//Module 8 :
//#10            Parametrized tests - ENUM Source:
//                              @ParameterizedTest
//                              @EnumSource(Calculator.Type.class)
//                              public void calculationTypesTest(Calculator.Type type){
//Module 8 :
//#11            Parametrized tests - Method Source:

//                              @ParameterizedTest
//                              @MethodSource ("dataProvider")
//                                  public void methodSourceTest (int a, int b, double expectedResult, Calculator.Type typeUse ){
//                                  double actualResult=Calculator.calculate(a,b,typeUse);
//                                  assertEquals(expectedResult,actualResult);

//                              static Stream<Arguments> dataProvider (){
//                                   return Stream.of(
//                                       Arguments.of(2,2,4,Calculator.Type.SUMMARY),
//                                       Arguments.of(4,2,2,Calculator.Type.DIVISION),
//                                       Arguments.of(2,2,4,Calculator.Type.MULTIPLICATION),
//                                       Arguments.of(5,2,3,Calculator.Type.SUBTRACTION)

//         ****Very usefull tool, substituting any number or variable to run the test
//      static Stream<Arguments> dataProvider(){} method usually will provide the test with:
//           TEST YOUR LEARNING QUESTION 1:
//           Choose only ONE best answer:    Any sequence of variables or objects

//Module 8 :
//#12            Parametrized tests - CSV Source:
//                              @CSVSOURCE ({"","",""})
//                              public void csvParamsTest(int a, int b, double expectedResult, Calculator.Type typeUse) {
//                              double actualResult = Calculator.calculate(a, b, typeUse);
//                              assertEquals(expectedResult, actualResult);
//                              }
//                       More simple way of methodsource is csvsource / methodsource you can tell more complex
//                       arguments.
//Module 8 :
//#13            Log4J - how to add logs to your application:
//
//                              Download Libraries log4j
//                          private static final Logger logger = LogManager.getLogger(Main.class);
//