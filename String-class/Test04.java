import java.io.*;

public class Test04 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println(pw);
        pw.close();
        System.out.println(pw);
    }
}
