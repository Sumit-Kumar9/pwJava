class Alpha
{
    static int a;
    static int b;

    int m;
    int n;

    static
    {
        System.out.println("Static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Non static block");
        m = 100;
        n = 200;
    }
}

public class StaticVSInstance {
    public static void main(String[] args) {
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();

        System.out.println(Alpha.a);
        System.out.println(Alpha.b);
        System.out.println(a1.m);
        System.out.println(a2.n);

        // a1.m;
        // a2.n;
    }
}
