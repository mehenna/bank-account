package com.techbanck.cqrs.core.commads;

import com.techbanck.cqrs.core.messages.Message;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class BaseCommand  extends Message {

    public BaseCommand(String id){
        super(id);
    }
}
