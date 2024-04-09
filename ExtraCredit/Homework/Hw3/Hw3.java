public class Hw3{

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 9, 5, 1, 4, 3 };
        sort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
