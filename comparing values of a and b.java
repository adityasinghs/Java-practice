import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.printf("Enter Value of A : "); 
       int a=sc.nextInt();
       System.out.printf("Enter Value of B : "); 
       int b=sc.nextInt();
       
       
       
       if (a>b){
           System.out.printf("A is greater than B");
           
       }
       if (a<b) {
           System.out.printf("B is greater than A");
       }
       else {
           
           System.out.printf("A is equal to B ");
       }
       
       }
    }
