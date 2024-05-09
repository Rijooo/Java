package DAY4;

class sample{

       void breakk(){
        for(int i=0;i<5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
       }


}



public class cont {
    public static void main(String[] args)
    {
       sample s1 = new sample();
    }
}
