package methodsTesting;

public class JavaOperators {


//    1)    Arithmetic operators
//    2)    Assignment operators
//    3)    Comparison operators
//    4)    Logical operators
//    5)    Bitwise operators


//    1)    Arithmetic operators - Used to perform common mathematical operations
//
//            +	    Addition	Adds together two values	x + y
//            -	    Subtraction	Subtracts one value from another	x - y
//            *	    Multiplication	Multiplies two values	x * y
//            /	    Division	Divides one value by another	x / y
//            %	    Modulus	Returns the division remainder	x % y   (Note that the % "mod" operator computes remainders, so 17 % 10 is 7.)
//            ++	Increment	Increases the value of a variable by 1	++x
//            --	Decrement	Decreases the value of a variable by 1	--x

//    2)    Assignment operators - The addition assignment operator (+=) adds a value to a variable:

//             =	x = 5	    x = 5
//            +=	x += 3	    x = x + 3
//            -=	x -= 3	    x = x - 3
//            *=	x *= 3	    x = x * 3
//            /=	x /= 3	    x = x / 3
//            %=	x %= 3	    x = x % 3
//            &=	x &= 3	    x = x & 3
//            |=	x |= 3	    x = x | 3
//            ^=	x ^= 3	    x = x ^ 3
//            >>=	x >>= 3	    x = x >> 3
//            <<=	x <<= 3	    x = x << 3

//    3)    Comparison operators - Used to compare two values, the return value of a comparison is either true or false

//              ==	    Equal to    	            x == y
//              !=	    Not equal	                x != y
//              >	    Greater than	            x > y
//              <	    Less than	                x < y
//              >=	    Greater than or equal to	x >= y
//              <=	    Less than or equal to	    x <= y

//    4)    Logical operators - Test for true or false values.Used to determine the logic between variables or values

//              && 	    Logical and	Returns true if both statements are true	x < 5 &&  x < 10
//              || 	    Logical or	Returns true if one of the statements is true	x < 5 || x < 4
//              !	    Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)


//    Single or multi-line comments?. Normally, we use // for short comments, and /* */ for longer.

//    Java Variables - Variables are containers for storing data values.
//
//    In Java, there are different types of variables, for example:
//
//          String        - stores text, such as "Hello". String values are surrounded by double quotes
//          int           - stores integers (whole numbers), without decimals, such as 123 or -123
//          float         - stores floating point numbers, with decimals, such as 19.99 or -19.99
//          char          - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//          boolean       - stores values with two states: true or false

//    Data types are divided into two groups:
//
//    Primitive data types      -   includes byte, short, int, long, float, double, boolean and char
//    Non-primitive data types  -   such as String, Arrays and Classes

//      byte	    1 byte	    Stores whole numbers from -128 to 127
//      short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
//      int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
//      long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//      float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//      double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
//      boolean	    1 bit	    Stores true or false values
//      char	    2 bytes	    Stores a single character/letter or ASCII values

//    The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles

//                                      double myNum = 19.99d;
//                                          System.out.println(myNum);

//    A floating point number can also be a scientific number with an "e" to indicate the power of 10

//                                      float f1 = 35e3f;
//                                      double d1 = 12E4d;
//                                          System.out.println(f1);
//                                          System.out.println(d1);

//    The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

//                                      char myVar1 = 65, myVar2 = 66, myVar3 = 67;
//                                           System.out.println(myVar1);
//                                           System.out.println(myVar2);
//                                           System.out.println(myVar3);

//    Non-Primitive Data Types
//    Non-primitive data types are called reference types because they refer to objects.
//
//    The main difference between primitive and non-primitive data types are:
//
//    -     Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
//    -     Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
//    -     A primitive type has always a value, while non-primitive types can be null.
//    -     A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
//    -     The size of a primitive type depends on the data type, while non-primitive types have all the same size.

//    Java Type Casting
//      Type casting is when you assign a value of one primitive data type to another type.
//      In Java, there are two types of casting:
//
//              Widening Casting (automatically) - converting a smaller type to a larger type size
//                  byte -> short -> char -> int -> long -> float -> double
//                      Example
//                              int myInt = 9;
//                              double myDouble = myInt; // Automatic casting: int to double
///                                    System.out.println(myInt);      // Outputs 9
//                                     System.out.println(myDouble);   // Outputs 9.0
//
//              Narrowing Casting (manually) - converting a larger type to a smaller size type
//                  double -> float -> long -> int -> char -> short -> byte
//                      Example
//                              double myDouble = 9.78d;
//                              int myInt = (int) myDouble; // Manual casting: double to int
//                                      System.out.println(myDouble);   // Outputs 9.78
//                                      System.out.println(myInt);      // Outputs 9

//    String Length
//      A String in Java is actually an object, which contain methods that can perform certain
//      operations on strings. For example, the length of a string can be found with the length() method:
//                      Example
//                              String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//                                      System.out.println("The length of the txt string is: " + txt.length());
//    More String Methods
//      There are many string methods available, for example toUpperCase() and toLowerCase():
//                      Example
//                              String txt = "Hello World";
//                                      System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
//                                      System.out.println(txt.toLowerCase());   // Outputs "hello world"
//    Finding a Character in a String
//      The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
//                      Example
//                              String txt = "Please locate where 'locate' occurs!";
//                                      System.out.println(txt.indexOf("locate")); // Outputs 7
//                                                      Java counts positions from zero.
//                                                      0 is the first position in a string, 1 is the second, 2 is the third ...
//    String Concatenation
//      The + operator can be used between strings to combine them. This is called concatenation:
//                      Example
//                               String firstName = "John";
//                               String lastName = "Doe";
//                                       System.out.println(firstName + " " + lastName);
//                      You can also use the concat() method to concatenate two strings:
//                      Example
//                               String firstName = "John ";
//                               String lastName = "Doe";
//                                       System.out.println(firstName.concat(lastName));
//      Adding Numbers and Strings
//      WARNING!
//              Java uses the + operator for both addition and concatenation.

//              Numbers are added. Strings are concatenated. If you add two numbers, the result will be a number:
//                      Example
//                              int x = 10;
//                              int y = 20;
//                              int z = x + y;  // z will be 30 (an integer/number)

//              If you add two strings, the result will be a string concatenation:
//                      Example
//                              String x = "10";
//                              String y = "20";
//                              String z = x + y;  // z will be 1020 (a String)
//              If you add a number and a string, the result will be a string concatenation:

//      Strings - Special Characters
//                              String txt = "We are the so-called "Vikings" from the north.";
//            The backslash (\) escape character turns special characters into string characters:
//                   \'	'	        Single quote
//                   \"	"	        Double quote
//                   \\  \     	    Backslash
//                   \n	            New Line
//                   \r	            Carriage Return
//                   \t	            Tab
//                   \b	            Backspace
//                   \f	            Form Feed
//                          String txt = "We are the so-called \"Vikings\" from the north.";
//    Java Math
//        Math.min(x,y)     Math.min(5, 10);    The Math.min(x,y) method can be used to find the lowest value of x and y:
//        Math.max(x,y)     Math.max(5, 10);    The Math.max(x,y) method can be used to find the highest value of x and y
//        Math.sqrt(x)      Math.sqrt(64);      The Math.sqrt(x) method returns the square root of x:
//        Math.abs(x)       Math.abs(-4.7);     The Math.abs(x) method returns the absolute (positive) value of x:
//        Math.random(x)    Math.random()       int randomNum = (int)(Math.random() * 101);     // if you only want a random number between 0 and 100

//     Java Booleans
//                  Very often, in programming, you will need a data type that can only have one of two values, like:
//          YES / NO
//          ON / OFF
//          TRUE / FALSE
//                  boolean keyword and can only take the values true or false - This is useful when we want to compare values to find answers:
//                                      int x = 10;
//                                      int y = 9;
//                                          System.out.println(x > y); // returns true, because 10 is higher than 9
//
//                                      int x = 10;
//                                          System.out.println(x == 10); // returns true, because the value of x is equal to 10
//                   Real Life Example
//                   Let's think of a "real life example" where we need to find out if a person is old enough to vote.
//                          In the example below, we use the >= comparison operator to find out if the age (25) is
//                          greater than OR equal to the voting age limit, which is set to 18:
//                                      int myAge = 25;
//                                      int votingAge = 18;
//                                          System.out.println(myAge >= votingAge);
//      Java If ... Else
//              Java Conditions and If Statements
//                      Java supports the usual logical conditions from mathematics:
//                           a < b         Less than:
//                           a <= b        Less than or equal to:
//                           a > b         Greater than:
//                           a >= b        Greater than or equal to:
//                           a == b        Equal to
//                           a != b        Not Equal to:
//                      Use if to specify a block of code to be executed, if a specified condition is true
//                      Use else to specify a block of code to be executed, if the same condition is false
//                      Use else if to specify a new condition to test, if the first condition is false
//                      Use switch to specify many alternative blocks of code to be executed
//                                              if (condition) {
//                                                // block of code to be executed if the condition is true
//                                              }
//                      In the example below we use two variables, x and y, to test whether
//                      x is greater than y (using the > operator). As x is 20, and y is 18,
//                      and we know that 20 is greater than 18, we print to the screen that "x is greater than y".
//                              int x = 20;
//                              int y = 18;
//                              if (x > y) {
//                                  System.out.println("x is greater than y")
//                                  }

//         Use the else statement to specify a block of code to be executed if the condition is false.
//                            if (condition) {
//                              // block of code to be executed if the condition is true
//                            } else {
//                              // block of code to be executed if the condition is false
//                            }
//          Example:                    int time = 20;
//                                      if (time < 18) {
//                                          System.out.println("Good day.");
//                                      } else {
//                                          System.out.println("Good evening.");
//                                      }
//                                          // Outputs "Good evening."
//      The else if Statement
//                  Use the else if statement to specify a new condition if the first condition is false.
//                                      if (condition1) {
//                                          // block of code to be executed if condition1 is true
//                                      } else if (condition2) {
//                                          // block of code to be executed if the condition1 is false and condition2 is true
//                                      } else {
//                                          // block of code to be executed if the condition1 is false and condition2 is false
//                                      }
//          Example:            int time = 22;
//                              if (time < 10) {
//                              System.out.println("Good morning.");
//                                  } else if (time < 20) {
//                                      System.out.println("Good day.");
//                                  } else {
//                                      System.out.println("Good evening.");
//                                  }
//                                          // Outputs "Good evening."
//      Java Short Hand If...Else (Ternary Operator)
//                      Short Hand If...Else
//                      There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
//                      It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
//                                  variable = (condition) ? expressionTrue :  expressionFalse;
//                                          int time = 20;
//                                          String result = (time < 18) ? "Good day." : "Good evening.";
//                                              System.out.println(result);

//      Java Switch Statements
//                      Instead of writing many if..else statements, you can use the switch statement.
//                      The switch statement selects one of many code blocks to be executed:
//                                  switch(expression) {
//                                      case x:
//                                              // code block
//                                          break;
//                                      case y:
//                                              // code block
//                                          break;
//                                      default:
//                                          // code block
//                                  }
//                      The switch expression is evaluated once.
//                      The value of the expression is compared with the values of each case.
//                      If there is a match, the associated block of code is executed.
//                      The break and default keywords are optional, and will be described later in this chapter
//                                  int day = 4;
//                                      switch (day) {
//                                          case 1:
//                                                 System.out.println("Monday");
//                                              break;
//                                          case 2:
//                                                  System.out.println("Tuesday");
//                                              break;
//                                          case 3:
//                                                  System.out.println("Wednesday");
//                                              break;
//                                          case 4:
//                                                  System.out.println("Thursday");
//                                              break;
//                                          case 5:
//                                                  System.out.println("Friday");
//                                              break;
//                                          case 6:
//                                                  System.out.println("Saturday");
//                                              break;
//                                          case 7:
//                                                  System.out.println("Sunday");
//                                              break;
//                                       }
//                                                          // Outputs "Thursday" (day 4)
//                  The break Keyword
//                          When Java reaches a break keyword, it breaks out of the switch block.
//                           A break can save a lot of execution time because it "ignores" the execution of all
//                           the rest of the code in the switch block.
//                  The default Keyword
//                          The default keyword specifies some code to run if there is no case match:

//          Example:                    int day = 4;
//                                      switch (day) {
//                                          case 6:
//                                                System.out.println("Today is Saturday");
//                                             break;
//                                          case 7:
//                                                System.out.println("Today is Sunday");
//                                             break;
//                                          default:
//                                                System.out.println("Looking forward to the Weekend");
//                                       }
//                                                           // Outputs "Looking forward to the Weekend"

//                            Note that if the default statement is used as the last statement in a switch block,
//                            it does not need a break.
//      Java While Loop
//                  Loops can execute a block of code as long as a specified condition is reached.
//                  Loops are handy because they save time, reduce errors, and they make code more readable.
//                  The while loop loops through a block of code as long as a specified condition is true:
//                                  while (condition) {
//                                      // code block to be executed
//                                  }
//                      Example:              int i = 0;
//                                            while (i < 5) {
//                                                  System.out.println(i);
//                                             i++;
//                                             }
//                  Do not forget to increase the variable used in the condition, otherwise the loop will never end!
//            The Do/While Loop
//                  The do/while loop is a variant of the while loop. This loop will execute the code block once,
//                  before checking if the condition is true, then it will repeat the loop as long as the condition is true.
//                                              do {
//                                                  // code block to be executed
//                                              }
//                                              while (condition);
//                  The example below uses a do/while loop. The loop will always be executed at least once, even if
//                  the condition is false, because the code block is executed before the condition is tested:
//                      Example               int i = 0;
//                                            do {
//                                              System.out.println(i);
//                                            i++;
//                                            }
//                                            while (i < 5);
//      Java For Loop
//                   When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
//                                      for (statement 1; statement 2; statement 3) {
//                                          // code block to be executed
//                                      }
//                  Statement 1 is executed (one time) before the execution of the code block.
//                  Statement 2 defines the condition for executing the code block.
//                  Statement 3 is executed (every time) after the code block has been executed.
//                  The example below will print the numbers 0 to 4:
//                      Example               for (int i = 0; i <= 10; i = i + 2) {
//                                                  System.out.println(i);
//                                            }
//      Java For Each Loop
//                  There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
//                                              for (type variableName : arrayName) {
//                                              // code block to be executed
//                                              }
//                  The following example outputs all elements in the cars array, using a "for-each" loop:
//                      Example:        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                                      for (String i : cars) {
//                                          System.out.println(i);
//                                      }
//      Java Continue
//                  The continue statement breaks one iteration (in the loop), if a specified condition occurs,
//                  and continues with the next iteration in the loop.
//                          This example skips the value of 4:
//                      Example         for (int i = 0; i < 10; i++) {
//                                          if (i == 4) {
//                                          continue;
//                                          }
//                                              System.out.println(i);
//                                       }
//              Break and Continue in While Loop
//                  You can also use break and continue in while loops:
//                      Break Example
//                                          int i = 0;
//                                          while (i < 10) {
//                                              System.out.println(i);
//                                          i++;
//                                              if (i == 4) {
//                                              break;
//                                              }
//                                          }
//                      Continue Example
//                                          int i = 0;
//                                          while (i < 10) {
//                                              if (i == 4) {
//                                              i++;
//                                                  continue;
//                                              }
//                                                  System.out.println(i);
//                                              i++;
//                                          }
//      Java Arrays
//                  Arrays are used to store multiple values in a single variable, instead of declaring separate
//                  variables for each value. To declare an array, define the variable type with square brackets:
//                                  String[] cars;
//                  We have now declared a variable that holds an array of strings. To insert values to it,
//                  you can place the values in a comma-separated list, inside curly braces:
//                                  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                  To create an array of integers, you could write:
//                                  int[] myNum = {10, 20, 30, 40};
//            Access the Elements of an Array
//                      You can access an array element by referring to the index number. This statement accesses
//                      the value of the first element in cars:
//                              Example     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                                              System.out.println(cars[0]);
//                                                  // Outputs Volvo
//                      Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
//            Change an Array Element
//                      To change the value of a specific element, refer to the index number:
//                              Example     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                                          cars[0] = "Opel";
//                                              System.out.println(cars[0]);
//                                                  // Now outputs Opel instead of Volvo
//            Array Length
//                      To find out how many elements an array has, use the length property:
//                              Example    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                                              System.out.println(cars.length);
//                                                  // Outputs 4
//      Java Arrays Loop
//                  You can loop through the array elements with the for loop, and use the length property to specify
//                  how many times the loop should run. The following example outputs all elements in the cars array:
//                              Example    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                                         for (int i = 0; i < cars.length; i++) {
//                                              System.out.println(cars[i]);
//                                          }
//            Loop Through an Array with For-Each
//                   There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
//                   The following example outputs all elements in the cars array, using a "for-each" loop:
//                              Example    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                                         for (String i : cars) {
//                                              System.out.println(i);
//                                          }
//                   The example above can be read like this: for each String element (called i - as in index) in cars,
//                   print out the value of i.
//            Multidimensional Arrays
//                      A multidimensional array is an array of arrays. To create a two-dimensional array, add each
//                      array within its own set of curly braces:
//                              Example     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//                                                            myNumbers is now an array with two arrays as its elements.
//                  To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element
//                  inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:
//                              Example     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//                                          int x = myNumbers[1][2];
//                                              System.out.println(x);
//                                                           //Outputs 7
//                  We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
//                              Example    public class Main {
//                                          public static void main(String[] args) {
//                                              int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//                                              for (int i = 0; i < myNumbers.length; ++i) {
//                                                  for(int j = 0; j < myNumbers[i].length; ++j) {
//                                                      System.out.println(myNumbers[i][j]);
//                                                  }
//                                              }
//                                           }
//                                          }
//

//    Parameters and Arguments: METHODS
//          Information can be passed to methods as parameter. Parameters act as variables inside the method.
//          Parameters are specified after the method name, inside the parentheses. You can add as many parameters
//          as you want, just separate them with a comma.
//              The following example has a method that takes a String called fname as parameter.
//              When the method is called, we pass along a first name, which is used inside the method to print the full name:
//
//                          Example:
//                                          public class Main {
//                                                  static void myMethod(String fname) {
//                                                  System.out.println(fname + " Refsnes");
//                                                  }
//
//                                                  public static void main(String[] args) {
//                                                  myMethod("Liam");
//                                                  myMethod("Jenny");
//                                                  myMethod("Anja");
//                                                  }
//                                              }
//                                                      // Liam Refsnes
//                                                      // Jenny Refsnes
//                                                      // Anja Refsnes

//    Multiple Parameters METHODS:
//          You can have as many parameters as you like:
//
//                          Example
//                                              public class Main {
//                                                  static void myMethod(String fname, int age) {
//                                                  System.out.println(fname + " is " + age);
//                                              }
//
//                                                  public static void main(String[] args) {
//                                                  myMethod("Liam", 5);
//                                                  myMethod("Jenny", 8);
//                                                  myMethod("Anja", 31);
//                                                  }
//                                              }
//                                                      // Liam is 5
//                                                      // Jenny is 8
//                                                      // Anja is 31

//    Return Values METHODS:
//          The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:
//
//                          Example
//                                              public class Main {
//                                                  static int myMethod(int x) {
//                                                  return 5 + x;
//                                                  }
//
//                                                  public static void main(String[] args) {
//                                                      System.out.println(myMethod(3));
//                                                  }
//                                              }
//                                                      // Outputs 8 (5 + 3)

//              You can also store the result in a variable (recommended, as it is easier to read and maintain):
//
//                          Example
//                                              public class Main {
//                                                  static int myMethod(int x, int y) {
//                                                  return x + y;
//                                                  }
//
//                                                  public static void main(String[] args) {
//                                                  int z = myMethod(5, 3);
//                                                      System.out.println(z);
//                                                  }
//                                              }
//                                                      // Outputs 8 (5 + 3)

//    A Method with If...Else
//              It is common to use if...else statements inside methods:
//
//                          Example
//                                              public class Main {
//                                                                      // Create a checkAge() method with an integer variable called age
//                                              static void checkAge(int age) {
//                                                                      // If age is less than 18, print "access denied"
//                                                  if (age < 18) {
//                                                      System.out.println("Access denied - You are not old enough!");
//                                                                      // If age is greater than, or equal to, 18, print "access granted"
//                                                  } else {
//                                                      System.out.println("Access granted - You are old enough!");
//                                                  }
//                                               }
//                                                  public static void main(String[] args) {
//                                                      checkAge(20);
//                                                                      //Call the checkAge method and pass along an age of 20
//                                                      }
//                                               }
//                                                                      // Outputs "Access granted - You are old enough!"

//    Method Overloading
//              With method overloading, multiple methods can have the same name with different parameters.
//                          Example
//                                      int myMethod(int x)
//                                      float myMethod(float x)
//                                      double myMethod(double x, double y)
//                          Consider the following example, which has two methods that add numbers of different type:
//
//                          Example
//                                              static int plusMethodInt(int x, int y) {
//                                                  return x + y;
//                                              }
//                                              static double plusMethodDouble(double x, double y) {
//                                                  return x + y;
//                                              }
//                                                  public static void main(String[] args) {
//                                                      int myNum1 = plusMethodInt(8, 5);
//                                                      double myNum2 = plusMethodDouble(4.3, 6.26);
//                                                          System.out.println("int: " + myNum1);
//                                                          System.out.println("double: " + myNum2);
//                                                  }
//                          Instead of defining two methods that should do the same thing, it is better to overload one.
//                          In the example below, we overload the plusMethod method to work for both int and double:
//
//                          Example
//                                              static int plusMethod(int x, int y) {
//                                                  return x + y;
//                                              }
//                                              static double plusMethod(double x, double y) {
//                                                  return x + y;
//                                              }
//                                                  public static void main(String[] args) {
//                                                      int myNum1 = plusMethod(8, 5);
//                                                      double myNum2 = plusMethod(4.3, 6.26);
//                                                          System.out.println("int: " + myNum1);
//                                                          System.out.println("double: " + myNum2);
//                                                  }

//    Java Recursion
//              Recursion is the technique of making a function call itself. This technique provides a way to break complicated
//              problems down into simple problems which are easier to solve. Recursion may be a bit difficult to understand.
//              The best way to figure out how it works is to experiment with it.
//
//                  Recursion Example
//                          Adding two numbers together is easy to do, but adding a range of numbers is more complicated.
//                          In the following example, recursion is used to add a range of numbers together by breaking it down
//                          into the simple task of adding two numbers:
//
//                        Example
//                                          Use recursion to add all of the numbers up to 10.
//
//                                      public class Main {
//                                              public static void main(String[] args) {
//                                              int result = sum(10);
//                                                  System.out.println(result);
//                                              }
//                                                  public static int sum(int k) {
//                                                  if (k > 0) {
//                                                      return k + sum(k - 1);
//                                                  } else {
//                                                      return 0;
//                                                  }
//                                              }
//                                      }
//                  Example Explained
//              When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and
//              returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:
//                                                                  10 + sum(9)
//                                                                  10 + ( 9 + sum(8) )
//                                                                  10 + ( 9 + ( 8 + sum(7) ) )
//                                                                  10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
//                                                                  10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
//              Since the function does not call itself when k is 0, the program stops there and returns the result.
//
//                        Example
//                                           Use recursion to add all of the numbers between 5 to 10.
//                                  public class Main {
//                                      public static void main(String[] args) {
//                                      int result = sum(5, 10);
//                                      System.out.println(result);
//                                      }
//                                      public static int sum(int start, int end) {
//                                          if (end > start) {
//                                              return end + sum(start, end - 1);
//                                          } else {
//                                              return end;
//                                          }
//                                      }
//                                  }

}