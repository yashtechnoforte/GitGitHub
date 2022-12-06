import java.util.Scanner;

public class Array {
    // public static void main(String[] args) {
    //     //Scanner sc=new Scanner(System.in);
    //     //int n=sc.nextInt();
    //     //int input=sc.nextInt();
    //     int[] array=new int[3];
    //     System.out.println(array);
    // }
    public static void main(String[] args)
        {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Array Size:");
            n=sc.nextInt();
            int[] array = new int[n];
            System.out.println("Enter Array elements: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
    
            for (int i=0; i<n; i++)
            {
                System.out.println(array[i]);
            }
        }
    
}
