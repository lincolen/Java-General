//Car.java
import java.util.*;
class Car {
    //フィールド（各クラスのオブジェクトが個別に持つ変数たち）
    int address;
    String driver;
    int fuel;
    Random r;
    //コンストラクタ（クラス名と同じ名前のメソッド）
    //いくつかの引数をとり，フィールドの値を初期化する
    Car(String d, int a,int f){
        driver= d;
        address= a;
        fuel=f;
        System.out.println(driver+"は自動車に乗り込みました");
    }
 
    //一番地東に進むメソッド
    void goEast( )
    {
    		if(fuel<1)
    		{
    		  System.out.println(driver+"号は燃料を切って進めません");
    		}
    		else
    		{
      	 address++;
        	 fuel--;
        	 System.out.println(driver+"号は東に進みました．");
    		}
    }
    
    void goWest( )
    {
    		if(fuel<1)
    		{
    		  System.out.println(driver+"号は燃料を切って進めません");
    		}
    		else
    		{
    			if((address-1)<0)
    			{
    				System.out.println(driver+"号が道の端に付いて、進めません");
    			}
    			else
    			{	
      	 	address--;
        	 	fuel--;
        	 	System.out.println(driver+"号は西に進みました．");
    			}
    		}
    }
    
    void refuel(int g)
    {
    	fuel=fuel+g;;
    	System.out.println(driver+"号は燃料"+g+"リトルを補給しました");
    }
    
    int getAddress()
{
	return (address);
}
	
    
    //現在のオブジェクトの状態（つまりフィールドの値）を説明とともに表示するメソッド
    void printStatus(){
        System.out.println(driver+"号は"+address+"番地にいます．残りの燃料は"+fuel+"リトル");
    }
}


