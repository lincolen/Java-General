//VendingMachine.java
class VendingMachine {
   int coke,money,sales;
   String place;
   
 
    VendingMachine(String p, int c){
 	coke=c;
 	place=p;
 	money=0;
 	sales=0;    
        System.out.println(place+"�Ɏ��̋@��ݒu���܂���");
    }
 
    void insert(int g){
    	if(g==100||g==10)
    	{
       money=money+ g;
        System.out.println("�������z��"+money+"�~�ł��D");
    	}   
     else
     {
     	System.out.println("���̔̔��@�͂P�O�O�~�ƂP�O�~���܂������󂯂܂�");	           
    
   	}
     } 
    void insert10(){
       money=money+ 10;
        System.out.println("�������z��"+money+"�~�ł��D");       
    }
 
    void buyCoke(){
        if(coke==0){
            System.out.println("����؂�ł�");
        }else{
            if(money>=120){
                System.out.println("�K�`�����D�������グ���肪�Ƃ��������܂����D");
                sales+= 120;
                money-= 120;
                coke--;
            }else{
                System.out.println("�����͑���܂���");
            }
        }
    }
 
	void change()
	{
		System.out.println("�����Ԃ��܂�");
		money=0;
	}
		
    void printStatus(){
        System.out.println("�̔��@�Ɏc���Ă���R��"+coke+"�@���㍇�v���z��"+sales);
    }
}