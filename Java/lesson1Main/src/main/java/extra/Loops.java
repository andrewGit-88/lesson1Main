 package extra;

    public class Loops {
        public static void main(String[] args) {
            Loops loops = new Loops();
//            loops.countNumbers(100);
//            loops.countNumbers();
            loops.numbersTemplate(25);

        }

        //        public void countNumbers(int i){
//            while(i<=100){
//                System.out.println(i);
//                i=i+1;
//                i++;
//
//            }
//        }
//        public void countNumbers() {
//            for (int i = 1; i > 100; i++) {
//                System.out.println(i + " ");
//            }
//            System.out.println();

//        }

        //       Example
//        1
//        1 2
//        1 2 3
        public void numbersTemplate(int rows) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 0) {
                        continue;
                    }
                    if (i >= 24) {
                        break;
                    }
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }