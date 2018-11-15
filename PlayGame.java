public class PlayGame{
	public static void main(String args[]){
		Person p= new Person();
		String a[]=new String[4];
		a[0]="no disk";
		a[1]="Dragon Fantasy";
		a[2]="Corprate fighter";
		a[3]="Speed Breaker";
		GameConsole console= new GameConsole(p.name,"PlaySwitch",3,a);
		while(true){
			console.status();
			if(console.power==false){
				System.out.println("\n 1:Turn system on 2: Go outside");
				switch(p.getInteger()){
					case 1: console.onOff();
					break;
					case 2: System.out.println("Due to nucluer fallout you can not go outside");				
				}			
			}
			else if(console.game==0){
				System.out.println("\n 1:Insert disk  2: Turn off console");
				switch(p.getInteger()){
					case 1: 
						System.out.println("Choose disk to insert 1:Dragon Fantasy  2: Corprate fighter 3:Speed Breaker");					
						console.switchDisk(p.getInteger());
					break;
					case 2: console.onOff();
				}		
			}
			else if(console.game==2){
				System.out.println("\n 1:Play game offline  2: Play game online 3:Eject Disk 4:Turn off console");	
				switch(p.getInteger()){
					case 1: 
						console.playGame();
						effect(console.game, console.gameSave[console.game]);
					break;
					case 2: console.playOnline();
					break;
					case 3: console.switchDisk(0);
					break;
					case 4: console.onOff();
				}		
			}
			else{
				System.out.println("\n 1:Play game   2:Eject Disk 3:Turn off console");	
				switch(p.getInteger()){
					case 1:
						console.playGame();
						effect(console.game, console.gameSave[console.game]);
					break;
					case 2: console.switchDisk(0);
					break;
					case 3: console.onOff();
				}
			}		
				
			
		}	
	}

	static void effect(int game,int prog)
	{
		String flaverText;
		if(game==1){
			switch(prog){
			case 1:
			flaverText="Youre freind was killed by the dark wizard. You embark on a quest of vengence along with your dragon soul mate ";
			break;
			case 2:
			flaverText="the wizerd controls the order of dark knights and you fought them one by one, in the anicent arena";
			break;
			case 3:
			flaverText="triumphant you rose, having bested the dark wizerd sending him back to the dark realm ";
			break;
			case 4:
			flaverText="in a shocking tweast it is reveled that the real master mind was actually the princess. setting up the sequal";
			break;
			default:
			flaverText="Having finshied the story, you simply roam around finshing the hundreds of side quests";
			}
		}
		else if(game==2){
			flaverText="You practiced youre combos aginest the CPU";
		}
		else{
			switch(prog){
				case 1:
				flaverText="As a once wanted crimnial you tray to remain low profile working 9 hour shifits at a rusty garage while praticipating in clandistaine street racing at night ";
				break;
				case 2:
				flaverText="youe work your up by raceing in the grand prix held by the mafia";
				break;
				case 3:
				flaverText="after some ups and downs and a lot of tuning you qualify for the finals with a chance of marrying the don's daughter which you adored for years ";
				break;
				case 4:
				flaverText="as you cross the finsih line, the tampered liquied nitrogen cylinder in your car explodes, leaveing no trace of you are your prized car ";
				break;
				default:
				flaverText="The story being over, you contiune racing in the memery of the dons daughter";
			}
		}
		System.out.println(flaverText);
	}
}