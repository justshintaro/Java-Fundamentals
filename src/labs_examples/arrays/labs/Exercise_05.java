package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int[] list = new int[20];

        for (int i = 0; i < list.length; i++ ){

            list[i] = i*i;

        }

        for (int val: list){
            System.out.print(val+" ");
        }

        System.out.println("");

        for (int rev = list.length-1; rev>=0; rev-=2){

            System.out.print(list[rev]+" ");



        }

    }

}
