package my.edu.sunway.atm.chain;

import my.edu.sunway.atm.Context;

public abstract class BaseHandler implements Handler {

    protected Handler nextHandler;


    public void setNext(Handler handler) {
        this.nextHandler = nextHandler;
    }

    public boolean handle(Context context) {
        if (this.nextHandler != null) {
            return nextHandler.handle(context);
        }
        return true;
    }

    public abstract String getDetailedMessage();
}
