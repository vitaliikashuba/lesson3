public class Task4 {
    public static void main(String args[]) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = array.length - i;
            sum += array[i];

        }
        System.out.println("sum =" + sum);
    }

}

