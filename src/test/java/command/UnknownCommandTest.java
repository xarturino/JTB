package command;

import com.github.xarturino.jtb.command.Command;
import com.github.xarturino.jtb.command.UnknownCommand;

import static com.github.xarturino.jtb.command.UnknownCommand.UNKNOWN_MESSAGE;

public class UnknownCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName(){
        return "/asdasdsa";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
