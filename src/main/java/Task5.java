public class Task5 {
    public static void main(String[] args){
        System.out.println (min(6,0,-1,1 ));
    }
    public static int min (int a, int b, int c, int d){
        return min(a, b) < min(c, d)? min(a, b):min(c, d);
    }
    public static int min (int a, int b){
        return (a<b)? a:b;
    }
}