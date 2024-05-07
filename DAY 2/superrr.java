class football
{
    public void foot()
    {
        System.out.println("cris is the goat");
    }
}

class goat extends football
{
    public void foot()
    {
        System.out.println("goattt");
    }
    public void foott()
    {
        System.out.println("goat");
    }
    public void foottt()
    {
        super.foot();
        foott();
    }
}



public class superrr {
    public static void main (String args[])
    {
        goat g = new goat();
        g.foottt();
    }

}
