package com.github.xarturino.jtb.command;

import com.github.xarturino.jtb.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;

import static com.github.xarturino.jtb.command.CommandName.*;

public class CommandContainer {

    private final ImmutableMap<String,Command> commandImmutableMap;
    private final Command unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService){

        commandImmutableMap = ImmutableMap.<String, Command>builder()
                .put(START.getCommandName(),new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(),new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(),new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(),new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandImmutableMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}
