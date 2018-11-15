public class ThreadEx{
	

	
	public static void main(String[] args){
		ExtndThread extd1 = new ExtndThread();
		extd1.setPriority(5);
		Thread implementThread = new Thread(new ImplementThread());
		implementThread.setPriority(5);
		extd1.start();
		implementThread.start();
		System.out.println("notice this occurs before the new threads");
	}


}

	class ExtndThread extends Thread{
		
	
		
		public void run(){
		//	for(int i=0;i<10;i++){
	while(true){
				System.out.print("1");
				try{
				this.sleep(1000);
				}catch(Exception e){
					System.out.println("it didnt work");
				}
			}
		}
	}
	
class ImplementThread implements Runnable{

	
		public void run(){
		//	for(int i=0;i<10;i++){
	while(true){
				System.out.print("0");
			}
		}
}
	