package my.edu.sunway.atm.command;

import my.edu.sunway.atm.chain.Handler;

import java.util.List;

public class WithdrawMoney extends BaseCommand implements Command {

    public WithdrawMoney(List<Handler> handlers) {
        super(handlers);
    }
}
