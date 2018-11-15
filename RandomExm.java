import java.util.*;
public class RandomExm{
    public static void main(String args[]){

    Random d6,dice;
    d6=new Random();
	dice=new Random();
    double D;
     D=dice.nextDouble();
    System.out.println(d6.nextInt(6)+1+" "+D);
    System.out.println(d6);
    //example with seed
    dice.setSeed(1);
    d6.setSeed(1);
     D=dice.nextDouble();
    System.out.println(d6.nextInt(6)+1+" "+D);
    
       } 
} 