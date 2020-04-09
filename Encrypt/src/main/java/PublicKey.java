import java.util.Random;

public class PublicKey extends Key {

    private long e;
    public PublicKey (long p , long q){
        super(p, q);
        e = generateE(getN() , getEulersFunction());
    }

    private long generateE(long n , long eulersFunction){
        long toReturn = 0;

        while (toReturn < 1 || ((toReturn^eulersFunction)!=(1%n))){
            Random random  = new Random();
            toReturn = random.nextLong();
        }

        return toReturn;
    }




}
