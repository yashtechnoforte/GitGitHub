import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        Practice3.multiplication();
        Practice3.addition();
        Practice3.substraction();
    }
    public static void multiplication(){
        System.out.println("Multiplication");
    }
    public static void addition(){
        System.out.println("Addition");
    }
    public static void substraction(){
        System.out.println("Substraction");
    }  
}
