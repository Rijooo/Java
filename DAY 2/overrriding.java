class vehicle
{
    void car()
    {
        System.out.println("best");
    }
}

class automobile extends vehicle{
    void car()
    {
        System.out.println("okay");
    }
}


public class overrriding {
    public static void main(String[] args)
    {
        automobile s1= new automobile();
        s1.car();

    }
}
