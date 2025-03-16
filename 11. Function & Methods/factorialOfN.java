public class factorialOfN {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;

        }
        return f;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(fact(a));

    }

}
