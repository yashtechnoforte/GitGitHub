public class Practice{
    public static void main(String[] args) {
        System.out.println("Hello, I am Yash");
        myFullName();
        Practice age=new Practice();
        age.myAge();
        Practice.method();
    }
    public static void myFullName(){
        System.out.println("Yash S");
    }
    public void myAge(){
        System.out.println("22");
    }
    public Practice(){
        System.out.println("From Pusad");
    }
    public static void method(){
        System.out.println("BIT");
    }
    public static void method2(){
        System.out.println("INIT");
    }
    public static void method3(){
        System.out.println("IT");
    }
    public void myCollege(){
        System.out.println("BIT");
    }
}
