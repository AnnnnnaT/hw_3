import java.util.*;

class Task1{

public static void main (String args[]){
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Input number: ");
    int num = iScanner.nextInt();
  
    try{
        check(num);
        System.out.println( "Число корректно");
    }catch(InvalidNumberException ex){
        System.out.println(ex.getMessage());
    }finally{
        iScanner.close();
    }
    
}

public static void check(int num) throws InvalidNumberException {
    if(num <=0){
        throw new InvalidNumberException ( "Некорректное число");
    }
}
}