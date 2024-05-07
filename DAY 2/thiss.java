class football
{
    String name;
    String country;
    int goat;
    football(String name,String country,int goat)
    {
        this.name=name;
        this.country=country;
        this.goat=goat;
    }
    public void football1()
    {
        System.out.println(name + "is" + country + "and" + goat);
    }
}

public class thiss 
{
    public static void main(String args[])
    {
        football s1 = new football("cristiano", "portugal", 1);
        s1.football1();
    }
}
