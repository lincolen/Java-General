//Drive.java
public class Drive{
    public static void main(String args[]){
        //��������Y���𐶐����邽�߂̎葱��
        //��Y���̃I�u�W�F�N�g���������߂�Car�N���X�̕ϐ�ichiro���`
        Car ichiro,nijiro;
        int i;
        //Car�N���X�̃I�u�W�F�N�g��new�Ő������C�R���X�g���N�^�Ńt�B�[���h��������
        //���̏ꍇ�C�^�]�Җ�����Y�C������Ԓn��2�Ԓn�Ƃ���
        ichiro= new Car("batmobile", 0,20);
        nijiro= new Car("bumblebee", 4,5);
        //��Y�̌��݂̏�Ԃ�\��
        ichiro.printStatus();
        nijiro.printStatus();
        //��Y�𓌂Ɉ�Ԓn�i�߂�
       for(i=0;i<4;i++)
       {
       	ichiro.goEast();
       	nijiro.goWest();
       	if(ichiro.getAddress()==nijiro.getAddress()) System.out.println("�₟"+ichiro.getAddress()+"�Ԓn�ŉ�Ȃ�Ċ������");
      
       }
       ichiro.refuel(6);
       
       for(i=0;i<5;i++)
       {
       	ichiro.goWest();
       }	
        
        ichiro.printStatus();
        nijiro.printStatus();
    }
}

