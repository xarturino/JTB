package command;

import com.github.xarturino.jtb.command.Command;
import com.github.xarturino.jtb.command.HelpCommand;

import static com.github.xarturino.jtb.command.CommandName.HELP;
import static com.github.xarturino.jtb.command.HelpCommand.HELP_MESSAGE;

public class HepCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
