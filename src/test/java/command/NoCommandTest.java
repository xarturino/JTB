package command;

import com.github.xarturino.jtb.command.Command;
import com.github.xarturino.jtb.command.NoCommand;

import static com.github.xarturino.jtb.command.CommandName.NO;
import static com.github.xarturino.jtb.command.NoCommand.NO_MESSAGE;

public class NoCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
