public class Task3 {

    public static void main(String args[]) {
        int[] arr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100 - i;
            System.out.println(arr[i]);
        }
    }
}