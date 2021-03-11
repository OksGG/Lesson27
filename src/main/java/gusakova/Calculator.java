package gusakova;


public class Calculator {


    public static int plus ( int a, int b){
        int plus = a + b;
        return plus;
    }

    public static double minus ( double a, double b){
        double minus = a - b;
        return minus;
    }


    public static double multiply ( double a, double b){
        double multipl = a * b;
        return multipl;
    }

    public static double division ( double a, double b){
        double division = (double) a / b;
        if (b==0){
            System.out.println("Ошибка: нельзя делить на 0");
        }
        return division;


    }

    public static double percent ( int a, int b){
        int q = a / 100;
        int percent = q * b;
        return percent;
    }



    public static void main(String[] args) {

        System.out.println(plus(1, 2));
        System.out.println(minus(3.6, 1));
        System.out.println(multiply(1.2, 4));
        System.out.println(division(3.0, 1.0));
        System.out.println(percent(200, 10));

    }
}