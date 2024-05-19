
class tamiln {

    String name = "Tamilan";

    String mean = "Power";

    int a;

    class kumari

    {

        public void beauty(int a) {

            System.out.println("Kumari is a love " + a + " percentage");

        }

    }

}

public class nestedd {

    public static void main(String[] args) {

        tamiln s1 = new tamiln();

        tamiln.kumari s2 = s1.new kumari();

        s2.beauty(100);

    }

}
