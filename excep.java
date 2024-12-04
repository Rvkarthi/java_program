import java.util.Scanner;

public class excep {

    public static void test() throws Exception {
        int a = 1 / 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
