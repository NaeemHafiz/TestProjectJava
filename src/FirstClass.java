import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {

        // chup kr jyn ap..lrka  betha h

        // VCS stands for Version Control System


        Scanner scannerObjectName = new Scanner(System.in);

        System.out.println("Please Enter data");
        int time = scannerObjectName.nextInt();


        //   <----------------------------------------------------If Else If--------------------------------------------------------------->

        if (time < 10) {
//            greeting = "Good morning";
            System.out.print("Good morning");
        } else if (time < 20) {
//            greeting = "Good day";
            System.out.print("Good day");
        } else {
//            greeting = "Good evening";
            System.out.print("Good evening");
        }


//   <----------------------------------------------------Nested If Else Inside If--------------------------------------------------------------->
//        if (time >= 10 && time <= 50) {
//            if (time >= 33) {
//                System.out.println("Pass");
//            } else {
//                System.out.println("fail");
//            }
//            if (time >= 50) {
//                System.out.println("grade c");
//            } else {
//                System.out.println("Terminated");
//            }
//        } else {
//            System.out.println("ending");
//        }

    }
}
