interface vehiclee{
    void cars();
}

class bike implements vehiclee
{
    public void cars(){
        System.out.println("hello");
    }
}

class re implements vehiclee
{
    public void cars()
    {
        System.out.println("world");
    }
}



public class interface
{
    public static void main(String[] args){
        vehiclee s1 =new re();
        s1.cars();

    } 
}
