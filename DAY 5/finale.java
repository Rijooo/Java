class samplee
{
    final int HIGH=100;
    final int LOW;
   
   // final int LOW;
    //final int HIGH=101;      //cannot alter a final declared variable
    samplee()
    {
         //int HIGH=101;
        
        LOW=0;
        System.out.println(HIGH);
        System.out.println(LOW);
    }
    
}



public class finale{
    public static void main(String[] args) {
        samplee s1=new samplee();
        //s1.checking();
    }
}
