class TurboCar extends Car{
	TurboCar(String d, int a, int f){
	super(d,a,f);
	}
	
	void goEast(){
		System.out.println(driver);
		super.goEast();
		super.goEast();
		super.goEast();
	}
	
	

}