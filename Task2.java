import java.util.*;

public class Task2 {

    public static void main (String args []){
        Scanner iscan = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int num1 = iscan.nextInt();
        System.out.println("Input 2nd number:");
        int num2 = iscan.nextInt();

        try{
            check(num2);
            int res = num1/num2;
            System.out.println(res);            
        }catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }finally{
            iscan.close();
        }
    }

    public static void check (int num) throws DivisionByZeroException{
        if(num ==  0){
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
    
}
