
public class ExeptionThrowEx{
	private void div(int b) throws ArithmeticException{
		if(b == 0){ 
			throw new ArithmeticException("divide by by zero");
		}else{
		System.out.println(10/b);
		}
	}
	
	public static void main(String[] args){
		int b = 0;
		ExeptionThrowEx example = new ExeptionThrowEx();
		try{
		  example.div(b);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(" now its over");
	}
}