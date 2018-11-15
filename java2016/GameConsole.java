import java.util.*;
public class GameConsole{
String owner,sysName,gameName[];
boolean power;
int game,gameSave[],gameSkill[];
Random R;

GameConsole(String o,String s, int g,String a[]){
	owner=o;
	sysName=s;
	game=g;
	power=false;
	gameName= new String[g+1];
	gameSave=new int[g+1];
	gameSkill=new int[g+1];
	for(int i=0;i<=g;i++){
		gameSave[i]=0;
		gameSkill[i]=0;
		gameName[i]=a[i];
	}
	R=new Random();
	game=0;
}

void onOff(){
	if(power==false){		
		System.out.println("BZZZT \"Wellcome to " +sysName+" enterteinment system\"") ; 
	}
	else{
		System.out.println("\"Please come to play again\"");  
	}
	power=!power;
}

void switchDisk(int d){
	if(d==0)	System.out.println("You have ejected the disk");
	else System.out.println("You have inserted the disk for "+gameName[d] );
	game=d;
}

void playGame(){
	String lvl="";
	gameSave[game]++;
	if(gameSkill[game]==0){
		if(R.nextDouble()>=0.3){
			gameSkill[game]++;
			lvl="you feel youre skill in the game has improved";
		}
	}
	else if(gameSkill[game]==1){
		if(R.nextDouble()>=0.5) {
			gameSkill[game]++;
			lvl="you feel youre skill in the game has improved";
		}
	}	
	else if(gameSkill[game]==2){
		if(R.nextDouble()>=0.8){
			gameSkill[game]++;
			lvl="you feel youre skill in the game has improved";
		}
	}
	System.out.println("You have played the game for a while "+lvl);	
}	

void playOnline(){
	int opp=R.nextInt(4);
	System.out.println("you look for a match online");
	switch(opp){
		case 0: System.out.println("You encounter a weak player");
		break;
		case 1: System.out.println("You encounter an intermediate player");
		break;
		case 2: System.out.println("You encounter an advenced player");
		break;
		case 3: System.out.println("You encounter a legendery  player");
	}
	if(opp<gameSkill[game]) System.out.println("You won easly");
	else if(opp>gameSkill[game]) System.out.println("You lost badly");
	else{
		System.out.print("It was a close match but you have ");
		if(R.nextInt(1)==1) System.out.println("won");
		else System.out.println("lost");
	}						
}	
	
void status(){
	String a,b="";
	if(power==true)a="on";
	else a="off";
	if(game!=0){
		switch(gameSave[game]){
			case(0): b="you havent started the game yet";
			break;
			case(1): b="you played it a bit";
			break;
			case(2): b="youve played it  a good amount";
			break;
			default: b="youve played it a lot";
		}
	}
	System.out.println(sysName+" is turned "+a+",  "+gameName[game]+" is currently inserted to the disk drive, "+b);
}
			
}			
