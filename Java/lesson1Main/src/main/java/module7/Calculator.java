package module7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

//ENUM example below substitution of PUBLIC STATIC FINAL INT above

    private static final Logger logger = LogManager.getLogger(Calculator.class);
public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }
    public static double calculate(int a, int b, Type type) {
    logger.info("Running method calculate");
        double result = 0;
//we can do it with IF ELSE or
//        if (type == MULTIPLICATION) {
//            return a * b;
//        }
//        else if(type == SUMMARY)

//or we can do it with Switch Case

//        return 0;

        switch (type) {
            case MULTIPLICATION:
                result =  a*b;
                break;
            case SUMMARY:
                result = a+b;
                break;
            case DIVISION:
                result = a/b;
                break;
            case SUBTRACTION:
                result = a-b;
                break;
            default:
                result = -1;

        }
        return result;

    }
}
