package DAY3;

class sample 
{
    int a=50;;
    static int b=100;

    public void display()   // non static method
    {
        System.out.println(a);
        System.out.println(b);
    }
    static public void display1()
    {
       sample obj1=new sample();
        System.out.println(obj1.a);
    }

}



public class staticc {
    public static void main(String[] args) {
        sample obj=new sample();
        obj.display();
        sample.display1();
    }
}