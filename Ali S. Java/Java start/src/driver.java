import java.util.Random;
import java.util.Scanner;


public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x = 5;
      char c = 4;
      boolean is = true;
      double was = 4.0; 
      if(x<7)
      {
    	 System.out.println(x); 
      }
      else if (x<8)
      {
    	  
      }
      
      while(true)
      {
    	  System.out.println(x<8);
    	  break;
      }
      
	  Random name = new Random();
	 
	  System.out.println( name.nextInt()); 
	
	  Scanner scan = new Scanner (System.in); 
	  int i = scan.nextInt();
	  String pie = scan.nextLine();
	  
	 Tiger Ali = new Tiger();
	 Ali.setWeightinlbs(670); 
	  
	 int[] arr =new int[10];
	 
	 Tiger[] coolTiger = new Tiger [15];
	 for(i=0;i<coolTiger.length ;i++)
	 {
		 coolTiger[i] = new Tiger();
	 }
	}

}
