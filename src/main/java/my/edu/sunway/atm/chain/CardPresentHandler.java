package my.edu.sunway.atm.chain;

import my.edu.sunway.atm.Context;

/**
 * Implementation of handler that checks that the ATM has card
 * @author vrnsky, Haziq Morsim
 * @see BaseHandler, Handler
 */
public class CardPresentHandler extends BaseHandler {

    /**
     * Check that the current ATM has card and pass request to next
     * handler if its available
     * @param context - object that stores state of ATM
     * @return true if all operation of checking card was successfull and
     * all following handlers passed with positive results
     */
    @Override
    public boolean handle(final Context context) {
        boolean result = context.isCardPresent();
        if (nextHandler != null) {
            result = nextHandler.handle(context);
        }
        return result;
    }

    /**
     * Return a detailed message about occured erorr while proccessing
     * @return a string representing a detailed message
     */
    @Override
    public String getDetailedMessage() {
        return "The card is not present!";
    }
}
