package service.command;

import entity.User;
import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

@RequiredArgsConstructor
public class FilterByAgeOlderThanCommand implements Predicate<User> {
  private final int age;

  @Override
  public boolean test(User user) {
    return user.age() >= age;
  }
}
