import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        Practice3 obj=new Practice3(4, 2);
    }
    public Practice3(int a,int b){
        System.out.println(a-b);
    }
    // public Practice3(int a){
    //     System.out.println(a+a);
    // }
}
