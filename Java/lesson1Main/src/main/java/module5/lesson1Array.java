package module5;

import java.util.*;

public class lesson1Array {

//Lesson 2: ARRAY - Establishing Arrays in Main

//    public void stringsArray(){
//        String[]buttons={"Ok", "Cancel", "Login", "Signup"};
//        System.out.println(buttons[2]);
//    }
//    public void integerArray(){
//        int[]ids={12, 3, 8, 5};
//        System.out.println(ids[3]);
//    }
//}

//    Changing element in Array: Below - change element of array and check length of that element
//    public void stringsArray(){
//        String[]buttons={"Ok", "Cancel", "Login", "Signup"};

//        int length = buttons.length;
//
//        buttons [2] = "Exit";
//
//        System.out.println(buttons[2]);
//        System.out.println("Length is : " + length);

////Create a FOR loop to print all the elements: - method 1
//        for (int i = 0; i < buttons.length; i++){
//            System.out.println(buttons[i]);
//        }
//Create FOR EACH: - method 2
//        for (String everyString : buttons) {
//            System.out.println(everyString);
//        }
//    }

//Integer Array :

//    public void integerArray(){
//        int[]ids={12, 3, 8, 5};
//        System.out.println(ids[3]);
//    }

//Add element to Array: Below - check size of array

//    public void stringsArrayWithSize(){
//        String[] array = new String[5];
//        array[0] = "Ok";
//        array[1] = "Cancel";
//        array[2] = "Login";
//        array[3] = "Signup";
//        System.out.println("The length is : " + array.length);
//    }
//}

//DATA Structures: ARRAY LIST
//What is ArrayList in Java - is a group / collection of objects
//ArrayList is the only data structure that can have duplicate values

    public void arrayListExample() {
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("Ok");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");

//        Print out a STRING INDEX in ARRAY below
        System.out.println(buttons.get(0));

//        Create a FOR loop to print all the elements: - method 1
        for (int i = 0; i < buttons.size(); i++){
            System.out.println(buttons.get(i));
        }

//        Print out a list of strings / index  ARRAY below
        for (String everyString : buttons) {
            System.out.println(everyString);
        }

//        Print out a size of the list ARRAY below
        System.out.println("the size of the list is: " + buttons.size());

//        ADD another String to the ARRAY LIST below
        buttons.add("OMG");

//        Print updated ARRAY LIST below
        for (String everyString : buttons) {
            System.out.println(everyString);
        }

//        REMOVE another String from the ARRAY LIST below
        buttons.remove("Exit");
        System.out.println("");

//        CLEAR all Strings or int from the ARRAY LIST below
        buttons.clear();

//        PRINT UPDATE Size of all Strings or int from the ARRAY LIST below
        System.out.println("the new size of the list is: " + buttons.size());
    }
    public void arrayListSortingExample() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(91);
//        Import Utilities /library - Collections below - SORTING function
        Collections.sort(arrayList);

//        Create a Loop for Integer i of all arrayList items and SORTS it in numerical increasing below
        for (Integer i: arrayList) {
            System.out.println(i);
        }
//        It works the same for string but in alphabetical order
    }


//        ANOTHER Type of DATA Structure is HASHMAP - Key and Value / String and String / Integer
    public void hashMapExamples (){
        HashMap<String,String> hashMap1 = new HashMap<String,String>();
        hashMap1.put("John", "Toronto");
        hashMap1.put("Kate", "Moscow");
        hashMap1.put("Moshe", "Tel-Aviv");

        System.out.println(hashMap1);

//        Getting the VALUE based on the KEY
        hashMap1.get("Moshe");
        System.out.println(hashMap1.get("Moshe"));

//        REMOVING Key from the Hashmap
        hashMap1.remove("John");
        System.out.println(hashMap1.size());
//        The KEY has to be unique
    }


//        ASKED Question INTERVIEW difference between hashset/hashmap/arraylist - converting from
//            Hashset very unique keys and Values, hashset to array list
    public void hashSetExample(){
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("John");
        hashSet1.add("Kate");
        hashSet1.add("Dillon");
        System.out.println(hashSet1);

//      HASHSET to ARRAYLIST Creating / Converting a list of hashSet1 to array and Sort
        List<String> list = new ArrayList<String>(hashSet1);
        Collections.sort(list);
        System.out.println(list);
    }
}
