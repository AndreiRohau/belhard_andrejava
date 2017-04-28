package task21.log4j.trial;

/**
 * Created by rohau.andrei on 26.04.2017.
 */
class Factorial{

    public static int getFactorial(int num) throws FactorialException {

        int result = 1;
        if(num < 1) throw new FactorialException("Число не может быть меньше 1", num);

        for(int i = 1; i <= num; i++){

            result *= i;
        }
        return result;
    }
}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){

        super(message);
        number = num;
    }
}