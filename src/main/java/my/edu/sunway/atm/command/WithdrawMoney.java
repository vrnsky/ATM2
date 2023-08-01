package my.edu.sunway.atm.command;

import my.edu.sunway.atm.Context;
import my.edu.sunway.atm.chain.Handler;
import my.edu.sunway.atm.dto.CommandResponse;

import java.util.List;

public class WithdrawMoney extends BaseCommand implements Command {

    public WithdrawMoney(List<Handler> handlers) {
        super(handlers);
    }

    public CommandResponse execute(Context context, String command) {
        return null;
    }
}
