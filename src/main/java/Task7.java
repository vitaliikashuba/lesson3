public class Task7 {
    public static void getGreatestCommonDivisor(int num1,int num2) {

        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
        if (num1<10 || num2<10){
            System.out.println(-1);
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
    }
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 121;
        getGreatestCommonDivisor(num1,num2);
    }

}