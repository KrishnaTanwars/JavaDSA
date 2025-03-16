public class functionOverloading {
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    
    //func to cal int sum
    public static float sum(float a, float b){
        return a+b;
    }
    //func to cal float sum
    public static float sum(float a, float b, float c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,5.6f,10.5f));
        
    }
    
}
