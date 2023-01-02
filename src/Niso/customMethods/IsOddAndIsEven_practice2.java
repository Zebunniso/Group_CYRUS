package Niso.customMethods;

public class IsOddAndIsEven_practice2 {

    public static void main(String[] args) {

        System.out.println( isOdd(5) );
        System.out.println( isEven(6) );

    }

    public static boolean isOdd(int number){

        if(number%2 != 0 ){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int number){
        return !isOdd(number);
    }
}

/*
 White a method which can identifies given number is even or odd

 Ex:
     identify(5)==> "Odd"
     identify(6)==> "Even"
 */


