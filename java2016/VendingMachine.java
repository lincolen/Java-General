//VendingMachine.java
class VendingMachine {
   int coke,money,sales;
   String place;
   
 
    VendingMachine(String p, int c){
 	coke=c;
 	place=p;
 	money=0;
 	sales=0;    
        System.out.println(place+"に自販機を設置しました");
    }
 
    void insert(int g){
    	if(g==100||g==10)
    	{
       money=money+ g;
        System.out.println("投入金額は"+money+"円です．");
    	}   
     else
     {
     	System.out.println("この販売機は１００円と１０円だまだけを受けます");	           
    
   	}
     } 
    void insert10(){
       money=money+ 10;
        System.out.println("投入金額は"+money+"円です．");       
    }
 
    void buyCoke(){
        if(coke==0){
            System.out.println("売り切れです");
        }else{
            if(money>=120){
                System.out.println("ガチャン．お買い上げありがとうございました．");
                sales+= 120;
                money-= 120;
                coke--;
            }else{
                System.out.println("お金は足りません");
            }
        }
    }
 
	void change()
	{
		System.out.println("おつりを返します");
		money=0;
	}
		
    void printStatus(){
        System.out.println("販売機に残っているコラ"+coke+"個　売上合計金額は"+sales);
    }
}