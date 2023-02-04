package methodsTesting;

public class Guru {

    public static void main(String[] args) {

        // integer-type
        System.out.println(10 == 10);

        // char-type
        System.out.println('a' == 'b');

        // char and double type
        System.out.println('a' == 97.0);

        // boolean type
        System.out.println(true == true);



        char ch = '4';

        // check if character is alphabet or digit
        // using || operator
        if (ch >= 65 && ch <= 90
                || ch >= 97 && ch <= 122)
            System.out.println(
                    ch
                            + " is an alphabet.");
        else if (ch >= 48 && ch <= 57)
            System.out.println(
                    ch
                            + " is a digit.");
        else
            System.out.println(
                    ch
                            + " is a special character.");


        // Expression 1 (using ?: )
        // Automatic promotion in conditional expression
        Object o1 = true ? new Integer(4) : new Float(2.0);

        // Printing the output using conditional operator
        System.out.println(o1);

        // Expression 2 (Using if-else)
        // No promotion in if else statement
        Object o2;
        if (true)
            o2 = new Integer(4);
        else
            o2 = new Float(2.0);

        // Printing the output using if-else statement
        System.out.println(o2);
    }
}