abstract class tamilnn

{

    abstract public void kumari();

}

public class neww

{

    public static void main(String[] args)

    {

        tamilnn s1 = new tamilnn() {

            public void kumari()

            {

                System.out.println("KUMARI is LOVE");

            }

        };

        s1.kumari();

    }

}
