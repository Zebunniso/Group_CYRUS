package Niso.IfStatements;

public class Finra_practice1 {

    public static void main(String[] args) {

        int number = 15;
        String result = "";

        if(number%3==0 && number%5==0){
            result = "FINRA";
        } else if(number%5==0){
            result = "RA";
        }else if(number%3 ==0){
            result = "FIN";
        }else{
            result = ""+number;
        }

        // System.out.println("result = " + result);
        System.out.println(result);
    }
}

/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.

 */


