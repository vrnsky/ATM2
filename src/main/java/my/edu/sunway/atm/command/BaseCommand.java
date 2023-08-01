package my.edu.sunway.atm.command;

import my.edu.sunway.atm.Context;
import my.edu.sunway.atm.chain.Handler;
import my.edu.sunway.atm.dto.CommandResponse;

import java.util.List;

public abstract class BaseCommand implements Command {
    protected final List<Handler> handlers;

    public BaseCommand(List<Handler> handlers) {
        this.handlers = handlers;
    }


    public CommandResponse execute(Context context, String command) {
        for (Handler handler : handlers) {
            if (!handler.handle(context)) {
                return new CommandResponse(false, handler.getDetailedMessage());
            }
        }
        return new CommandResponse(true, "Operation performed successfully");
    }

}
