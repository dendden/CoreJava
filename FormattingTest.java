public class FormattingTest {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        System.out.println(x);
        System.out.printf("%8.2f\n", x);
        System.out.printf("%,.3f\n", x);

        String name = "Denys";
        int age = 29;
        String message = String.format("Hi, %s, looks like next year you'll be %d", name, age+1);
        System.out.println(message);
    }
}
