package com.github.xarturino.jtb.command;

import com.github.xarturino.jtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Hello. I'm yours Telegram Bot.";

    public StartCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),START_MESSAGE);
    }
}
