//Car.java
import java.util.*;
class Car {
    //�t�B�[���h�i�e�N���X�̃I�u�W�F�N�g���ʂɎ��ϐ������j
    int address;
    String driver;
    int fuel;
    Random r;
    //�R���X�g���N�^�i�N���X���Ɠ������O�̃��\�b�h�j
    //�������̈������Ƃ�C�t�B�[���h�̒l������������
    Car(String d, int a,int f){
        driver= d;
        address= a;
        fuel=f;
        System.out.println(driver+"�͎����Ԃɏ�荞�݂܂���");
    }
 
    //��Ԓn���ɐi�ރ��\�b�h
    void goEast( )
    {
    		if(fuel<1)
    		{
    		  System.out.println(driver+"���͔R����؂��Đi�߂܂���");
    		}
    		else
    		{
      	 address++;
        	 fuel--;
        	 System.out.println(driver+"���͓��ɐi�݂܂����D");
    		}
    }
    
    void goWest( )
    {
    		if(fuel<1)
    		{
    		  System.out.println(driver+"���͔R����؂��Đi�߂܂���");
    		}
    		else
    		{
    			if((address-1)<0)
    			{
    				System.out.println(driver+"�������̒[�ɕt���āA�i�߂܂���");
    			}
    			else
    			{	
      	 	address--;
        	 	fuel--;
        	 	System.out.println(driver+"���͐��ɐi�݂܂����D");
    			}
    		}
    }
    
    void refuel(int g)
    {
    	fuel=fuel+g;;
    	System.out.println(driver+"���͔R��"+g+"���g����⋋���܂���");
    }
    
    int getAddress()
{
	return (address);
}
	
    
    //���݂̃I�u�W�F�N�g�̏�ԁi�܂�t�B�[���h�̒l�j������ƂƂ��ɕ\�����郁�\�b�h
    void printStatus(){
        System.out.println(driver+"����"+address+"�Ԓn�ɂ��܂��D�c��̔R����"+fuel+"���g��");
    }
}


