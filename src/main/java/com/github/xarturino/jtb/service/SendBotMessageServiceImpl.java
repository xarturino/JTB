package com.github.xarturino.jtb.service;

import com.github.xarturino.jtb.bot.JavaTelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class SendBotMessageServiceImpl implements SendBotMessageService{

    private final JavaTelegramBot javaTelegramBot;

    @Autowired
    public SendBotMessageServiceImpl(JavaTelegramBot javaTelegramBot){
        this.javaTelegramBot = javaTelegramBot;
    }

    @Override
    public void sendMessage(String chatId, String message){
        SendMessage  sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            javaTelegramBot.execute(sendMessage);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
}
