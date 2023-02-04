package lesson2;

import java.sql.SQLOutput;

public class Lesson2main {
    public static void main(String[] args) {

        Lesson2main lesson2 = new Lesson2main();
//        lesson2.printUserinfo("John Doe",1);
        boolean isBonusAvailable = true;
        lesson2.checkScore("John Doe",1,40,isBonusAvailable);
        lesson2.checkScore("Mark Smith",2,50,isBonusAvailable);
        lesson2.checkScore("Anna Smith",3,-10, isBonusAvailable);
        lesson2.checkScore("Gal Lorie",4,110, isBonusAvailable);

    }
    public void printUserinfo(String userName, int userId){
        System.out.println("The user Name is " + userName);
        System.out.println("The user ID is " + userId);

    }
    public void checkScore(String userName, int userId, int userScore, boolean isBonusAvailable){
        System.out.println("The user Name is " + userName);
        System.out.println("The user ID is " + userId);

        if(userName.equals("John Doe")){
            userScore = userScore + 20;
            System.out.println(userScore);
            System.out.println("congrats You Got a Bonus!!! 20 points");
        }
        if(isBonusAvailable==true){
            userScore = userScore + 10;
        }
        if(userScore>100 || userScore<0){
            System.out.println("Error");
        }
        if(userScore>=60){
            System.out.println("Pass!");
        }
        else{
            System.out.println("Fail!");
        }
    }
}
