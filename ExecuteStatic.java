class Demo1
{
    static int a;
    static int b;

    int m;
    int n;

    static
    {
        System.out.println("Control in static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("control in non static block");
        m = 30;
        n = 40;
    }

    static void disp1()
    {
        System.out.println("Value of staic var a:"+a);
        System.out.println("Value of staic var a:"+b);
    }

    void disp2()
    {
        System.out.println("Value of non static variable :"+m);
        System.out.println("Value of non static variable :"+n);
    }
}
public class ExecuteStatic {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1.disp1();
        d.disp2();
    }
    
}
