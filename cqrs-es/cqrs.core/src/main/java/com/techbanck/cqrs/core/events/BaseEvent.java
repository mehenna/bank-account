package com.techbanck.cqrs.core.events;

import com.techbanck.cqrs.core.messages.Message;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
public  abstract class BaseEvent  extends Message {
    private int version;
}
