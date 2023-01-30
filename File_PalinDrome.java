import java.util.*;
import java.io.*;

public class File_PalinDrome {
    public static void main(String k[]) {
        try {
            File f1 = new File("C:\\Users\\DELL\\Documents\\myfile.txt");
            Scanner myreader = new Scanner(f1);
            int count = 0;
            while (myreader.hasNextLine()) {
                String data = myreader.next();
                int i = 0;
                int j = data.length() - 1;
                int f = 0;
                while (i < j) {
                    if (data.charAt(i) != data.charAt(j))
                        f = 1;
                    i++;
                    j--;
                }
                if (f == 0)
                    count++;
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("Error Palindrome");
        }
    }
}
