package lad3.ss7;
// Snippet 2
public class Calculator {
    public void add(int num1, int num2){
        int num3;
        num3 = num2+num1;
        System.out.println("result after addition is " + num3);
    }

    public  void sub(int num1, int num2){
        int num3;
        num3 = num1 - num2;
        System.out.println("result after Subtraction is " + num3);
    }

    public  void mul(int num1, int num2){
        int num3;
        num3 = num1 * num2;
        System.out.println("result after Mutiplication is " + num3);
    }

    public  void div(int num1, int num2){
        int num3;
        num3 = num1/ num2;
        System.out.println("result after division is " + num3);
    }

    public static void main(String[] args) {
        Calculator ojbCalc= new Calculator();

        ojbCalc.add(3,4);
        ojbCalc.mul(3,4);
    }
}
