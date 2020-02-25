import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = new int[20];
        Random random = new Random();
        boolean unsortedArray = true;

        //int [] numbers = {10, 2, 7, 4};
        System.out.println("Unsorted array: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.print(numbers[i] + " ");
        }

        while (unsortedArray) {
            int transposition = 0;
            for (int i = 1; i < (numbers.length); i++) {
                if (numbers[i - 1] > numbers[i]) {
                    int bubble = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = bubble;
                    transposition++;
                }
            }
            if (transposition == 0) {
                unsortedArray = false;
                System.out.println(" ");
                System.out.println("Sorted array:");
                break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
