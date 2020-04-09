public abstract class Key {

    private long p;
    private long q;
    private long n;
    private long eulersFunction;

    public Key(long p , long q) {
        this.p = p;
        this.q = q;
        n = p*q;
        eulersFunction = (p - 1)*(q - 1);

    }

    public long getP() { return p;}

    public long getQ() {
        return q;
    }

    public long getEulersFunction() {
        return eulersFunction;
    }

    public long getN() {
        return n;
    }
}
