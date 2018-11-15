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
        System.out.println(owner+"はトースターを思い切って買いました．"+powerMax+"段階の熱度設定があって、"
                        +max+"枚の食パンが一度に焼けます．");
    }
     
    void addBread1(){
        if(bread<max){
            bread++;
            System.out.println(owner+"はパンを1枚入れました．");
        }else{
            System.out.println("トースターにはもう入れるところはありません");      
        }
    }
     
    void heat(int h,int p){
    		if(0<p&&p<=powerMax){
    			minutes=minutes+h;
    			bake=bake+h*p;
    			System.out.println("パンは熱度設定"+p+"で"+h+"分焼きました");
    		}
 		else System.out.println("トースターにこの熱度設定はありません");   
    }
   
    int open(){
        int heated= 0;
        //"println"でなくて"print"なのに注意．printの場合は最後の改行なし．
        System.out.print("オープン！");
        if(bake==(2*bread)){
            System.out.println("いい出来栄え．"+owner+"はパンを"
                            +bread+"枚上手に焼きました．");
            heated=bread;
        }else{
            System.out.println("あちゃー．"+owner+"はパンを焼くのに失敗しました．");
        }
        
        bread=0;
        minutes=0;
        bake=0;
        
        return(heated);
    }       
 
    void printStatus(){
        System.out.println(owner+"のトースターにはパンが"+bread
                        +"枚入っていて，これまでに"+minutes+"分焼きました.");
    }   
}