package my.edu.sunway.atm.command;

import my.edu.sunway.atm.chain.Handler;

import java.util.List;

public class EjectCard extends BaseCommand implements Command {

    public EjectCard(List<Handler> handlers) {
        super(handlers);
    }

}
