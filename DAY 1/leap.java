class sample 
{
    public void leapyear(int year)
    {
        if(((year%4==0) && (year%100!=0))||(year%400==0))
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a leap year");
        }


    }
}
public class leap {
public static void main(String asd[])
{
    sample obj=new sample();
    obj.leapyear(1900);
}    
}