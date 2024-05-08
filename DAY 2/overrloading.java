class football
{
    void world(int x, int y){
        System.out.println("goat");
    }

    void world(int x, int y,int z)
    {
        System.out.println("cow");
    }
}


public class overrloading {
    public static void main()
    {
        football s1 = new football();
        s1.world(3,4);
    }
}
