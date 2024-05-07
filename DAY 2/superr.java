class football
{
    
        String name="cristiano";
}

class goat extends football
{
    String name="kaka";
    public void cris()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
}




public class superr 
{
    public static void main(String args[])
    {
        goat best = new goat();
        best.cris();
    }
}
