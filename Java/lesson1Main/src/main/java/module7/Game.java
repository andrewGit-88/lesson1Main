//package module7;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//import static module7.Game.GameType.*;
//
//public class Game {
//    public static void main(String[] args) {
//
//        writeNumOfPlayersPerTeam(SOCCER);
//        writeNumOfPlayersPerTeam(HOCKEY);
//        writeNumOfPlayersPerTeam(RUGBY);
//    }
//
//    enum GameType {
//        SOCCER,
//        HOCKEY,
//        RUGBY
//    }
//
//    public static void writeNumOfPlayersPerTeam(GameType game) {
//        String type1 = "Soccer";
//        int index1 = 11;
//        String type2 = "Hockey";
//        int index2 = 6;
//        String type3 = "Rugby";
//        int index3 = 15;
//
//
//        switch (game) {
//            case SOCCER:
//                System.out.println("Name of Sport: " + type1 + "\n" + "Amount of players required: " + index1);
//                System.out.println("File " + "\"Soccer\"" + " has been created");
//                File game1 = new File(type1);
//
//                try {
//                    game1.createNewFile();
//                } catch (IOException e) {
//                }
//
//                if (game1.exists()) {
//                    try {
//                        FileWriter fw = new FileWriter(game1);
//                        fw.write("11");
//                        fw.close();
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                break;
//
//            case HOCKEY:
//                System.out.println("Name of Sport: " + type2 + "\n" + "Amount of players required: " + index2);
//                System.out.println("File " + "\"Hockey\"" + " has been created");
//                File game2 = new File(type2);
//
//                try {
//                    game2.createNewFile();
//                } catch (IOException e) {
//                }
//
//                if (game2.exists()) {
//                    try {
//                        FileWriter fw = new FileWriter(game2);
//                        fw.write("6");
//                        fw.close();
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                break;
//            case RUGBY:
//                System.out.println("Name of Sport: " + type3 + "\n" + "Amount of players required: " + index3);
//                System.out.println("File " + "\"Rugby\"" + " has been created");
//                File game3 = new File(type3);
//
//                try {
//                    game3.createNewFile();
//                } catch (IOException e) {
//                }
//
//                if (game3.exists()) {
//                    try {
//                        FileWriter fw = new FileWriter(game3);
//                        fw.write("15");
//                        fw.close();
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                break;
//            default:
//        }
//    }
//}