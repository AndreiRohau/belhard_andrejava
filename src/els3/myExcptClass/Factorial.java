package els3.myExcptClass;

/**
 * Created by rohau.andrei on 26.04.2017.
 */
class Factorial{

    public static int getFactorial(int num) throws FactorialException{
        int result = 1;
        if(num < 1) throw new FactorialException("Число не может быть меньше 1", num);
        for(int i = 1; i <= num; i++){

            result *= i;
        }
        return result;
    }
}

