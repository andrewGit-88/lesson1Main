package module4;
//
//chapter 2:    Methods with returns (RETURN, RESULT)
//
//  public class StringsMain {
//    public static void main(String[] args) {
//        StringsMain loop = new StringsMain();
//        int res = loop.sumOfTwoNumbers(2, 4);
//        System.out.println("the result is " + res);
//
//        System.out.println(loop.getText());
//    }
//    public int sumOfTwoNumbers(int num1, int num2) {
//        int result = num1 + num2;
//        return result;
//    }
//    public String getText(){
//        return "blablalblah";
//    }
//}
//
//Chapter 3:    Login App Diagram
//Chapter 4:    Null and Empty

//    public class StringsMain {
//
////      Adding expected string value if we were to know what the input will be
//        public String expectedUserName = "admin";
//        public String expectedPassword = "12345";
//
//        public static void main(String[] args) {
//
//            StringsMain loginApp = new StringsMain();
//            boolean success = loginApp.verifyUser("ADmIn","12345");
//            System.out.println("Login success is " + success);
//        }
//        public boolean verifyUser (String username, String password) {
//
////          Converting input to lower case for parameter restriction
//            username = username.toLowerCase();
//            password = password.toLowerCase();
//
////Chapter 5:    Login App Diagram (IS EMPTY,IS BLANK, NULL, EQUALS, IGNORECASE, TO LOWER CASE ! ||)
////Comparing Strings (still same program from chapter 4)
//
//            boolean success = false;
////              if(username.isEmpty() || password.isEmpty()){
////              }
////              above input restriction to not have empty return
//                if(username.length()==0 || password.length()==0){
//                    System.out.println("The username or password is empty");
//                }
////              above input restriction to not have amount of characters in "" so its  ==0
//                else if(username.isBlank() || password.isBlank()){
//                System.out.println("The username or password is blank");
//                }
////              above input restriction to not be empty blank (.isBlank Or (||))
//                else if(username == null|| password == null){
//                    System.out.println("The username or password is null");
//                }
////              above input is null, it can be used to make a string or object nonexisting
//                else if(!username.equalsIgnoreCase(expectedUserName) || !password.equalsIgnoreCase(expectedPassword)){
//                    System.out.println("The username or password does not match the expected values");
//                }
////              HOW TO COMPARE STRINGS -> ABOVE input *! NOT* - *equals* - *Ignore Uppercase* and same for password so
////              AdMiN will pass as true.--- public String was created as an expected username in the beginning---.
//
//                else {
//                    success = true;
//                }
//            return success;
//        }
//}
//
//Chapter 6:    CONTAINS/REPLACE/CHARAT/LENGTH
//Additional manipulations with Strings
//
//        public class StringsMain {
//            public static void main(String[] args) {
//                StringsMain loop = new StringsMain();
//                loop.stringsExamples();
//            }
//            public void stringsExamples() {
//                String txt1 = "cat";
//                String txt3 = "dog";
//                String txt2 = "catalog";
//
//                txt2.contains(txt1);
//                // CONTAINS Function - returns true or false and insert into sout directly
//                System.out.println(txt2.contains(txt1));
//
//                txt2.replace("cat",txt2);
//                // REPLACE Function - replaces "cat..." in tex2 2(catalog) with text3 (dog) - result dogalog
//                System.out.println(txt2.replace("cat",txt3));
//
//                txt1.charAt(0);
//                txt1.charAt(2);
//                // CHAR AT - locates index of the order of the digit or letter ("cat" - "0,1,2")
//                System.out.println(txt1.charAt(0));
//                System.out.println(txt1.charAt(1));
//
//                // LENGTH - text1 length - 1 index will LAST CHARACTER OF text1
//                System.out.println(txt1.charAt(txt1.length()-1));
//
//            }
//        }
//Chapter 7:    Conversions and Cast Variables (Int to String or ect.)
//      INTEGER.PARSEINT (txt) / STRING.VALUEOF (i)
//public class StringsMain {
//    public static void main(String[] args) {
//        String txt = "5";
////        int result = txt + 2;
////      cant add integerer with a text PROBLEM u can try below with a String but will return "52" and not "7"
//        int intTxt = Integer.parseInt(txt);
////          PARSEINT uses and converts String to integer
//        int result = intTxt + 2;
//        System.out.println(result);
//
//        int i = 225;
//        String result2 = String.valueOf(i);
////          VALUEOF turns integer into string so return 3 for length of indexes
//        System.out.println(result2);
//        System.out.println(result2.length());
//    }
//}
//Chapter 8:    How to Edit and Format Strings
//            STRINGFORMAT ("txt %s , %d , %f ," )
//
//public class StringsMain {
//    public static void main(String[] args) {
//        String name = "Andrew";
//        String gender = "male";
//        int age = 20;
//        double salary = 5000.50d;
////          Print all the information above
//        System.out.println("The name is " + name + ", gender is " + gender + " , age is " + age + " , salary is " + salary);
////          STRING.FORMAT("txt %s (string)/ %d (integer)/ %f (double)", and the reference to these numbers and strings)
////          More Readable Format look BELOW
//        System.out.println(String.format("The name is %s, the gender is %s, the age is %d, the salary is %f",name,gender,age,salary));
//    }
//}
//Chapter 9:    Reverse STRING ASSIGNMENT : DEMO INTERVIEW
//              Example:        (turn any word: dog --> god)
//                Logic:        get the last letter (length - 1) add it as the first letter of the word
//
//public class StringsMain {
//    public static void main(String[] args) {
//    StringsMain reverseString = new StringsMain();
//    reverseString.reverseString("dog");
//    }
//    public void reverseString(String txtToReverse) {
////            Check first if the work inside is empty on the input stage
//        if (txtToReverse == null || txtToReverse.isEmpty() || txtToReverse.isBlank()) {
//            System.out.println("the String is null or Empty");
//        } else {
//            System.out.println(String.format("the String  is: " + txtToReverse));
//            String result = "";
//            int lastLetter = txtToReverse.length() - 1;
////          Create a loop for reverse count back of all indexes in the String
//            for (int i = lastLetter;i >=0;i--){
//                result = result + txtToReverse.charAt(i);
//            }
//            System.out.println(result);
//        }
//    }
//}

