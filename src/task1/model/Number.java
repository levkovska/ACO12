package task1.model;

/*Написать класс число.
        - сложение
        - вычитание
        - умножение
        - деление
        - возведение в степень
        - вычисление факториала
        - вычисление остатка от деления
        - метод который сравнивает два числа */

/**
 * Created by levo on 24.03.16.
 */
public class Number {

    public int num1;
    public int num2;

    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int Addition(){
        return num1 + num2;
    }

    public int Subtraction(){
        return num1 - num2;
    }

    public int Multiplication(){
        return num1 * num2;
    }

    public int Division(){

        return num1 / num2;
    }

    public int Involution(){
        return (int) Math.pow(num1, num2);
    }

    public int Factorial(){
        int res = 1;
        for (int i = 1; i <= num1; i++) {
            res = res*i;
        }
        return res;
    }


    public int Residue(){
        return num1 % num2;
    }

    public void Comparison(){
        if (num1 > num2)
            System.out.println(num1+" is bigger");
        else if (num2 > num1)
            System.out.println(num2+" is bigger");
        else
            System.out.println(num1+" and"+num2+" are equal");

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
