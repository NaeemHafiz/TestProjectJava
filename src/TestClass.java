import java.util.Scanner;

public class TestClass {
    protected static void testFunction() {

        //we are creating object of scanner class
        System.out.println("Enter Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 10 && age <= 50) {

            if (age <= 18) {
                System.out.println("You are Teen Ager");
            } else {
                System.out.println("You are not teen ager");
            }
        } else {
            if (age < 10) {
                System.out.println("You are under 10");
            } else {
                System.out.println("You are above 50");
            }
        }
    }
}
