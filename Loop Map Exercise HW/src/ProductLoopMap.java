import java.util.Arrays;
import java.util.Scanner;
public class ProductLoopMap {
   //Smallest 
   public static int getSmallest(int[] i, int size){  
      Arrays.sort(i);  
      return i[0];  
      }  
   public static int getLargest(int[] i, int size){  
      Arrays.sort(i);  
      return i[0];
      }

    public static void main(String args[]){

      System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int product = 1;
        int sum = 1;

      
      System.out.println("Enter five elements, one by one ");
      for(int i=0; i<size; i++) 
      {
         myArray[i] = s.nextInt();
         product = product * myArray[i];
         sum = product + myArray[i];
      }
       

      


      //Product of Array Elements
      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      System.out.println("Product of the elements of the array ::"+product);
      //Sum of Array Elements
      System.out.println("Sum of the elements of the array ::" +sum); 
      //Smallest number in Array
      System.out.println("Smallest number ::" +getSmallest(myArray,size));
      //Largest number in Array
      System.out.println("Largest number in array ::" +getLargest(myArray,size));


   }
}