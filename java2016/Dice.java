//�t�@�C����Dice.java
import java.util.*;
public class Dice{
	public static void main(String args[]){
		Random dice;
		dice= new Random();
		System.out.println("�T�C�R����U��܂��D�����ł邩�ȁE�E�E");
		int value= dice.nextInt(6)+1;
		System.out.println(value+"���ł܂����I\n");

		System.out.println("�V�C�\����ł����D�����̓V�C�́E�E�E");
		double percentage= dice.nextDouble();
		if(percentage<0.8){
			System.out.println("����D�u�₩�ȏH����̈���ł��傤�D");
		}else{
			System.out.println("�J�̖͗l�ł��D�����������ďo�����܂��傤�D");
		}
	}
}