import java.util.*;

public class Task3 {
    
    public static void main (String args[]){

        Scanner iscan = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int num1 = iscan.nextInt();
        System.out.println("Input 2nd number:");
        int num2 = iscan.nextInt();
        System.out.println("Input 3rd number: ");
        int num3 = iscan.nextInt();
       
        try {
            check(num1, num2, num3);
            System.out.println("Проверка пройдена успешно");
        }catch (NumberOutOfRangeException ex) {
            System.out.println(ex.getMessage());
        }catch(NumberSumException ex ){
            System.out.println(ex.getMessage());
        }catch(DivisionByZeroException ex ){
            System.out.println(ex.getMessage());
        }finally{
            iscan.close();
        }
    }


    public static void check (int num1, int num2, int num3) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if(num1 > 100 ){
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if(num2 < 0){
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if(num1 + num2 < 10){
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if(num3 == 0){
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}

