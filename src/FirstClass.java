import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {


        //-----------------------------------------------------------------------Assignment---------------------------------------------------------------------------------

        // 1) Pascal Case vs Camel Case vs  Snake Case
        // 2) public is Default Access Specifier
        // 3) Parameters that we pass in function call are called actual parameters.

        //-----------------------------------------------------------------------End------------------------------------------------------------------------------------------




        addTwoNumbers(3, 4);
        printMessage("NaeemSidra");
        int c = addTwoNumbers1(5, 6);
        System.out.println(c);
        // VCS stands for Version Control System

//        Scanner scannerObjectName = new Scanner(System.in);
//
//        System.out.println("Please Enter data");
//        int time = scannerObjectName.nextInt();
//
//
//        //   <----------------------------------------------------If Else If--------------------------------------------------------------->
//
//        if (time < 10) {
////            greeting = "Good morning";
//            System.out.print("Good morning");
//        } else if (time < 20) {
////            greeting = "Good day";
//            System.out.print("Good day");
//        } else {
////            greeting = "Good evening";
//            System.out.print("Good evening");
//        }


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


    // Parameters that we pass in function declaration/definition are called Formal Parameters.

    // Function declaration means what does function do and Function definition means how does Function do

    // public,private and protected are access specifiers

    public static void addTwoNumbers(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

     static void printMessage(String message) {
        System.out.println(message);
    }

     static int addTwoNumbers1(int a, int b) {
        return a + b;
    }
}

