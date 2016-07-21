public class StringRev{

	public static void main(String[] args) {
		String str=args[0];
	
		System.out.println("enter the string");
	
		String reverse=" ";
		int length=str.length();
		for ( int i=length-1;i >=0;i--){
        reverse=reverse+str.charAt(i);
		}
	    System.out.println("Reverse of entered string is: "+reverse);

	}

}
