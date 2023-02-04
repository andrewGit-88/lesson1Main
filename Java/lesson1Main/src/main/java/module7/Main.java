package module7;

public class Main {

    public static void main(String[] args) {
//        double result = Calculator.calculate(2, 3,Calculator.MULTIPLICATION);

//        Switch Case Example below Type to unknown -1
//        double result = Calculator.calculate(2, 3,8);

//        ENUM Example below Class Creating in Type
        double result = Calculator.calculate(2, 3, Calculator.Type.DIVISION);
        System.out.println("Result: " + result);

//        TRY / CATCH Example below Class Creating in Type
        try{
            result = Calculator.calculate(2, 3, Calculator.Type.SUMMARY);
        }
        catch (Exception err){
            System.out.println("Something bad has happened");
//            throw err;
//        }
//        finally {
//            System.out.println("Program finished every cycle");
//
        }

    }
}
