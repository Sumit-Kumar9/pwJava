class Demo
{
    static void disp1()
    {
       System.out.println("static method disp1");
    }

    void disp2()
    {
        System.out.println("non static method");
    }
}

public class StaticMethodvsNonStaticMethod {
    public static void main(String[] args) {
        Demo.disp1();
        Demo d = new Demo();
        d.disp2();
    }
}
