package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

            Integer[] testArr1 = {1, 2, 3, 4};
            System.out.print("First state of arr:");
            System.out.println(Arrays.toString(testArr1));
            SwapTwoArrayElements(testArr1, 1, 2);
            System.out.print("Swap:");
            System.out.println(Arrays.toString(testArr1));
            String[] testArr2 = {"1", "2", "3", "4"};
            System.out.print("First state of arr: ");
            System.out.println(Arrays.toString(testArr2));
            SwapTwoArrayElements(testArr2, 1, 2);
            System.out.print("Swap:");
            System.out.println(Arrays.toString(testArr2));


            ArrayList<Integer> listArr1 = new ArrayList();
            convertArrayToArrayList(listArr1, testArr1);
            System.out.print("Result Massiv to ArrayList:");
            System.out.println(listArr1);
            ArrayList<String> listArr2 = new ArrayList();
            convertArrayToArrayList(listArr2, testArr2);
            System.out.print("Result Massiv to ArrayList:");
            System.out.println(listArr2);
            System.out.println();



            Box box1 = new Box();

            box1.add(new Apple());
            box1.add(new Apple());
            box1.add(new Apple());

            System.out.println("Weight Box 1: " + box1.getWeight());

            Box box2 = new Box();

            box2.add(new Orange());
            box2.add(new Orange());
            box2.add(new Orange());

            System.out.println("Weight Box 2: " + box2.getWeight());

            System.out.println("Method compare() ");
            System.out.println("Box weights " + (box1.compare(box2) ? "the same" : "different") + ".");

            System.out.println(" Box1 : " + box1.getProduct().get(0).getClass().getSimpleName());
            // создаем дополнительно еще одну коробку с яблоками
            Box box3 = new Box();

            box3.add(new Apple());
            box3.add(new Apple());
            box3.add(new Apple());
            box3.add(new Apple());
            box3.add(new Apple());

            System.out.println("Weight Box 3: " + box3.getWeight());
            System.out.println(" Box3 : " + box3.getProduct().get(0).getClass().getSimpleName());

            box1.shiftSingleItem(box3);

            System.out.println("Weight Box 3: " + box3.getWeight());
            System.out.println("Weight Box 1: " + box1.getWeight());

            try {
                box2.shiftSingleItem(box3);
            } catch (BoxCustomException e) {
                System.out.println(e);
            }
            System.out.println("Weight Box 3: " + box3.getWeight());
            System.out.println("Weight Box 2: " + box2.getWeight());

            try {
                box3.add(new Orange());
                box3.add(new Orange());
                box3.add(new Orange());
            } catch (BoxCustomException e) {
                System.out.println(e);
            }
            System.out.println("Weight Box 3: " + box3.getWeight());


        }



    public static <T> void SwapTwoArrayElements(T[] modifiableArray, int elemNum1, int elemNum2) {
        T backupElement = modifiableArray[elemNum1];
        modifiableArray[elemNum1] = modifiableArray[elemNum2];
        modifiableArray[elemNum2] = backupElement;
    }


    public static <T> void convertArrayToArrayList(ArrayList<T> listArray, T[] convertedArray) {
        for (T elem : convertedArray) {
            listArray.add(elem);
        }
    }

}
