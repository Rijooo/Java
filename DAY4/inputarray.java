
import java.io.DataInputStream;

public class inputarray {
    public static void main(String args[]){
        int x[]= new int[5];
        DataInputStream din = new DataInputStream(System.in);

        for(int i=0;i<x.length;i++)
        {

             try{
                     x[i]=Integer.parseInt(din.readLine());
                }catch(Exception s){}
        }        
    }
}
