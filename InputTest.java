import java.util.*;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What's your full name?");
        String fullName = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("So, " + fullName + ", looks like this time next year you'll be " + (age+1) + "!");
    }
}
