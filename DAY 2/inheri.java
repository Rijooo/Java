class football
{
    void foot()
    {
        System.out.println("cristiano");
    }
}

class futsal extends football
{
    void fut()
    {
        System.out.println("is the");
    }
}
class fut extends futsal
{
    void f()
    {
        System.out.println("goat");
    }
}



public class inheri {
    public static void main(String args[])
    {
        fut s = new fut();
        s.foot();
        s.fut();
        s.f();
    }
}
