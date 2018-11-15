//ファイル名Dice.java
import java.util.*;
public class Dice{
	public static void main(String args[]){
		Random dice;
		dice= new Random();
		System.out.println("サイコロを振ります．何がでるかな・・・");
		int value= dice.nextInt(6)+1;
		System.out.println(value+"がでました！\n");

		System.out.println("天気予報もできるよ．明日の天気は・・・");
		double percentage= dice.nextDouble();
		if(percentage<0.8){
			System.out.println("晴れ．爽やかな秋晴れの一日でしょう．");
		}else{
			System.out.println("雨の模様です．かさを持って出かけましょう．");
		}
	}
}