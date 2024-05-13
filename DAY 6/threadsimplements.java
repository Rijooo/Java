class foot implements Runnable
{
    public void run()
    {
        System.out.println("cccc");
    }
}

public class threadsimplements
{
    public static void main(String[] args) 
    {
        foot s1  = new foot();
        Thread thread = new Thread(s1);
        thread.start();


    }
}
