//PatrolCar.java
//Carクラスを継承したPatrolCarクラスを作成
class PatrolCar extends Car{
	
	//boolian型はtrueかfalseのどちらかの値のみをとる
	boolean siren;
     
    //このクラスのコンストラクタ
	PatrolCar(String d, int a, int f, boolean s){
		//super()は親クラス（この場合はCar）のコンストラクタと同じ中身の関数
		super(d, a, f);
		siren= s;
		System.out.println("実はパトカーです．");
	}

	//サイレンのスイッチのオンオフを切り替える
	void toggleSiren(){
		if(siren==false){
			siren= true;
			System.out.println(driver+"号「緊急事態発生！"+address+"番地から急行します！」");
		}else{
			siren= false;
			System.out.println(driver+"号「"+address+"番地に到着！サイレン停止！」");
		}
	}
    
	//一番地東に進むメソッド	
	void goEast(){
		if(siren==true){
			System.out.println(driver+"号「ピーポーピーポー」");
			super.goEast();
		}
		super.goEast();		
	}
}