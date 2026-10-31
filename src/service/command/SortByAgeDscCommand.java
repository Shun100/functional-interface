package service.command;

import entity.User;

import java.util.Comparator;

public class SortByAgeDscCommand implements Comparator<User> {
  @Override
  public int compare(User u1, User u2) {
    return Integer.compare(u2.age(), u1.age());
  }
}
