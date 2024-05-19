@FunctionalInterface

interface mydata {

   public void show(int x, int y);

}

public class lamb {

   public static void main(String[] args)

   {

      mydata obj = (int x, int y) -> {

         System.out.println("hopefully");

      };

      obj.show(12, 15);

   }
}