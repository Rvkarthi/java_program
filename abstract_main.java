import java.util.Scanner;

abstract class Area 
{
    abstract void printarea();    
}

class rec extends Area
{
    void printarea()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter lenth and breath : ");

        int l = scan.nextInt(); 
        int b = scan.nextInt();

        System.out.println("area of rec : "+ l*b);
    }
}

class square extends Area
{
    void printarea()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter lenth  : ");

        int l = scan.nextInt(); 

        System.out.println("area of rec : "+ l*l);
    }
}

public class abstract_main
{
    public static void main(String[] args) {
    
    rec objrec = new rec();        
      
    square objSquare = new square();

    objrec.printarea();;
    objSquare.printarea();

    }
}






