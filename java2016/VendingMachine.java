//VendingMachine.java
class VendingMachine {
   int coke,money,sales;
   String place;
   
 
    VendingMachine(String p, int c){
 	coke=c;
 	place=p;
 	money=0;
 	sales=0;    
        System.out.println(place+"‚É©”Ì‹@‚ğİ’u‚µ‚Ü‚µ‚½");
    }
 
    void insert(int g){
    	if(g==100||g==10)
    	{
       money=money+ g;
        System.out.println("“Š“ü‹àŠz‚Í"+money+"‰~‚Å‚·D");
    	}   
     else
     {
     	System.out.println("‚±‚Ì”Ì”„‹@‚Í‚P‚O‚O‰~‚Æ‚P‚O‰~‚¾‚Ü‚¾‚¯‚ğó‚¯‚Ü‚·");	           
    
   	}
     } 
    void insert10(){
       money=money+ 10;
        System.out.println("“Š“ü‹àŠz‚Í"+money+"‰~‚Å‚·D");       
    }
 
    void buyCoke(){
        if(coke==0){
            System.out.println("”„‚èØ‚ê‚Å‚·");
        }else{
            if(money>=120){
                System.out.println("ƒKƒ`ƒƒƒ“D‚¨”ƒ‚¢ã‚°‚ ‚è‚ª‚Æ‚¤‚²‚´‚¢‚Ü‚µ‚½D");
                sales+= 120;
                money-= 120;
                coke--;
            }else{
                System.out.println("‚¨‹à‚Í‘«‚è‚Ü‚¹‚ñ");
            }
        }
    }
 
	void change()
	{
		System.out.println("‚¨‚Â‚è‚ğ•Ô‚µ‚Ü‚·");
		money=0;
	}
		
    void printStatus(){
        System.out.println("”Ì”„‹@‚Éc‚Á‚Ä‚¢‚éƒRƒ‰"+coke+"ŒÂ@”„ã‡Œv‹àŠz‚Í"+sales);
    }
}