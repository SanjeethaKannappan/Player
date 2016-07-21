public class Factorial {
	int fa =1;
    public int check(int n){
    	for(int i=1;i<=n;i++){
    		fa= fa*i;	
    	}
    	return fa;
    }
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
	    Factorial ob = new Factorial();
		System.out.println(ob.check(n));
		s.close();
	}
}
