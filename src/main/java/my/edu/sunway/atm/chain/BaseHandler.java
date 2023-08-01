package my.edu.sunway.atm.chain;

import my.edu.sunway.atm.Context;

/**
 * This basic implementation of base handler.
 * This code utilize the chain of responsibility design pattern
 */
public abstract class BaseHandler implements Handler {

    /**
     * Reference to a next handler in chain
     */
    protected Handler nextHandler;


    /**
     * Set a reference to a next handler
     * @param handler - implementation of Handler interface
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * Perform validation on context and result
     * @param context - object that stores state of ATM
     * @return true if operation valid, otherwise fale
     */
    public boolean handle(Context context) {
        if (this.nextHandler != null) {
            return nextHandler.handle(context);
        }
        return true;
    }

    /**
     * Provide a detailed description in case of error
     * @return a String represents error detailed message
     */
    public abstract String getDetailedMessage();
}
