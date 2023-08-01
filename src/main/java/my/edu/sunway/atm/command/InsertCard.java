package my.edu.sunway.atm.command;

import my.edu.sunway.atm.chain.Handler;

import java.util.List;

public class InsertCard extends BaseCommand implements Command {

    public InsertCard(List<Handler> handlers) {
        super(handlers);
    }

}
