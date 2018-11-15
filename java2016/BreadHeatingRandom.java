//BreadHeatingRandom.java
import java.util.*;
public class BreadHeatingRandom{
    public static void main(String args[]){
        Toaster eliram=new Toaster("エリラム", 2);
        int amount= 0;
        Random r= new Random();
        //ここにコードを追加
        for(int i=0;i<4;i++){
       		eliram.addBread1();
       		eliram.addBread1();
       		eliram.heat(r.nextInt(3)+3);	
       		amount=(amount+eliram.open());
        }
        	System.out.println("ちゃんっと温めたパンの枚数は："+amount+"枚");
    }
}