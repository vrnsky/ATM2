package my.edu.sunway.atm;

public class Context {

    private boolean isCardPresent;

    private long cashAvailable;
    private boolean isCashPresent;


    public Context(boolean isCardPresent, long cashAvailable, boolean isCashPresent) {
        this.isCardPresent = isCardPresent;
        this.cashAvailable = cashAvailable;
        this.isCashPresent = isCashPresent;
    }

    public boolean isCardPresent() {
        return isCardPresent;
    }

    public boolean isVerifiedCard() {
        return cashAvailable > 0;
    }

    public boolean isCashPresent() {
        return isCashPresent;
    }

    public long withdraw(long amount) {
        this.cashAvailable -= amount;
        return amount;
    }
}
