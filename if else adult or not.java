import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int age=sc.nextInt();
       if (age>18){
           System.out.printf("Adult");
       }
       else {
           System.out.printf("Not Adult");
       }
       
       }
    }