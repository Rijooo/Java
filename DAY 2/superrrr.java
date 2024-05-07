class football
{
    football()
    {
        System.out.println("Cristiano");
    }
}

class goat extends football
{
    goat()
    {
        super();
        System.out.println("is the goat");
    }
}



public class superrrr
{
    public static void main(String args[])
    {
        goat g = new goat();
    }    
}
