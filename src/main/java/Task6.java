public class Task6 {
    public static void getEvenDigitSum(int number) {
        int value1 = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                value1 = value1 + number % 10;
            }
            number = number / 10;
        }
        if (number < 0 && value1 == 0) {
            System.out.println(-1);
        } else {
            System.out.print("Value1 : " + value1);
        }

        }
    public static void main (String args[]){
        int number = 1234;
        getEvenDigitSum(number);
    }
}