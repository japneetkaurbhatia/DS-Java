import java.util.*;
  
  public class Main{
      public static void gradingSystem(int m)
    {
        if(m > 90)
            System.out.println("excellent");
        else if(m > 80)
            System.out.println("good");
        else if(m > 70)
            System.out.println("fair");
        else if(m > 60)
            System.out.println("meets expectations");
        else
            System.out.println("below par");
    }
  
  public static void main(String[] args) {
      // input - don't change this code
      Scanner scn = new Scanner(System.in);
      int marks = scn.nextInt();
      // input - don't change this code
      
      // code here 
      gradingSystem(marks);
      }
  
   }