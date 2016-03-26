package task1.test;
import task1.model.Number;

/**
 * Created by levo on 26.03.16.
 */
public class TestNumber {
    public static void main(String[] args) {

        Number value = new Number(3,2);
        System.out.println("the result of addition is: "+value.Addition());

        System.out.println("the result of Subtraction is: "+value.Subtraction());

        System.out.println("the result of Multiplication is: "+value.Multiplication());

        System.out.println("the result of Division is: "+value.Division());

        System.out.println("the result of Involution is: "+value.Involution());

        int temp = value.getNum1();
        System.out.println("Factorial of "+temp+" is: "+value.Factorial());

        System.out.println("the result of Residue is: "+value.Residue());

        value.Comparison();
    }
}
