//package module4;

//public class HomeWork {
//    Test  your Learning CHAPTER 11 Module 4:
//
//    public static void main(String[] args) {
//
//        String s = "Java";
//        System.out.println(s.toUpperCase().length());
//        String c = "Legion"+1+2+"QA"+""+3+4;
//        System.out.println(c);
//        String a = "dog";
//        a=null;
//
//        System.out.println(a.toUpperCase());
//    }

//QUESTION 1            Write a program (method) that will receive two strings and do the following:
//                      1.) print if one string is part of another:
//                      for example:        String a = Category
//                                          String b = Cat
//                                          compareStrings(a, b)
//                                          output
//
//                                          "Cat is the part of Category"

//ANDREW Solution: Question 1/2/3

//  public class HomeWork {
//    public static void main(String[] args) {
//        HomeWork compare = new HomeWork();
//        compare.compareStrings("Cat", "Catalog");
//    }
//
//    public void compareStrings(String txt1, String txt2) {
//        String a = txt1;
//        String b = txt2;
//        if (a == null || b == null || a.isBlank() || b.isBlank() || a.isEmpty() || b.isEmpty()) {
//            System.out.println("Cannot compare Strings");
//        } else if (a.equalsIgnoreCase(b) || b.toLowerCase().contains(a.toLowerCase())) {
//            System.out.println(a + " is a part of " + b);
//        } else if (a == b) {
//            System.out.println("The strings are the same");
//        } else {
//            System.out.println(a + " is not a part of " + b);
//        }
//    }
//
//}

//QUESTION 4: Reverse String and Call if Equal
//                  Given a string, write a program to check if it is palindrome or not (return boolean).
//                  A string is said to be palindrome if the reverse of the string is the same as string.
//                  For example, “racecar” is a palindrome, but “carrace” is not a palindrome. Return boolean true or false.
//
//
// ANDREW Solution
//
//  public class HomeWork {
//    public static void main(String[] args) {
//
//        HomeWork check = new HomeWork();
//        check.isPalindrome("racecar");
//    }
//        public boolean isPalindrome (String text1){
//
//            System.out.println("Original string: " + text1);
//
//            StringBuilder reverseString = new StringBuilder(text1);
//            reverseString.reverse();
//
//            String text2 = reverseString.toString();
//            System.out.println("Reversed string: " + text2);
//
//            if (text1.equals(text2)) {
//                System.out.println("True : the word is palindrome");
//            } else {
//                System.out.println("False : the word is not palindrome");
//            }
//        return true;
//    }
//}
//
//SELF TRAINING MODULE 4
//
//  Test 1:
//
//        Given a string, take the last char and return a new string with the last char added at the beginning and the end,
//        so "dog" will become "gdogg". The original string should be length 1 or more.
//
//
//        backAround("dog") → "gdogg"
//        backAround("red") → "dredd"
//        backAround("xy") → "yxyy"

//  Andrew's Solution:

//      public static void main(String[] args) {
//        HomeWork testString = new HomeWork();
//        testString.addChars("dog");
//        testString.addChars("red");
//        testString.addChars("xy");
//      }
//      public String addChars(String str) {
//        String txt1 = str;
//        System.out.println(txt1.charAt(txt1.length()-1) + txt1 + txt1.charAt(txt1.length()-1));
//        return txt1;
//      }

//  Vitaliy Sol. Example

//    public class HomeWork {
//        public static void main(String[] args) {
//            HomeWork testString = new HomeWork();
//
//            System.out.println(testString.addChars("dog"));
//            System.out.println(testString.addChars("red"));
//            System.out.println(testString.addChars("xy"));
//        }
//        public String addChars(String str) {
//            char lastChar = str.charAt(str.length() - 1);
//            return lastChar + str + lastChar;
//        }
//    }
//}
//
//
//  Test 2: STARTS WITH / CHARAT()
//      Return true if the given string begins with "max", except the 'm' can be anything, so "pax", "9ax" .. all count.
//                     maxStart("max snacks") → true
//                     maxStart("pax snacks") → true
//                     miaStart("paz snacks") → false
//          public boolean maxStart(String str) {
//          }
//  Andrew's Solution
//    public static void main(String[] args) {
//        HomeWork checkValue = new HomeWork();
//        checkValue.maxStart("max snacks");
//        checkValue.maxStart("pax snacks");
//        checkValue.maxStart("paz snacks");
//    }
//    public boolean maxStart(String str) {
//        String txt1 = str;
//        String txt2 = "max";
//        if (txt1.charAt(1) == txt2.charAt(1) && txt1.charAt(2) == txt2.charAt(2) ){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
//        return true;
//    }
//}

//  Vitaliy Sol. Example

//    public class HomeWork {
//        public static void main(String[] args) {
//            HomeWork checkValue = new HomeWork();
//            System.out.println(checkValue.maxStart("max snacks"));
//            System.out.println(checkValue.maxStart("pax snacks"));
//            System.out.println(checkValue.maxStart("paz snacks"));
//        }
//        public boolean maxStart(String str) {
//            if (str.charAt(1) == 'a' && str.charAt(2) == 'x')
//                return true;
////            if (str.startsWith("ax", 1))
////                return true;
////                                  //  could also be used as an expression "ax" with starting index 1
//            else
//                return false;
//        }
//    }


//  Test 3: STARTS WITH / ENDS WITH
//      Given string str, if the string starts with "f" return "Fizz".
//      If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
//      In all other cases, return the string unchanged
//              fizzString("fig") → "Fizz"
//              fizzString("dib") → "Buzz"
//              fizzString("fib") → "FizzBuzz"
//
//  Andrew's Solution # 1:
//
//    public static void main(String[] args) {
//        HomeWork checkWord = new HomeWork();
//        checkWord.fizzStrg");
//        checkWord.fizzString("dib");
//        checkWord.fizzString("fib");
//        checkWord.fizzing("fiString("dog");
//        checkWord.fizzString("bobcab");
//        checkWord.fizzString("frost");
//    }
//    public String fizzString(String str) {
//        char desiredStringF = str.charAt(0);
//        char desiredStringB = str.charAt(2);
//
//        String testLetters = "fb";
//        char targetF = testLetters.charAt(0);
//        char targetB = testLetters.charAt(1);
//
//        String test1 = (desiredStringF == targetF && desiredStringB == targetB) ? "FizzBuzz" :
//                ((desiredStringF == targetF) ? "Fizz" :
//                        (desiredStringB == targetB) ? "Buzz" : str);
//        System.out.println(test1);
//        return str;
//    }

//  Andrew's Solution # 2: STARTS WITH / ENDS WITH

//    public static void main(String[] args) {
//        HomeWork check1 = new HomeWork();
//        System.out.println(check1.fizzString("fig"));
//        System.out.println(check1.fizzString("dib"));
//        System.out.println(check1.fizzString("fib"));
//    }
//    public String fizzString (String input) {
//
//            String a = new String("f");
//            String b = new String("b");
//            if (input.startsWith("f", 0) && input.endsWith("b")) {
//                return "FizzBuzz";
//            }
//            if (input.startsWith("f")) {
//                return "Fizz";
//            }
//            if (input.endsWith("b")) {
//                return "Buzz";
//            } else {
//                System.out.println("error");
//            }
//            return input;
//        }
//}
//}

//  Vitaliy Sol. Example - SOLUTION ABOVE

//    public static void main(String args[]) {
//        String Str = new String("Welcome to Tutorialspoint.com");
//
//        System.out.print("Return Value :" );
//        System.out.println(Str.startsWith("Tutorials", 11) );
//    }
//}
//
//  Test 4: CONTAINS / Compare BOOLEAN
//      Return true if the given string contains a "bib" string, but where the middle 'i' char can be any char.
//                  bigThere("xycbib") → true
//                  bigThere("b9b") → true
//                  bigThere("bac") → false

//  Andrew's Solution

//    public static void main(String[] args) {
//        HomeWork check = new HomeWork();
//        System.out.println(check.ifTrue("xycbib"));
//        System.out.println(check.ifTrue("b9b"));
//        System.out.println(check.ifTrue("bac"));
//    }
//    public boolean ifTrue(String str) {
//        int length = str.length();
//        for (int i = 0; i < length - 2; i++) {
//            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
//                return true;
//            }
//            return false;
//        }
//    }

//  Test 5: REPEAT METHOD (String times Number)
//      Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//              stringTimes("Hi", 2) → "HiHi"
//              stringTimes("Hi", 3) → "HiHiHi"
//              stringTimes("Hi", 1) → "Hi"

//  Andrew's Solution

//    public static void main(String[] args) {
//        HomeWork stringTimes = new HomeWork();
//        stringTimes.count2("Hi", 2);
//        stringTimes.count2("cape", 10);
//        stringTimes.count2("Hi", 1);
//    }

//    Solution #1; REPEAT Method

//    public void count(String str, int n) {
//        System.out.println(str.repeat(n));
//    }

//    Solution #2; FOR LOOP REPEAT

//    public void count2(String txt, int times) {
//        String repeat = new String(new char[times]).replace("\0",txt);
//        System.out.println(repeat);
//    }
//}


//
//  Test 6
//      Create a function that takes in a word and determines whether or not it is plural. A plural word is one that ends in "s".
//                  Examples:
//                      isPlural("changes") ➞ true
//                      isPlural("change") ➞ false
//                      isPlural("dudes") ➞ true
//                      isPlural("magic") ➞ false
//  Andrew's Solution

//    public static void main(String[] args) {
//        HomeWork check1 = new HomeWork();
//        System.out.println(check1.ifPlural("changes"));
//        System.out.println(check1.ifPlural("change"));
//        System.out.println(check1.ifPlural("dudes"));
//        System.out.println(check1.ifPlural("magic"));
//    }
//    public static boolean ifPlural(String word) {
//        int numOfLetters = word.length();
//        char lastLetter = word.charAt(numOfLetters - 1);
//        if (lastLetter == 's') {
//        } else if (lastLetter != 's') {
//            return false;
//        }
//        return true;
//    }
//}

//  Vitaly Sloution

//    public static boolean ifPlural(String word) {
//        if (word.charAt(word.length()-1) == 's') return true;
//        else return false;
//    }
