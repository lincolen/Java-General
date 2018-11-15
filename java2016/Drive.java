//Drive.java
public class Drive{
    public static void main(String args[]){
        //ここが一郎号を生成するための手続き
        //一郎号のオブジェクトを扱うためのCarクラスの変数ichiroを定義
        Car ichiro,nijiro;
        int i;
        //Carクラスのオブジェクトをnewで生成し，コンストラクタでフィールドを初期化
        //この場合，運転者名を一郎，今いる番地を2番地とする
        ichiro= new Car("batmobile", 0,20);
        nijiro= new Car("bumblebee", 4,5);
        //一郎の現在の状態を表示
        ichiro.printStatus();
        nijiro.printStatus();
        //一郎を東に一番地進める
       for(i=0;i<4;i++)
       {
       	ichiro.goEast();
       	nijiro.goWest();
       	if(ichiro.getAddress()==nijiro.getAddress()) System.out.println("やぁ"+ichiro.getAddress()+"番地で会うなんて奇遇だね");
      
       }
       ichiro.refuel(6);
       
       for(i=0;i<5;i++)
       {
       	ichiro.goWest();
       }	
        
        ichiro.printStatus();
        nijiro.printStatus();
    }
}

