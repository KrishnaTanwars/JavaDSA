public class binomialCoefficient {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;

        }
        return f;
    }

    public static int bincoef(int n, int r){
        int factN = fact(n);
        int factR = fact(r);
        int factNmR = fact(n-r);
        int bincof = factN / (factNmR*factR);
        return bincof;

    }

    public static void main(String[] args) { 
        System.out.println(bincoef(5, 2));

    }

}
