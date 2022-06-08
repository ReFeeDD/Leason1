package Lesson2;
import java.util.Arrays;

public class Lesson2 {
    static String[][] Array = {{"1","1", "2", "3", "4"}, {"7", "6", "7", "8"}, {"9", "1", "7", "8"}, {"5", "6", "7", "8"}};
    static String[][] Array2 = {{"1", "1", "1", "1"}, {"1", "3", "1", "1"}, {"1", "L", "1", "1"}, {"1", "1", "1", "1"}};

    static int Vertical = 4;
    static int Horizontal = 4;

    public static void main(String[] args) {
        arr1();
        try {
           System.out.println("Massiv sum : " + getSumm(Array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    try {
        System.out.println("Massiv sum : " + getSumm(Array2));
    } catch (MyArraySizeException | MyArrayDataException e) {
        System.out.println(e.getMessage());
    }
}

    static void Massiv(String[][] Array) throws MyArraySizeException {
        if (Array.length != Vertical || Array[0].length != Horizontal) throw new MyArraySizeException();
    }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("Error length");

        }
    }
    static Integer getSumm(String[][] array) throws MyArraySizeException, MyArrayDataException {
        Massiv(array);
        Integer result = 0;
        int i =0;
        int j =0;
        try {
            for (; i < array.length; i++) {
                j =0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new  MyArrayDataException("Error in Position " + i+","+j);
        }


        return result;
    }
    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            super(message);
        }
    }
    public static void arr1() {
        for (int i = 0; i < Array2.length; i++) {
            for (int j = 0; j < Array2.length; j++) {

                System.out.print(Array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    }



