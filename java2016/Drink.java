//Drink.java
public class Drink{
    public static void main(String args[]){
        VendingMachine hokubu= new VendingMachine("äwçZ",10);
        hokubu.printStatus();
 
        hokubu.insert(100);
        hokubu.insert(10);
        hokubu.insert(15);
        hokubu.buyCoke();
        hokubu.insert(10);
        hokubu.buyCoke();
 
        hokubu.printStatus();
    }
}