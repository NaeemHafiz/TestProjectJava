import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {

        // chup kr jyn ap..lrka  betha h

        // VCS stands for Version Control System

        Scanner scannerObjectName = new Scanner(System.in);

        System.out.println("Please Enter data");
        int number = scannerObjectName.nextInt();

        if (number >= 10 && number <= 50) {
            if (number >= 33) {
                System.out.println("Pass");
            } else {
                System.out.println("fail");
            }
            if (number >= 50) {
                System.out.println("grade c");
            } else {
                System.out.println("Terminated");
            }
        } else {
            System.out.println("ending");
        }

    }
}
