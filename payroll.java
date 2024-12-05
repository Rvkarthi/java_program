import java.util.Scanner;

class Employee {

    void display() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nenter your name : ");
        String name = scan.nextLine();

        scan.nextLine();

        System.out.print("\nenter your basic pay : ");
        int bf = scan.nextInt();

        double da = bf * 0.97;
        double hra = bf * 0.10;
        double pf = bf * 0.12;
        double cf = bf * 0.01;
        double gpay = bf + da + hra;
        double npay = gpay - pf - cf;

        System.out.println("name of the employee : " + name);
        System.out.println("dearance allowance : " + da);
        System.out.println("house rent allowance : " + hra);
        System.out.println("provient fund : " + pf);
        System.out.println("club fund : " + cf);
        System.out.println("gross pay : " + gpay);
        System.out.println("net pay : " + npay);

    }

}

public class payroll {
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("1.professor \n2.programmer 5.exit");
            System.out.print("\nenter choice ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Employee obj = new Employee();
                    obj.display();
                    break;
                case 2:
                    Employee obj1 = new Employee();
                    obj1.display();
                    break;

                default:
                    break;
            }
        }

        while (choice != 5);

    }
}
