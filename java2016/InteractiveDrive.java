//InteractiveDrive.java
//Person.classを同じディレクトリにおいてコンパイルしてください
public class InteractiveDrive{
	public static void main(String args[]){
		//Personクラスのオブジェクトを作成し，変数pに代入
		//Person p= new Person("鈴木");
		Person p= new Person();
		//Carクラスのオブジェクトを，運転者名をpのnameで初期化し，変数cに代入
		Car c= new Car(p.name, 3, 2);

		//以下を延々繰り返す（強制終了する時は"CTRL+c"）
		while(true){
			//車の状態を表示
			c.printStatus();
			//できること一覧を表示
			System.out.println("0:東へ，1:西へ，2:給油（2L）");
			//鈴木さんから指示を受け取り，整数型の変数aに代入
			int a= p.getInteger();
			//aの値に応じて条件分岐
			switch(a){
				//aが0なら．．．
				case 0: 
					c.goEast();
					break;
				case 1:
					c.goWest();
					break;
				case 2:
					c.refuel(2);
			}
		}
	}
}

