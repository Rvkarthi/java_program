import java.util.Scanner;

interface Area {
    abstract void printarea();
}

interface summa {
    abstract void pannen();
}

class rec implements Area {
    public void printarea() {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter lenth and breath : ");

        int l = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("area of rec : " + l * b);
    }
}

class square implements Area {
    public void printarea() {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter lenth  : ");

        int l = scan.nextInt();

        System.out.println("area of rec : " + l * l);
    }
}

public class interfac {
    public static void main(String[] args) {

        rec objrec = new rec();

        square objSquare = new square();

        objrec.printarea();
        ;
        objSquare.printarea();

    }
}
