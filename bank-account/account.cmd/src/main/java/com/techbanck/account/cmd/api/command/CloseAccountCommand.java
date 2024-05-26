package com.techbanck.account.cmd.api.command;

import com.techbanck.cqrs.core.commads.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
