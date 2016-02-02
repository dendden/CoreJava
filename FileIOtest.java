import java.util.Scanner;
import java.io.*;
import java.nio.file.Paths;

public class FileIOtest {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
        String fileText = in.nextLine();
        System.out.println(fileText);

        PrintWriter out = new PrintWriter("myOutFile.txt", "UTF-8");
        out.print("printed by program: " + fileText);
    }
}
