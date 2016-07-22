public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		int rem=0;
		while(no!=0){
			 rem=no%10;
			no=no/10;
			
	System.out.println(rem);
		}

	}

}
