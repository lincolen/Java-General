//BreadHeatingRandom.java
import java.util.*;
public class BreadHeatingRandom{
    public static void main(String args[]){
        Toaster eliram=new Toaster("�G������", 2);
        int amount= 0;
        Random r= new Random();
        //�����ɃR�[�h��ǉ�
        for(int i=0;i<4;i++){
       		eliram.addBread1();
       		eliram.addBread1();
       		eliram.heat(r.nextInt(3)+3);	
       		amount=(amount+eliram.open());
        }
        	System.out.println("�������Ɖ��߂��p���̖����́F"+amount+"��");
    }
}