
public class EnumEx{
	static enum RANKS {Soldier, Sergent, Major};
	
	public static void main(String args[]){
		RANKS member1 = RANKS.Soldier;
		System.out.println(member1);
		
		for(RANKS rank : RANKS.values()){
			System.out.print(rank);
		}
	}
	

}