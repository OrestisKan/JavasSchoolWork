public class PrivateKey extends Key {

    private long d;
    private long e;
    public PrivateKey (long p , long q , long e){
        super(p, q);
        this.e = e;
        d = generateD(getN() , getEulersFunction());
    }

    /**
     * Method to create D which is the decrypting key.
     * @param n p*q
     * @param eulers (p-1)*(q-1)
     * @return the cryptographic key
     */
    private long generateD(long n , long eulers) {
        return (1 / e) % eulers;
    }



}
