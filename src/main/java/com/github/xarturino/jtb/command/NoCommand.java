package com.github.xarturino.jtb.command;

import com.github.xarturino.jtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class NoCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static final String NO_MESSAGE = "I support only commands starting with slash(/).\n" +
            "If you want to see my commands write /help";

    public NoCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),NO_MESSAGE);
    }
}
