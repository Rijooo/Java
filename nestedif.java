class sample 
{
    sample()
    {
        
        int age=18;
        boolean valid=true;
     

        if(age>=18)
        {
            if(valid==true)
            {
                System.out.println("Eligible for voting");
            }
            else{
                System.out.println("card not valid");
            }
        }
        else{
            System.out.println("not eligible for voting");
        }

    }
}


public class nestedif{
    
    public static void main(String ard[])
    {
        sample obj=new sample();
    }
}