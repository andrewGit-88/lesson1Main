//package module7;

//  #1  You're in the midst of creating a typing game.
//        Create a function that takes in two arrays: the array of user-typed words,
//        and the array of correctly-typed words and outputs an array containing 1s
//        (correctly-typed words) and -1s (incorrectly-typed words).

//  #1 Andrew's Solution:

import java.lang.annotation.Target;

//public class SelfTraining {
//    public static void main(String[] args) {
//        SelfTraining arrayCheck = new SelfTraining();
//        arrayEquals();
//    }
//
//    public static boolean arrayEquals() {
//
////        String[] userTypedArray = {"cat", "blue", "skt", "umbrells", "paddy"};
////        String[] correctArray = {"cat", "blue", "sky", "umbrella", "paddy"};
//
////        String[] userTypedArray = {"it", "is", "find"};
////        String[] correctArray = {"it","is", "fine"};
//
//        String[] userTypedArray = {"april", "showrs", "bring", "may", "flowers"};
//        String[] correctArray = {"april", "showers", "bring", "may", "flowers"};
//        int resultPositive = -1;
//        int resultFalse = 1;
//
//        for (int i = 0; i < correctArray.length; i++) {
//            if (userTypedArray[i] == correctArray[i]) {
//                System.out.println(resultFalse);
//            } else {
//                System.out.println(resultPositive);
//            }
//        }
//        return true;
//    }
//}

//  #2    Create a method that accepts a string (of a person's first and last name) and returns a string with the first
//        and last name swapped

//  #2 Andrew's Solution:

//    public static void main(String[] args) {
//        nameShuffle("Donald", "Trump");
//        nameShuffle("Rosie", "O'Donnell");
//        nameShuffle("Seymour", "Butts");
//    }
//    public static void nameShuffle(String firstName, String secondName) {
//        String personFirstName = firstName;
//        String personSecondName = secondName;
//        String originalOrientation = personFirstName + " " + personSecondName;
//        String returnReverse = personSecondName + " " + personFirstName;
//        System.out.println(originalOrientation + " ---> " + returnReverse);
//    }
//}
//  #3 Create a function that takes a word and returns true if the word has two consecutive identical letters.
//  #3 Andrew's Solution:

//    public static void main(String[] args) {
//        System.out.println(twoConsecutiveLetters("loop"));
//        System.out.println(twoConsecutiveLetters("yummy"));
//        System.out.println(twoConsecutiveLetters("orange"));
//        System.out.println(twoConsecutiveLetters("munchkin"));
//    }
//    public static boolean twoConsecutiveLetters(String inputWord) {
//        String txtToCheck = inputWord;
//        for (int i = 1; i < txtToCheck.length(); i++) {
//            char eachLetter = txtToCheck.charAt(i);
//            char eachLetter2 = txtToCheck.charAt(i-1);
//            if (eachLetter == eachLetter2) {
//                return true;}
//            else {
//            }
//        }
//        return false;
//    }
//}

    //  #4      Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system.
//          A player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital
//          letters, return an array of the players' scores.
//          For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points, Ben scored 2 points, and
//          Charlotte scored 5 points, since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of letter C.
//          So the array [3, 2, 5] should be returned.
//  #4 Andrew's Solution:

//    public static void main(String[] args) {
//        letterInstancesCount("ABBACCCCAC");
//        System.out.println("----------------------");
//        letterInstancesCount("A");
//        System.out.println("----------------------");
//        letterInstancesCount("ABC");
//        System.out.println("----------------------");
//        letterInstancesCount("ABCBACC");
//
//    }
//
//    public static void letterInstancesCount(String inputWord) {
//        String txtToCheck = inputWord.toUpperCase();
//        String nameA = "Andy";
//        String nameB = "Ben";
//        String nameC = "Charlotte";
//        long count = txtToCheck.codePoints().filter(ch->ch == 'A').count();
//        long count2 = txtToCheck.codePoints().filter(ch->ch == 'B').count();
//        long count3 = txtToCheck.codePoints().filter(ch->ch == 'C').count();
//        System.out.println(nameA + " scored " + count);
//        System.out.println(nameB + " scored " + count2);
//        System.out.println(nameC + " scored " + count3);
//
//        if (count > count2 && count > count3){
//            System.out.println(nameA + " wins");
//        }
//        else if (count2 > count && count2 > count3){
//            System.out.println(nameB + " wins");
//        }
//        else if (count3 > count && count3 > count2){
//            System.out.println(nameC + " wins");
//        }
//        else {
//            System.out.println("Game Tie");
//        }
//        }
//    }