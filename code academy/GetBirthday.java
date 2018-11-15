import java.util.*;

class GetBirthday{
  public static void main(String[] args){
	boolean exit = false; 
    Scanner scanner;
    String input;
    scanner =new Scanner(System.in);
    
    while(!exit){
      System.out.println("what is your birthday , enter 'q' to quit");
      
      input = scanner.nextLine();
      input.trim();
      if(input.equals("q")){
        exit=true;
      }else{
       System.out.println("youre birth day is: " + input );
       
      }
    }
    scanner.close();
  }
}

