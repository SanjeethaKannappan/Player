import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		while((n !=2 && n% 2 == 0) ){
          n= n /2;
         }
		 if(n%2==0){
       	  System.out.println("It is the power of two");
         }
		 else{
       	  System.out.println("Its is not the power of two");
         }
        
  }
}
