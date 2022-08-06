package com.github.xarturino.jtb.command;

import com.github.xarturino.jtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements Command{

    public static final String UNKNOWN_MESSAGE = "I really don't understand you, write /help command to see what we can do";

    private final SendBotMessageService sendBotMessageService;

    public UnknownCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),UNKNOWN_MESSAGE);
    }
}
