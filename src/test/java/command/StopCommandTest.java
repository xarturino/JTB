package command;

import com.github.xarturino.jtb.command.Command;
import com.github.xarturino.jtb.command.StopCommand;

import static com.github.xarturino.jtb.command.CommandName.STOP;
import static com.github.xarturino.jtb.command.StopCommand.STOP_MESSAGE;

public class StopCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
