package command;

import com.github.xarturino.jtb.command.Command;
import com.github.xarturino.jtb.command.StartCommand;

import static com.github.xarturino.jtb.command.CommandName.START;
import static com.github.xarturino.jtb.command.StartCommand.START_MESSAGE;

public class StartCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
