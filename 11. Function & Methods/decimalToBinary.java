import java.util.*;
public class decimalToBinary {
    public static int DecToBin(int DecNum){
        int pow = 0;
        int BinNum = 0;

        while(DecNum>0){
            int rem = DecNum%2;
            BinNum = BinNum + (rem* (int) Math.pow(10,pow));
            pow++;
            DecNum= DecNum/2;
        }
        return BinNum;

        }
    
    public static void main(String[] args) {
        System.out.println(DecToBin(7));
        
    }
    
}
