//package module5;

//public class homeworkModule5 {

    //    public static void main(String[] args) {
//
////Test your learning
////Question 1 of 8
//        int[] data = {1, 3, 9, 0, -68, 800};
//        System.out.println(data.length);
////Question 2 of 8
//        ArrayList<String> result = new ArrayList<String>();
//        result.add("cat");
//        result.add("dog");
//        result.add("dog");
//        System.out.println(result.get(1));
//        System.out.println(result.size());
////Question 4 of 8: Which collection is used to store key and value?
////        -HashMap
////Question 5 of 8:
//        HashSet<String> hashSet = new HashSet<String>();
//        hashSet.add("John");
//        hashSet.add("Kate");
//        hashSet.add("Kate");
//        hashSet.add("Moshe");
//        hashSet.remove("Moshe");
//        System.out.println(hashSet.size());
//    }
//}

//HOMEWORK ASSIGNMENT 1:
//                          Create a method with an array list of days of the week from Sunday to Saturday.
//                          The method can receive a number and return/print the day of the week

//Andrew's Solution 1    method 1:
//    public static void main(String[] args) {
//        homeworkModule5 check = new homeworkModule5();
//        System.out.println(check.getDays(2));
//    }
//    public String getDays(int i) {
//        ArrayList<String> days = new ArrayList<String>();
//        days.add("Sunday");
//        days.add("Monday");
//        days.add("Tuesday");
//        days.add("Wednesday");
//        days.add("Thursday");
//        days.add("Friday");
//        days.add("Saturday");
//
//        String daysOfTheWeek = (i == 1 ? days.get(0) : i == 2 ? days.get(1) : i == 3 ? days.get(2) :
//                i == 4 ? days.get(3) : i == 5 ? days.get(4) : i == 6 ? days.get(5) : i == 7 ? days.get(6) : "Error out of range");
//        return daysOfTheWeek;
//    }
//}

//  Andrew's Solution 2      method #2: Long

//    public static void main(String[] args) {
//        homeworkModule5 check = new homeworkModule5();
//        check.getDays(2);
//    }
//    public String getDays(int i) {
//        ArrayList<String> days = new ArrayList<String>();
//        days.add("Sunday");
//        days.add("Monday");
//        days.add("Tuesday");
//        days.add("Wednesday");
//        days.add("Thursday");
//        days.add("Friday");
//        days.add("Saturday");
//            if (i == 1) {
//                System.out.println(days.get(0));
//            }
//            if (i == 2){
//                System.out.println(days.get(1));
//                }
//            if (i == 3){
//                System.out.println(days.get(2));
//            }
//            if (i == 4){
//                System.out.println(days.get(3));
//            }
//            if (i == 5){
//                System.out.println(days.get(4));
//            }
//            if (i == 6){
//                System.out.println(days.get(5));
//            }
//            if (i == 7){
//                System.out.println(days.get(6));
//            }
//            else if (i > 7 || i < 0){
//                System.out.println("Error number is within a week");
//            }
//        return days.get(0);
//    }
//}

//  Vitaly's Solution

//      Task1. It is not necessary to use ArrayList there. Can be an array.

//    public static void main(String[] args) {
//        homeworkModule5 check = new homeworkModule5();
//        System.out.println(check.getDays(5));
//    }
//    public String getDays(int i) {
//        String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//
//        String daysOfTheWeek = (i == 1 ? days[0] : i == 2 ? days[1] : i == 3 ? days[2] :
//                i == 4 ? days[3] : i == 5 ? days[4] : i == 6 ? days[5] : i == 7 ? days[6] : "Error out of range");
//        return daysOfTheWeek;
//    }
//}

//HOMEWORK ASSIGNMENT 2:

//          The online Toys store has 5 different products –
//              Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6), Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56).
//              Each product has its own unique ID.
//              Please create a Method “public String getToyById(int id)”
//              which will build the hashmap of ids/products described above (Hashmap<Integer, String>)
//              and return the name of the toy by ID.
//              For example, calling getToyById(6) from the main method will return and print “Wonder Woman”.
//
//    Additional requirement:
//      If there is no product with an id specified in the call, return “No such Toy” String instead.
//      For example calling getToyById(999) will return and print “No such Toy”.
//    Optional task:
//      Instead of providing the id, get the user output by using the Scanner. Here is an example:
//      Get user input of id using Scanner class
//    example:
//          Scanner scanner = new Scanner(System.in);
//                                          // ask the question in console
//          System.out.print("Enter the Toy ID: ");
//                                          // get  input as a String
//          int id = Integer.parseInt(scanner.next());
//                                          Find the toy name by id as you did before and return it 😊
//                                                                                              Good luck!

//  Andrew's Solution  - HASHMAP KEY and Value / ENTRY bake / vs User Input through Scanner  - this one was tricky hard)

//    public static void main(String[] args) {
//        homeworkModule5 check = new homeworkModule5();
//        System.out.println(check.getToyByIId());
//    }
//    public String getToyByIId() {
//        HashMap<String, Integer> products = new HashMap<String, Integer>();
//        products.put("Lama", 2);
//        products.put("Batmobile", 12);
//        products.put("Light Saber", 45);
//        products.put("Wonder Woman", 6);
//        products.put("Hello Kitty Bag", 201);
//        products.put("Junior QA Analyst Doll", 56);
//
//        System.out.println("Enter Toy Id : ");
//        Scanner userInput = new Scanner(System.in);
//        int key = userInput.nextInt();
//
//        for (Map.Entry<String, Integer> entry : products.entrySet()) {
//            if (entry.getValue() == key) {
//                return (entry.getKey());
//            }
//        }
//            return "No such Toy";
//        }
//    }

//  Vitaly's Solution  -
//              Scanner is better to use in main(). Keep your functions (methods) simple as possible. One method -> one action
//              HashMap<String, Integer> -> is better to use ID as a Key HashMap<Integer, String>. Key is a something unique.
//                          In this case you don't need to use this:
//                                              for (Map.Entry<String, Integer> entry : products.entrySet()) {
//                                                  if (entry.getValue() == key) {
//                                              return (entry.getKey());
//                                                  }
//                                              }
//                          it will be just simple
//                                              products.get(key)

//    public static void main(String[] args) {
//        homeworkModule5 check = new homeworkModule5();
//        System.out.println("Enter Toy Id : ");
//        Scanner userInput = new Scanner(System.in);
//        int key = userInput.nextInt();
//        System.out.println(check.getToyByIId(key));
//    }
//    public String getToyByIId(int key) {
//        HashMap<Integer, String> products = new HashMap<Integer, String>();
//        products.put(2, "Lama");
//        products.put(12, "Batmobile");
//        products.put(45, "Light Saber");
//        products.put(6, "Wonder Woman");
//        products.put(201, "Hello Kitty Bag");
//        products.put(56, "Junior QA Analyst Doll");
//
//        String toy = products.get(key);
//
//        if (toy == null)
//            return "No such toy";
//        return toy;
//    }
//}


//HOMEWORK ASSIGNMENT 3:
//                  The program should receive an ArrayList of Strings and print all the words with no duplicates.
//                      for example:
//                              input :     [Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
//                              output:     [Steve, Tim, Lucy, Pat, Angela, Tom, Anna]
//                      tips:
//                              1.  What if you will sort the array before removing the duplicates?
//                              2.  What if you use some different collections?  :-)

//  Andrew's Solution   - REMOVE DUPLICATES / Create COLLECTION sort

//    public static void main(String[] args) {
//        homeworkModule5 check = new homeworkModule5();
//        check.arrayList();
//    }
//    public void arrayList() {
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Steve");
//        names.add("Tim");
//        names.add("Lucy");
//        names.add("Steve");
//        names.add("Pat");
//        names.add("Angela");
//        names.add("Tom");
//        names.add("Tim");
//        names.add("Anna");
//        names.add("Lucy");
//        Collections.sort(names);
//        System.out.println("\n" + "Original list with duplicates : " + names + "\n Number of names on the list : " + names.size() + "\n");
//
//        List<String> updateNames = names.stream().distinct().collect(Collectors.toList());
//        System.out.println("Updated list without duplicates : "  + updateNames + "\n Number of names on the list : " + updateNames.size());
//    }
//}

//  Vitaly's Solution

//    public static void main(String[] args) {
//        homeworkModule5 check = new homeworkModule5();
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Steve");
//        names.add("Tim");
//        names.add("Lucy");
//        names.add("Steve");
//        names.add("Pat");
//        names.add("Angela");
//        names.add("Tom");
//        names.add("Tim");
//        names.add("Anna");
//        names.add("Lucy");
//
//        System.out.println("\n" + "Original list with duplicates : " + names + "\n Number of names on the list : " + names.size() + "\n");
//        check.printWordsWithoutDuplicates(names);
//    }
//    public void printWordsWithoutDuplicates(ArrayList<String> list) {
//        Collections.sort(list);
//        list = (ArrayList<String>) list.stream().distinct().collect(Collectors.toList());
//        System.out.println("Updated list without duplicates : "  + list + "\n Number of names on the list : " + list.size());
//    }
//}

//MODULE 5 : Test your Learning Arrays:

//  Question 1:   Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//                      has22([1, 2, 2]) → true
//                      has22([1, 2, 1, 2]) → false
//                      has22([2, 1, 2]) → false

//  Andrew's Solution:

//    public static void main(String[] args) {
//        homeworkModule5 check1 = new homeworkModule5();
////        int[] has22 = {1, 2, 2};
////        int[] has22 = {1, 2, 1, 2};
////        int[] has22 = {2, 1, 2};
//        int[] has22 = {1, 3, 1, 2, 52, 52, 40,};
//        System.out.println(check1.check(has22));
//    }
//    public boolean check(int [] has22) {
//        for (int i = 0; i < has22.length - 1; i++) {
//            if (has22[i] == has22[i + 1]) {
//                System.out.println(has22[i] + " and " + has22[i+1]) ;
//                return true;
//            }
//        }
//            return false;
//        }
//    }

//  Question 2:   Given an array of ints, return true if the array contains no 1's and no 3's.//
//                      lucky13([0, 2, 4]) → true
//                      lucky13([1, 2, 3]) → false
//                      lucky13([1, 2, 4]) → false

//  Andrew's Solution:

//    public static void main(String[] args) {
//        homeworkModule5 check1 = new homeworkModule5();
////        int[] lucky13 = {0, 2, 4};
////        int[] lucky13 = {1, 2, 3};
////        int[] lucky13 = {1, 2, 4};
//        int[] lucky13 = {1, 2, 4, 5, 12, 3, 31, 9,};
//        System.out.println(check1.check(lucky13));
//    }
//    public boolean check(int [] lucky13) {
//        int a = 1;
//        int b = 3;
//        for (int i = 0; i < lucky13.length; i++) {
//            for (int k = 0; k < lucky13.length; k++) {
//                if (lucky13[i] == a && lucky13[k] == b) {
//                    return true;
//                }
//            }
//        }
//            return false;
//        }
//    }

//  Question 3:     Given an array of ints of odd length, look at the first, last, and middle values in the array
//                  and return the largest. The array length will be at least 1.
//                                  maxTriple([1, 2, 3]) → 3
//                                  maxTriple([1, 5, 3]) → 5
//                                  maxTriple([5, 2, 3]) → 5

//  Andrew's Solution #1: long

//    public static void main(String[] args) {
//        homeworkModule5 check1 = new homeworkModule5();
////        int[] maxTriple = {1, 2, 3};
////        int[] maxTriple = {1, 5, 3};
////        int[] maxTriple = {5, 2, 3};
//        int[] maxTriple = {24, 85, 105};
//
//        System.out.println(check1.check(maxTriple));
//    }
//    public Integer check(int[] maxTriple) {
//        if (maxTriple[0] > maxTriple[1] && maxTriple[0] > maxTriple[2]) {
//            return (maxTriple[0]);
//        }
//        if (maxTriple[1] > maxTriple[0] && maxTriple[1] > maxTriple[2]) {
//            return maxTriple[1];
//        }
//        if (maxTriple[2] > maxTriple[0] && maxTriple[2] > maxTriple[1]) {
//            return maxTriple[2];
//        }
//        return maxTriple[0];
//    }
//    }

//  Andrew's Solution #2: short - based on checking ODD Number Array FINDS FIRST index value, MIDDLE and LAST to compare

//    public static void main(String[] args) {
//        homeworkModule5 check1 = new homeworkModule5();
////        int[] numbers = {1, 2, 3};
////        int[] numbers = {1, 5, 3};
////        int[] numbers = {5, 2, 3};
//        int[] numbers = {24, 85, 105};
//
//        System.out.println(check1.maxTriple(numbers));
//    }
//    public int maxTriple(int[] numbers) {
//        int first = numbers[0];
//        int middle = numbers[numbers.length/2];
//        int last = numbers[numbers.length -1];
//        if (first > middle && first > last){
//            return first;
//        }
//        if (middle > first && middle > last){
//            return middle;
//        }
//        return last;
//    }
//    }

//  Question 4:     Given an array of ints, return true if one of the first 4 elements in the array is a 9.
//                  The array length may be less than 4.
//                              arrayFront9([1, 2, 9, 3, 4]) → true
//                              arrayFront9([1, 2, 3, 4, 9]) → false
//                              arrayFront9([1, 2, 3, 4, 5]) → false
//
//  Andrew's Solution: - Check if Integer Array has a Specific Value in it, Array Length could be variable

//    public static void main(String[] args) {
//        homeworkModule5 check1 = new homeworkModule5();
//        int checkValueOf = 9;
////        int[] numbers = {1, 2, 9, 3, 4};
////        int[] numbers = {1, 2, 3, 4, 9};
////        int[] numbers = {1, 2, 3, 4, 5};
//        int[] numbers = {1, 2, 9};
//        System.out.println("Array: " + Arrays.toString(numbers));
//        check1.arrayFront9(numbers,checkValueOf);
//    }
//    public void arrayFront9(int[] numbers, int checkValueOf) {
//        boolean test = false;
//        for (int index : numbers){
//            if (index == checkValueOf){
//                test = true;
//                break;
//            }
//        }
//        System.out.println("Is " + checkValueOf + " present in array : " + test) ;
//    }
//}

//  Question 5:     Given a list of integers, return a list where each integer is multiplied with itself.
//                              square([1, 2, 3])           →   [1, 4, 9]
//                              square([6, 8, -6, -8, 1])   →   [36, 64, 36, 64, 1]

//  Andrew's Solution: - Multiply Integers in Array by itself (create a duplicate array and result array)

//    public static void main(String[] args) {
//        homeworkModule5 check1 = new homeworkModule5();
////        int[] numbers = {1, 2, 3};
////        int[] numbers = {6, 8, -6, -8, 1};
//        int[] numbers = {14, 22, 35, 46, 59, 68, 74, 80, 93, 100};
//
//        System.out.println("Array: " + Arrays.toString(numbers));
//        check1.square(numbers);
//    }
//    public void square (int[] numbers) {
//        int [] b = numbers;
//        int [] c = new int[b.length];
//
//        for (int i = 0; i < numbers.length; i++){
//            c[i] = numbers[i] * b[i];
//            System.out.println(c[i]);
//        }
//    }
//}
