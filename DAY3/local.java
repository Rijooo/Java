package DAY3;


class variable
{
    String clg;
    int x;
    variable()
    {

    }

    void display()
    {
        System.out.println(clg);
        System.out.println(x);
       }
}



public class local {
    public static void main(String[] args)
    {
        variable s1= new variable();
        s1.display();
    }
}
