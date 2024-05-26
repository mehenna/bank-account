package com.techbanck.account.cmd.api.command;

import com.techbanck.cqrs.core.commads.BaseCommand;
import lombok.Data;

@Data
public class DepositFundsCommand extends BaseCommand {
    private double amount;

}
