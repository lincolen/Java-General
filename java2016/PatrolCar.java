//PatrolCar.java
//Car�N���X���p������PatrolCar�N���X���쐬
class PatrolCar extends Car{
	
	//boolian�^��true��false�̂ǂ��炩�̒l�݂̂��Ƃ�
	boolean siren;
     
    //���̃N���X�̃R���X�g���N�^
	PatrolCar(String d, int a, int f, boolean s){
		//super()�͐e�N���X�i���̏ꍇ��Car�j�̃R���X�g���N�^�Ɠ������g�̊֐�
		super(d, a, f);
		siren= s;
		System.out.println("���̓p�g�J�[�ł��D");
	}

	//�T�C�����̃X�C�b�`�̃I���I�t��؂�ւ���
	void toggleSiren(){
		if(siren==false){
			siren= true;
			System.out.println(driver+"���u�ً}���Ԕ����I"+address+"�Ԓn����}�s���܂��I�v");
		}else{
			siren= false;
			System.out.println(driver+"���u"+address+"�Ԓn�ɓ����I�T�C������~�I�v");
		}
	}
    
	//��Ԓn���ɐi�ރ��\�b�h	
	void goEast(){
		if(siren==true){
			System.out.println(driver+"���u�s�[�|�[�s�[�|�[�v");
			super.goEast();
		}
		super.goEast();		
	}
}