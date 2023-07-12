
public class classLoading {

    static int a;
    static        //Static block it execute during the class loading
    {
        System.out.println("Static block");
        a = 10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
