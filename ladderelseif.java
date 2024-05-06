class sample 
{
    sample()
    {
        int mark=35;
        if(mark<50)
        {
            System.out.println("reappear");
        }
        else if((mark>=50)&&(mark<60))
        {
            System.out.println("passed with minimum mark");
        }
        else if((mark>=60)&&(mark<70))
        {
            System.out.println("second class");
        }
        else if((mark>70)&&(mark<80))
        {
            System.out.println("first class");
        }
        else if((mark>=80) && (mark<=100))
        {
            System.out.println("Destingtion");

        }
        else
        {
            System.out.println("Check your marks");
         }
    }
}



public class ladderelseif {
    public static void main(String[] args) {
        sample obj=new sample();
    }    
}