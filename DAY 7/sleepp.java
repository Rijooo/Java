class foot extends Thread

{

   public void run()

   {

       for(int i=0;i<10;i++)

       {

       System.out.println(Thread.currentThread().getName()+ " is " +i );

       try{

       Thread.sleep(1000);

       }catch(InterruptedException s){}

       }

   }

}

class foot1 extends Thread

{

   public void run()

   {

       for(int i=0;i<5;i++)

       {

       System.out.println(Thread.currentThread().getName()+ " is " +i );

       try{

       Thread.sleep(1000);

       }catch(InterruptedException s){}

       }

   }

}




public class sleepp

{

   public static void main(String[] args) 

   {  

       foot s1  = new foot();

       foot1 s2 = new foot1();

       s1.setName("my thread");

       s2.setName("your thread");

       s1.start();

       s2.start();




   }

}
