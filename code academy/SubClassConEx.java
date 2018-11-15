import packegeEx.*;
 
 public class SubClassConEx{
	
	public class SuperCl{
		int i = 0;		
	public SuperCl(){
			i = 1;
		}
	}
	
	public class SubCl extends SuperCl{
			
		public SubCl(){
			i = 2;
		}
	}
	
		public static void main(String[] args){
			SubClassConEx mainC = new SubClassConEx();
			SubClassConEx.SubCl sub = mainC.new SubCl();
			System.out.println(sub.i);
			PrintOne.print();
		}
	
}