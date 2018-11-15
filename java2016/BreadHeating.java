//BreadHeating.java
public class BreadHeating{
    public static void main(String args[]){
        Toaster eliram=new Toaster("パン好きエリラム", 2,3);
       eliram.printStatus();
       eliram.addBread1();
       eliram.addBread1();
       eliram.addBread1();
       eliram.heat(4,5);
       eliram.heat(4,2);
       eliram.printStatus();
       eliram.open();
         
        Toaster barak= new Toaster("コメ好きバラク",4,5);
        
        for(int i=0;i<3;i++){
           barak.addBread1();
        };
       barak.heat(2,3);
       barak.open();
        
    }
} 