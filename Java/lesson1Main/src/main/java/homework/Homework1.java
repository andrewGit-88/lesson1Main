package homework;

public class Homework1 {
    public static void main(String[] args) {

//  Question 1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.

        String word = "Hello";
        String name = "Andriy Martynenko";

        System.out.println("answer 1a:" + "below");
        System.out.println(word);
        System.out.println(name);

//  Question 2. Write a Java program to print the result of the following operations.
//  a)         -5 + 8 * 6            (a + b * c)
//  b)         20 + -3 * 5 / 8       (d + e * f / b)

        int a = -5;
        int b = 8;
        int c = 6;
        int d = 20;
        int e = -3;
        int f = 5;

        double num0 = (a + b * c);
        double num1 = (double)f / b;
        double num2 = (e * num1);
        double num3 = (d + num2);

        System.out.println("answer 2a: " + num0);
        System.out.println("answer 2b: " + num3);

//  Question 3. Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:
//  number a * number b *.... equals <result>

        double number_a = 12.6;
        double number_b = 47.5;
        double number_c = 0.125;
        double number_d = 453.625;
        double number_e = 182.782;

        double sum = number_a * number_b * number_c * number_d * number_e;

        System.out.println("answer 3a: " + number_a + " * " + number_b + " * " + number_c + " * " + number_d + " * " + number_e + " = " + sum);
    }
}
