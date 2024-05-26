package com.techbanck.cqrs.core.commads;

@FunctionalInterface
public interface CommandHandlerMethod <T extends BaseCommand>{
  void handel(T command);
}
