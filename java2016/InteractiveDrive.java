//InteractiveDrive.java
//Person.class�𓯂��f�B���N�g���ɂ����ăR���p�C�����Ă�������
public class InteractiveDrive{
	public static void main(String args[]){
		//Person�N���X�̃I�u�W�F�N�g���쐬���C�ϐ�p�ɑ��
		//Person p= new Person("���");
		Person p= new Person();
		//Car�N���X�̃I�u�W�F�N�g���C�^�]�Җ���p��name�ŏ��������C�ϐ�c�ɑ��
		Car c= new Car(p.name, 3, 2);

		//�ȉ������X�J��Ԃ��i�����I�����鎞��"CTRL+c"�j
		while(true){
			//�Ԃ̏�Ԃ�\��
			c.printStatus();
			//�ł��邱�ƈꗗ��\��
			System.out.println("0:���ցC1:���ցC2:�����i2L�j");
			//��؂��񂩂�w�����󂯎��C�����^�̕ϐ�a�ɑ��
			int a= p.getInteger();
			//a�̒l�ɉ����ď�������
			switch(a){
				//a��0�Ȃ�D�D�D
				case 0: 
					c.goEast();
					break;
				case 1:
					c.goWest();
					break;
				case 2:
					c.refuel(2);
			}
		}
	}
}

