package com.techbanck.cqrs.core.infrastructure;

import com.techbanck.cqrs.core.commads.BaseCommand;
import com.techbanck.cqrs.core.commads.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void sent(BaseCommand command);
}