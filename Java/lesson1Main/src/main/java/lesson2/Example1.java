//package lesson2;
//
//public class Example1 {
//

    //    ////      M3 Loops Assignments: Question 1/3
////
//    public static void main(String[] args) {
//        Example1 loops = new Example1();
//        loops.countNumbers(1);
////        loops.countNumbersAlternative(100);
//    }

//        ALTERNATIVE method above "Ternary Operator Condition":

//    public void countNumbersAlternative(int variable) {
//        for (int i = 1; i <= variable;i++){
//            String evenOdd = (i % 2 == 0 && i % 3 == 0) ? "divisible by 2 and 3" :
//                    ((i % 3 == 0) ? "divisible by 3" :
//                            ((i % 2 == 0) ? " even " : " odd"));
//            System.out.println(i + " is " + evenOdd);
//        }
//    }
//}

//        SAMPLE of method above "Ternary Operator Condition":

//    public static void main(String[] args) {
//        int val1 = 10;
//        int val2 = 20;
//
//        int min = (val1 <= val2) ? val1 : val2;
//        System.out.println("max : " + min);
//
//    }

    //        ANDREW's Solution to the question:
//
//        public void countNumbers ( int variable){
//
//
//            for (int i = 0; i <= 100; i++) {
//                for (int j = 1; j <= i; j++) {
//                    j = i;
//
//                    if (j % 2 == 0) {
//                        if (j % 3 == 0) {
//                            System.out.println("the number " + j + " is divisible by 2 and 3");
//                            break;
//                        }
//                        System.out.println("the number " + j + " is even");
//                        break;
//                    }
//                    if (j % 3 == 0) {
//                        System.out.println("the number " + j + " is divisible by 3");
//                        break;
//                    } else {
//                        System.out.println("the number " + j + " is odd");
//                    }
//                }
//            }
//        }
//    }


//      M3 Loops Assignments: Question 2/3   - sum of numbers in between min and max
//            2 methods "FOR" and "While"

//    public static void main(String[] args) {
//
//        int min = 3, max = 25, sum = 0;
//        for (int i = min; i <= max; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}

//        int sum = 0;
//        int i = 3;
//        while (i <= 25){
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);


////      M3 Loops Assignments: Question 3/3   - create pyramid upside down with any number
////            method - pyramid reverse"
//
//
//    public static void main(String[] args) {
//        Example1 loops2 = new Example1();
//        loops2.pyramidReverse(1);
//    }
//
//    public void pyramidReverse(int rows) {
//        int k = 17;
//        for (int m = k; m >= 1; m--) {
//            for (int i = 1; i <= m; i++) {
//
//               System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}

//      Need more Training
//      Question #1
//                      Need more training? Here are some additional Java exercises for you://
//                      Given an int n, print true if it is within 10 of 100. Note:
//                      Need more training? Here are some additional Java exercises for you:
//                 Example:
//                                          Given an int n, print true if it is within 10 of 100. Note:
//                                                  nearHundred(93) → true
//                                                  nearHundred(90) → true
//                                                  nearHundred(89) → false
//                                                  public void nearHundred(int n) {
//                                                  }
//
//      AM  SOLUTION #1
//
//                                      public static void main(String[] args) {
//                                          Example1 loop = new Example1();
//                                          loop.nearHundred(93);
//                                          loop.nearHundred(90);
//                                          loop.nearHundred(89);
//                                      }
//                                      public void nearHundred (int n){
//                                          if (n >= 90 && n <= 100) {
//                                              System.out.println("true");
//                                          } else {
//                                              System.out.println("false");
//                                          }
//                                      }
//                                  }
//
//      Need more Training
//      Question #2
//                      Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
//                      Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//                 Example:
//                                              lastDigit(7, 17) → true
//                                              lastDigit(6, 17) → false
//                                              lastDigit(3, 113) → true
//                                          public void lastDigit(int a, int b) {
//                                          }
//      AM  SOLUTION #2
//
//                                  public static void main(String[] args) {
//                                      Example1 loop = new Example1();
//                                      loop.lastDigit(7,17);
//                                      loop.lastDigit(6,17);
//                                      loop.lastDigit(3,113);
//                                      }
//                                  public void lastDigit (int a, int b){
//                                      if (a % 10 == b % 10) {
//                                          System.out.println("true");
//                                      } else {
//                                          System.out.println("false");
//                                      }
//                                  }
//                              }
//
//      Need more Training
//      Question #3
//                      Given three int values, a b c, print the largest.
//                 Example:            intMax(1, 2, 3) → 3
//                                     intMax(1, 3, 2) → 3
//                                     intMax(3, 2, 1) → 3
//                                     public void maxInt(int a, int b, int c) {
//                                     }
//
//      AM  SOLUTION #3
//
//                          public static void main(String[] args) {
//                              Example1 loop = new Example1();
//                              loop.maxInt(1, 2, 3);
//                              loop.maxInt(1, 3, 2);
//                              loop.maxInt(3, 2, 1);
//                          }
//
//                          public void maxInt(int a, int b, int c) {
//                              if (a > b && a > c) {
//                                  System.out.println(a);
//                              }
//                              else if (b > a && b > c) {
//                                      System.out.println(b);
//                              }
//                              else if (c > a && c > b) {
//                                      System.out.println(c);
//                              }
//                          }
//                      }
//
//      Need more Training
//      Question #4
//                      Everyone loves the number 7. Given two int values, a and b, print true if either one is 7. Or if their sum is 7.
//                 Example:                    love7(7, 4) → true
//                                             love7(4, 1) → false
//                                             love7(2, 5) → true
//
//      AM  SOLUTION #4
//
//                                  public static void main(String[] args) {
//                                      Example1 loop = new Example1();
//                                      loop.lucky(7,4);
//                                      loop.lucky(4,1);
//                                      loop.lucky(2,5);
//                                  }
//                                  public void lucky (int a, int b) {
//                                      if ((a + b) == 7) {
//                                          System.out.println("true");
//                                      }
//                                      else if (a == 7 || b == 7) {
//                                          System.out.println("true");
//                                      }
//                                      else {
//                                          System.out.println("false");
//                                      }
//                                  }
//                              }
//      Need more Training
//      Question #5
//                      Your cell phone rings. Print true if you should answer it. Normally you answer, except in the morning
//                      you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
//
//                 Example:         answerCell(false, false, false) → true
//                                  answerCell(false, false, true) → false
//                                  answerCell(true, false, false) → false
//                                  public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//                                  }
//
//      AM  SOLUTION #5
//
//                                public static void main(String[] args) {
//                                    Example1 loop = new Example1();
//                                    loop.answerCell(false, false, false);
//                                    loop.answerCell(false, false, true);
//                                    loop.answerCell(true, false, false);
//                                }
//
//                                public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//                                    if (isAsleep == false) {
//                                        if (isMom == false) {
//                                            if (isMorning == false) {
//                                                System.out.println("true");
//                                            }
//                                        }
//                                    }
//                                    else if (isAsleep == true) {
//                                                System.out.println("false");
//                                    }
//                                    if (isMorning == true) {
//                                        if (isAsleep == false) {
//                                            if (isMom == false) {
//                                                System.out.println("false");
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//
//      Need more Training
//      Question #6
//                      Create a function that determines whether or not it's possible to split a pie fairly given
//                      these three parameters:     Total number of slices.
//                                                  Number of recipients.
//                                                  How many slices each person gets.
//                      The function will be in this form:
//                                                  equalSlices(total slices, no. recipients, slices each)
//
//                 Examples:                        equalSlices(11, 5, 2) ➞ true
//                                                  5 people x 2 slices each = 10 slices < 11 slices
//
//                                                  equalSlices(11, 5, 3) ➞ false
//                                                  5 people x 3 slices each = 15 slices > 11 slices
//
//                  Task:                           equalSlices(8, 3, 2) ➞ true
//                                                  equalSlices(8, 3, 3) ➞ false
//                                                  equalSlices(24, 12, 2) ➞ true
//      AM  SOLUTION #6
//
//                                public static void main(String[] args) {
//                                    Example1 loop = new Example1();
//                                    loop.equalSlices(11, 5, 2);
//                                    loop.equalSlices(11, 5, 3);
//                                    loop.equalSlices(8, 3, 2);
//                                    loop.equalSlices(8, 3, 3);
//                                    loop.equalSlices(24, 12, 2);
//                                }
//                                public void equalSlices(int totalSlices, int noRecipients, int slicesEach) {
//                                    if (noRecipients * slicesEach <= totalSlices) {
//                                        System.out.println("true");
//                                    }
//                                    else if ((noRecipients * slicesEach >= totalSlices)) {
//                                        System.out.println("false");
//                                    }
//                                }
//                            }

//        Question 1/10
//
//        if(1>2){
//            System.out.println("1 is greater than 2");
//        }
//        else{
//            System.out.println("2 is greater than 1");
//        }


//        Question 2/10
//
//        if(2=2){
//            System.out.println("numbers are equal");
//        }
//        else{
//            System.out.println("numbers are not equal");
//        }


//        Question 3/10
//
//        boolean a = true;
//        boolean b = false;
//                if(a||b){
//                    System.out.println(true);
//                }
//                else{
//                    System.out.println(false);
//                }

//        Question 5/10
//
//        boolean canFly = false;
//        int speed = 30;
//
//        if (canFly = false) {
//
//            if (speed < 20) {
//                System.out.println("Bike");
//            } else {
//                System.out.println("Tesla");
//            }
//        }
//        if (canFly = true) {
//
//            if (speed < 20) {
//                System.out.println("Bird");
//            } else {
//                System.out.println("Plane");
//            }
//        }

//        Question 6/10
//
//        for(int j = 10; j > 5; j--){
//            System.out.print(j + " ");
//        }
//        System.out.println();


//        Question 7/10
//
//        for(int i = 0 ; i > 5 ; i++){
//            System.out.print(i + " ");
//            System.out.println();
//        }


//        Qustion 8/10
//
//        int b = 5;
//        String list = "";
//        while(b < 11){
//            b = b + 2;
//            if (b % 2 == 1);
//            list = b + " " + list;
//        }
//        System.out.println(list);


//        Question 9/10
//
//        int i;
//        i = 1;
//        while (i <=8){
//            i = 2 * i;
//            System.out.println(i);
//        }


//        Question 10/10
//
//        int i = 1;
//
//        while(i >0) {
//
//            System.out.println(i);
//        }



