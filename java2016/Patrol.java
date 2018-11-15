//Patrol.java
public class Patrol{
	public static void main(String args[]){
		PatrolCar patoichiro;
		patoichiro= new PatrolCar("ƒpƒgˆê˜Y", 1, 10, false);
		patoichiro.printStatus();
		
		for(int i=0;i<2;i++){
			patoichiro.goEast();
		}
		patoichiro.printStatus();

		patoichiro.toggleSiren();
		for(int i=0;i<2;i++){
			patoichiro.goEast();
		}
		
		patoichiro.toggleSiren();
		patoichiro.refuel(6);
		patoichiro.printStatus();
	}
}