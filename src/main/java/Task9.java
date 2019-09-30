public class Task9 {
    public static void PrintStars(int n) {
        int i, j;
        for (i=0; i<n;i++)
        {
            for (j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n =7;
        PrintStars(n);
    }
}
