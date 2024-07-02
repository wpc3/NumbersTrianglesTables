package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String s = "";

        for (int i= start; i < stop; i= i + 1){
           if (isEven(i))
               s = s + Integer.toString(i);
        }


        return s;
    }

    static boolean isEven(int i){
        return (i% 2 ==0);
    }
    public static String getOddNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i = i + 1) {
            if (isEven(i) == false) {
                s = s + Integer.toString(i);
            }





        }
        return s;
    }


    public static String getSquareNumbers(int start, int stop, int step) {




        return getExponentiations(start, stop, step, 2);
    }
    //start?
    //changed from start to stop
    public static String getRange(int stop) {

        String s = "";

        for (int i=0; i < stop; i++){
            s = s + Integer.toString(i);
        }

        return s;
    }

    public static String getRange(int start, int stop) {



        return getExponentiations(start, stop, 1, 1);
    }


    public static String getRange(int start, int stop, int step) {



        return getExponentiations(start, stop, step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String s = "";

        for (int i= start; i < stop; i= i + step){
            s = s + Integer.toString((int)Math.pow(i, exponent));
        }


        return s;
    }
}
