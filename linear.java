import java.util.Scanner;

class linear
{
    public static void main(String[] args) {
        //declaration
        int arr[]={5,10,15,20,25,30};
        int found = 0;

        Scanner scan = new Scanner(System.in);
        
        //input for key
        System.out.println("enter key : ");
        int key = scan.nextInt();

        //checking
        for (int i : arr) {
            if(key==i)
                found=1;
            System.out.print(" "+i); 
        }

        
        //ternary operator
        System.out.println((found==1)?"\nkey is found":"\nkey is not found");


    }
}