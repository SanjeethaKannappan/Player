public class RevNum {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int result=0;
		while(n!=0){
			 result=n%10;
			n=n/10;
			
	System.out.println(result);
		}

	}

}
