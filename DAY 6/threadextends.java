class foot extends Thread
{
    public void run()
    {
        System.out.println("cccc");
    }
}

public class threadextends
{
    public static void main(String[] args) 
    {
        foot s1  = new foot();
        s1.start();


    }
}
