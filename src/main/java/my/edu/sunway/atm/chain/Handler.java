package my.edu.sunway.atm.chain;

import my.edu.sunway.atm.Context;
import my.edu.sunway.atm.dto.ValidationResponse;

public interface Handler {

    void setNext(Handler handler);

    boolean handle(Context context);

    String getDetailedMessage();
}
