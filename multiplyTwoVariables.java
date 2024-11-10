import java.util.*;

public class Functions{
    public static int calMulti(int a,int b){
       int multi=a*b;
        return (multi);
        
    }
        
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
       int b= sc.nextInt();
      int multi=calMulti(a,b);
       System.out.print(multi);
        
    }
}
