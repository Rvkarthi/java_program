import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class filehandle {
    public static void main(String[] args) {
        try {
            File f = new File("index.txt");
            Scanner scan = new Scanner(f);
            FileWriter fw = new FileWriter("copied.txt");

            while (scan.hasNextLine()) {
                fw.write(scan.nextLine());
            }
            fw.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}


