public class BuildingAString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append('D');
        builder.append("eny");
        builder.append('s');
        String completedString = builder.toString();

        System.out.println(completedString);
    }
}
