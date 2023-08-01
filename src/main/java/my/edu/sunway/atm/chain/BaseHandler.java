package my.edu.sunway.atm.chain;

import my.edu.sunway.atm.Context;
import my.edu.sunway.atm.dto.ValidationResponse;

public class BaseHandler implements Handler {

    private Handler nextHandler;


    public void setNext(Handler handler) {
        this.nextHandler = nextHandler;
    }

    public ValidationResponse handle(Context context) {
        if (this.nextHandler != null) {
            return nextHandler.handle(context);
        }
        return new  ValidationResponse("Successfull operation");
    }
}
