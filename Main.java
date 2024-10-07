import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        BigInteger n = new BigInteger("2");
        BigInteger suma = BigInteger.ZERO;

        for(int i=0; i<64; i++){
            BigInteger x = n.pow(i);
            suma = suma.add(x);
        }

        System.out.println(suma);
    }
}