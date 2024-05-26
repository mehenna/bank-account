package com.techbanck.account.cmd.infrastructure;

import com.techbanck.cqrs.core.commads.BaseCommand;
import com.techbanck.cqrs.core.commads.CommandHandlerMethod;
import com.techbanck.cqrs.core.infrastructure.CommandDispatcher;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AccountCommandDispatcher implements CommandDispatcher {

    private final Map<Class<? extends BaseCommand>, List<CommandHandlerMethod>> routes = new HashMap<>();

    @Override
    public <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler) {
        var handlers = routes.computeIfAbsent(type, c -> new LinkedList<>());
        handlers.add(handler);
    }

    @Override
    public void sent(BaseCommand command) {
        var handlers = routes.get(command.getClass());
        if (handlers == null || handlers.size() == 0) {
            throw new RuntimeException("No command handler was registered !");
        }
        if (handlers.size() > 1) {
            throw new RuntimeException("Cannot send command to more than one handler !");
        }

        handlers.getFirst().handel(command);
    }
}
