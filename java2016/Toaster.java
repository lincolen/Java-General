//Toaster.java
class Toaster{
    String owner;
    int bread;
    int minutes;
    int max;
    int powerMax;
    int bake;
    Toaster(String o, int m,int d) {
        owner= o;
        bread=0;
        minutes=0;
        max=m;
        powerMax=d;
        bake=0;
        System.out.println(owner+"�̓g�[�X�^�[���v���؂��Ĕ����܂����D"+powerMax+"�i�K�̔M�x�ݒ肪�����āA"
                        +max+"���̐H�p������x�ɏĂ��܂��D");
    }
     
    void addBread1(){
        if(bread<max){
            bread++;
            System.out.println(owner+"�̓p����1������܂����D");
        }else{
            System.out.println("�g�[�X�^�[�ɂ͂��������Ƃ���͂���܂���");      
        }
    }
     
    void heat(int h,int p){
    		if(0<p&&p<=powerMax){
    			minutes=minutes+h;
    			bake=bake+h*p;
    			System.out.println("�p���͔M�x�ݒ�"+p+"��"+h+"���Ă��܂���");
    		}
 		else System.out.println("�g�[�X�^�[�ɂ��̔M�x�ݒ�͂���܂���");   
    }
   
    int open(){
        int heated= 0;
        //"println"�łȂ���"print"�Ȃ̂ɒ��ӁDprint�̏ꍇ�͍Ō�̉��s�Ȃ��D
        System.out.print("�I�[�v���I");
        if(bake==(2*bread)){
            System.out.println("�����o���h���D"+owner+"�̓p����"
                            +bread+"�����ɏĂ��܂����D");
            heated=bread;
        }else{
            System.out.println("������[�D"+owner+"�̓p�����Ă��̂Ɏ��s���܂����D");
        }
        
        bread=0;
        minutes=0;
        bake=0;
        
        return(heated);
    }       
 
    void printStatus(){
        System.out.println(owner+"�̃g�[�X�^�[�ɂ̓p����"+bread
                        +"�������Ă��āC����܂ł�"+minutes+"���Ă��܂���.");
    }   
}