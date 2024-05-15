class foot extends Thread

{

   public void run()

   {

       for(int i=0;i<10;i++)

       {

       System.out.println("sub"+i );

       try{

       Thread.sleep(2000);

       }catch(InterruptedException s){}

       }

   }

}




public class mainsleep

{

   public static void main(String[] args) 

   {

       foot s1  = new foot();

       s1.start();

        for(int i=0;i<10;i++)

       {

       System.out.println("main"+i );

       try{

       Thread.sleep(1000);

       }catch(InterruptedException s){}

       }

       

       






   }

}