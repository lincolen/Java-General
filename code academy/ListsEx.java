import java.util.ArrayList;
import java.util.LinkedList;

public class ListsEx{
	public static void main(String[] args){
		//create and manage an array list
		ArrayList<Integer> arrayL =new ArrayList<Integer>();
		for(int i=2;i<=10;i+=2){
			arrayL.add(i);
		}
		for(int in : arrayL){
			System.out.println(in);
		}
		
		//create and manage a linked list
			LinkedList<Integer> linkedL =new LinkedList<Integer>();
		for(int i=1;i<=10;i+=2){
			linkedL.add(i);
		}
		for(int in : linkedL){
			System.out.println(in);
		} 
		
	}
}