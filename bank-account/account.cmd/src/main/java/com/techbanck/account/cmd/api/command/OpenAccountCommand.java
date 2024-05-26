package com.techbanck.account.cmd.api.command;

import com.techbanck.account.common.dto.AccountType;
import com.techbanck.cqrs.core.commads.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
