//BreadHeating.java
public class BreadHeating{
    public static void main(String args[]){
        Toaster eliram=new Toaster("�p���D���G������", 2,3);
       eliram.printStatus();
       eliram.addBread1();
       eliram.addBread1();
       eliram.addBread1();
       eliram.heat(4,5);
       eliram.heat(4,2);
       eliram.printStatus();
       eliram.open();
         
        Toaster barak= new Toaster("�R���D���o���N",4,5);
        
        for(int i=0;i<3;i++){
           barak.addBread1();
        };
       barak.heat(2,3);
       barak.open();
        
    }
} 