package my.edu.sunway.atm.command;

import my.edu.sunway.atm.Context;
import my.edu.sunway.atm.dto.CommandResponse;

public interface Command {

    CommandResponse execute(Context context, String command);
}
