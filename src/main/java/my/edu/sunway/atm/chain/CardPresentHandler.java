package my.edu.sunway.atm.chain;

import my.edu.sunway.atm.Context;

public class CardPresentHandler extends BaseHandler {


    @Override
    public boolean handle(final Context context) {
        boolean result = context.isCardPresent();
        if (nextHandler != null) {
            result = nextHandler.handle(context);
        }
        return result;
    }

    @Override
    public String getDetailedMessage() {
        return "The card is not present!";
    }
}
