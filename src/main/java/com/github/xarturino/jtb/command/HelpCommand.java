package com.github.xarturino.jtb.command;

import com.github.xarturino.jtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.xarturino.jtb.command.CommandName.*;

public class HelpCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("<b>All my commands</b>\n\n"

                    + "<b>Start\\Stop working with bot</b>\n"
                    + "%s - start working\n"
                    + "%s - stop working\n\n"
                    + "%s - see all my commands\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
